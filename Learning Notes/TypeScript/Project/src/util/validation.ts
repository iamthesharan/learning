export interface Validatable{
    value:string |number;
    required:boolean;
    minLength?:number;
    maxLength?:number;
    min?:number;
    max?:number;
}

export function validate(fieldValidatableObject:Validatable){
    let isValid=true;
    if(fieldValidatableObject.required)
        isValid=isValid && fieldValidatableObject.value.toString().trim().length!=0;
    if(fieldValidatableObject.minLength!=null && typeof fieldValidatableObject.value==='string')
        isValid=isValid && fieldValidatableObject.value.length>=fieldValidatableObject.minLength;
    if(fieldValidatableObject.maxLength!=null && typeof fieldValidatableObject.value==='string')
        isValid=isValid && fieldValidatableObject.value.length<=fieldValidatableObject.maxLength;
    if(fieldValidatableObject.min!=null && typeof fieldValidatableObject.value==='number')
        isValid=isValid && fieldValidatableObject.value>=fieldValidatableObject.min;
    if(fieldValidatableObject.max!=null && typeof fieldValidatableObject.value==='number')
        isValid=isValid && fieldValidatableObject.value<=fieldValidatableObject.max;

    return isValid;
}
