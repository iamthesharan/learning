import {Draggable}from '../models/drag-drop';
import { Component } from './base-component';
import { Project } from '../models/project';
import { Autobind } from '../decorators/autobind';
export class ProjectItem extends Component<HTMLUListElement, HTMLLIElement> implements Draggable{
    private project:Project;
    constructor(hostId:string, project:Project){
        super('single-project',hostId, false, project.id);
        this.project=project;
        this.configure();
        this.renderContent();
    }
    get getPerson(){
        if(this.project.people===1){
            return `1 Person`;
        }
        return `${this.project.people} Persons`;
    }
    
    configure(){
        this.element.addEventListener('dragstart',this.dragStartHandler);
        this.element.addEventListener('dragstart',this.dragEndHandler);

    }
    renderContent(){
        this.element.querySelector('h2')!.textContent=this.project.title;
        this.element.querySelector('h3')!.textContent=this.getPerson+" Assigned";
        this.element.querySelector('p')!.textContent=this.project.description;
    }
    @Autobind
    dragStartHandler(event:DragEvent){
        event.dataTransfer!.setData('text/plain', this.project.id);
        event.dataTransfer!.effectAllowed="move";// tells how to change the coursor
    }
    @Autobind
    dragEndHandler(_:DragEvent){}
}