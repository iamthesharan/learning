import {Project, ProjectStatus} from '../models/project';
type Listener<T>=(items:T[])=>void;
abstract class State<T>{
    listeners:Listener<T>[]=[];
    constructor(){}
    addListener(listenerFn:Listener<T>){
        this.listeners.push(listenerFn);
    }
}
export class ProjectState extends State<Project>{
    private projects:Project[]=[];
    static projectStateInstance:ProjectState;
    private constructor(){
        super();
    }
    static getProjectStateInstance(){
        if(this.projectStateInstance){
            return this.projectStateInstance;
        }
        this.projectStateInstance=new ProjectState();
        return this.projectStateInstance;
    }
    addProjects(title:string, description:string, people:number){
        const newProject:Project={
            id:Math.random().toString(),
            title:title,
            description:description,
            people:people,
            projectStatus:ProjectStatus.ACTIVE
        }
        this.projects.push(newProject);
        this.updateListeners();
    }
    moveProject(projectId:string, newStatus:ProjectStatus){
        const project=this.projects.find(prj => prj.id === projectId);
        if(project && project.projectStatus!==newStatus){
            project.projectStatus=newStatus;
            this.updateListeners();
        }

    }
    private updateListeners(){
        for(const listener of this.listeners){
            listener(this.projects.slice());
        }
    }
}
export const projectStateInstance=ProjectState.getProjectStateInstance();