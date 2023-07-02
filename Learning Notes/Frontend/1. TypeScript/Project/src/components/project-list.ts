import { Component } from "./base-component";
import { Project, ProjectStatus } from "../models/project";
import { DragTarget } from "../models/drag-drop";
import { projectStateInstance } from "../state/project-state";
import { Autobind } from "../decorators/autobind";
import { ProjectItem } from "./project-item";


export class ProjectList extends Component<HTMLDivElement, HTMLElement> implements DragTarget{
    assignedProjects:Project[];
    constructor(private type:'active' | 'finished'){
        super('project-list','app',false,`${type}-projects`);
        this.assignedProjects=[];
        this.configure();
        this.renderContent();
    }
    configure(){
        this.element.addEventListener('dragover', this.dragOverHandler);
        this.element.addEventListener('dragleave', this.dragLeaveHandler);
        this.element.addEventListener('drop', this.dropHandler);

        projectStateInstance.addListener((projects:Project[])=>{
            const relevantProject=projects.filter(project=>{
                if(this.type=='active')
                    return project.projectStatus===ProjectStatus.ACTIVE;
                return project.projectStatus===ProjectStatus.FINISHED;
            });
            this.assignedProjects=relevantProject;
            this.renderProjects();
        });
    }
    renderContent(){
        const listId=`${this.type}-project-list`;
        this.element.querySelector('ul')!.id=listId;
        this.element.querySelector('h2')!.innerText=this.type.toUpperCase()+" PROJECTS";
    }
    renderProjects(){
        const listEl=document.getElementById(`${this.type}-project-list`)! as HTMLUListElement;
        listEl.innerHTML="";
        for(const projectItem of this.assignedProjects){
            new ProjectItem(this.element.querySelector('ul')!.id,projectItem);
        }

    }
    @Autobind
    dragOverHandler(event:DragEvent){
        event.preventDefault();// this will activate the drop event
        if(event.dataTransfer && event.dataTransfer.types[0]==='text/plain'){
            const listEl=this.element.querySelector('ul')!;
            listEl.classList.add('droppable');
        }
    }
    @Autobind
    dropHandler(event :DragEvent){
        const projId=event.dataTransfer!.getData('text/plain');
        projectStateInstance.moveProject(projId, this.type==='active'?ProjectStatus.ACTIVE:ProjectStatus.FINISHED);
        
    }
    @Autobind
    dragLeaveHandler(_2:DragEvent){
        const listEl=this.element.querySelector('ul')!;
        listEl.classList.remove('droppable');


    }
}
