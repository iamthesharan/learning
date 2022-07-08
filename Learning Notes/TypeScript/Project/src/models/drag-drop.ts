
export interface Draggable{
    dragStartHandler(event:DragEvent):void;
    dragEndHandler(even:DragEvent):void;
}
export interface DragTarget{
    dragOverHandler(event:DragEvent):void;// Is a valid Drag
    dropHandler(event:DragEvent):void;
    dragLeaveHandler(event:DragEvent):void;
}