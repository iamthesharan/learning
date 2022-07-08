import { Component } from "./base-component";
import { Autobind } from "../decorators/autobind";
import { projectStateInstance } from "../state/project-state";
import {Validatable, validate} from "../util/validation";
export class ProjectInput extends Component<HTMLDivElement, HTMLElement>{
    titleElement:HTMLInputElement;
    descriptionElement:HTMLInputElement;
    peopleElement:HTMLInputElement;
    constructor(){
        super('project-input','app', true, 'user-input');
        this.titleElement=this.element.querySelector('#title')! as HTMLInputElement;
        this.descriptionElement=this.element.querySelector('#description')! as HTMLInputElement;
        this.peopleElement=this.element.querySelector('#people')! as HTMLInputElement;
        this.configure();
        this.renderContent();
    }
    configure(){
        this.element.addEventListener('submit',this.submitHandler);
    }
    renderContent(){

    }
    @Autobind
    submitHandler(event:Event){
        event.preventDefault();
        const userInput=this.getUserInput();
        if(Array.isArray(userInput)){
            const [title,description,people]=userInput;
            projectStateInstance.addProjects(title, description,+people);
            this.clearContent();
        }
    }
    
    
    getUserInput():[string, string, number] | void{
        const title=this.titleElement.value;
        const description=this.descriptionElement.value;
        const people=this.peopleElement.value;
        const titleValidatable:Validatable={
            value:title,
            required:true
        }
        const descriptionValidatable:Validatable={
            value:description,
            required:true,
            minLength:1
        }
        const peopleValidatable:Validatable={
            value:+people,
            required:true,
            min:1,
            max:5
        }
        if(!validate(titleValidatable) || !validate(descriptionValidatable) || !validate(peopleValidatable)){
            alert("Please Enter the Correct Input!!");
            return;
        }
        return [title, description, +people];

    }
    clearContent(){
        this.titleElement.value="";
        this.descriptionElement.value="";
        this.peopleElement.value="";
    }
}
