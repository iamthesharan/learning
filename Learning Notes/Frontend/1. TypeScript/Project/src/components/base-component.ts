export abstract class Component<T extends HTMLElement, U extends HTMLElement>{
    templateElement:HTMLTemplateElement;
    hostElement:T;
    element:U;
    constructor(templateElementId:string, hostElement:string, insertAtBegining:boolean, newElementId?:string){
        this.templateElement=document.getElementById(templateElementId)! as HTMLTemplateElement;
        this.hostElement=document.getElementById(hostElement)! as T;
        const importNode=document.importNode(this.templateElement.content, true);
        this.element=importNode.firstElementChild as U;
        if(newElementId){
            this.element.id=newElementId;
        }
        this.attach(insertAtBegining);
    }
    private attach(insertAtBegining:boolean){
        this.hostElement.insertAdjacentElement(insertAtBegining ? 'afterbegin' : 'beforeend',this.element);
    }
    abstract configure():void;
    abstract renderContent(): void;

}
