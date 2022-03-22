//Notes 1



package InnerClasses;

/*
Note* If the existence of Object-2 is Dependent on Other Object-1 ie Without
the presence of  that Object-1 the Object-2 can't exist.
*/

// Example-1
class University { // Outer Class 
	class Department{ // Inner Class
		// Witout University, Department can't Exist.
        
	}
}

// Example-2

class Car{
	class Engine{
		/*
		 * Without Car Engine Can't Exist. That's Why We have to 
		 * Declare Engine Class inside Car Class
		 */	
	}
}


//Example - 3
/*
	Map 
	-------------------
	|		Key	| U		|
	|-------------------|
	|	1		|	X	|
	|-------------------|
	|	2		|	Y	|
	|-------------------|
	|	3		|	Z	|
	-------------------
	
	Without the existence of map object The Entry Can't Exist
	One key pair value is called Entry.
*/

interface Map{ // Outer Interface
	// Map is a Group of Key Value Pairs
	
	interface Entry{ //Inner Interface
		// Each key Value Pair is Called Entry.
		
		/*
		 * Without Existing Map Object, There is no Chance of Existing Entry Object.
		 * Hence Interface Entry Is defined inside Map Interface
		 */
		
		
	}
}
/*
 * Without Existing Outer Class Object, There is no chance of existing inner Class Object
 * 
 * 1) Without Existing University Object, there is no chance of Existing Department Object.
 * 2) Without Existing Car Object, There is no chance of existing Engine Class Object.
 * 
 */

/*
 * Q) What is the Relation Between Inner Classes and Outer Classes?
 * 
 * Ans) There is has-a Relationship.
 * 		Car has an Engine
 * 		University has a Department.
 * 		
 * 		Has-a Relation is called Composition or Aggregation. 
 */





//-----------------------------------------------------------------------------------------------





/*
 * Based On Behaviour and Position of Declaration, 
 * all inner classes are divided into:
 * 
 * 	1) Normal Or Regular Inner Class
 * 	2) Method Local Inner Classes - Inside Method
 * 	3) Anonymous inner Classes - Nameless Class
 * 	4) Static Nested Classes  - Static Modifier
 */

// ----------------------------------------------------------------------------



/*
 * 1) Normal or Regular Inner Class  -  If We are naming any class immediate inside a class without 
 * 										Static modifier.
 * 
 */

class Outer{
	class Inner {
		/*
		 * Normal Or Regular Inner Class
		 * 
		 * when we provide javac outer.java, then two class files are generated
		 * 		1) outer.class
		 * 		2) outer$inner.class
		 */
	}
}
/*
	 * Note* You Can't Touch Directly the inner class. So No static members 
	 * are allowed inside the inner class.
	 * 
	 * Inner class Always Talks about instance terminology
	 * 
	 * 
	 * 
	 * Scenario -1
	 * class outer{
	 * 		class Inner{
	 * 			
	 * 		}
	 * 		public static void main(String ...args){
	 * 			System.out.println("Outer Class");
	 * 		}
	 * }
	 * 
	 * On javac outer.java
	 * java outer  - this will compile and run
	 * Output - Outer Class
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Scenario -2
	 * 
	 * class Outer{
	 * 		class Inner{
	 * 			public static void main(String ...args){
	 * 				System.out.println("Inner Class");
	 * 			} 	
	 * 		}
	 * }
	 * 
	 * On javac Outer.java
	 * Note* Compilation Error
	 * Inner class Always Talks about instance terminology - It Can be accessed
	 *  													 by Outer Class Object 
	 * You can't Invoke Inner Class directly from cmd.
	 * compiler Error: Inner Class can't be accessed from static context
	 * also we cannot put any static members in inner classes.
	 * 
	 * The reason why inner classes cannot have static members is because 
	 * static members are usually instantiated when the program starts. 
	 * However, an inner class depends on having an instance of its enclosing 
	 * class in order to create it and then access it's members. So the decision 
	 * to not have static members for an inner class makes sense due to this dependency. 
*/



//-----------------------------------------------------------------------------------------------

/*
 * Case 1	--->	Accessing Inner Class Code from Outer Class
 *
 *
 * 		class Outer{ 
 * 			class Inner{
 * 				public void m1(){
 * 					System.out.println("Inner Class");
 * 			}
 * 			public static void main(String ...args) {
 * 				//So now Create an Object Of Outer Class to Access the inner class
 * 					Outer o=new Outer();
 * 					Outer.Inner i=o.new Inner();
 * 					i.m1();
 * 								or
 * 					 
 * 					Outer.Inner i=new Outer().new Inner().m1();
 * 				
 * 			} 
 * 		}
 * 
 * Case 2	---> Accessing Inner Class Code from Instance area of Outer Class but Not Static Area.
 * 		
 * 		class Outer {
 * 			class Inner{
 * 				public void m1(){
 * 					System.out.println("Inner Class M1 Method");
 * 				}
 * 			}
 * 			public void m2(){
 * 				Inner i=new Inner();
 * 				i.m1();
 * 				// Already Created Outer Class Object in Main;
 * 			}
 * 			public static void main(String ...args){
 * 				Outer O=new Outer();
 * 				//For Calling M2	
 * 			}
 * 		}
 * 
 * 
 * Case 3	---> Accessing the inner class method from Outside the Outer Class this case is similar to Case1
 * 
 * 		class Outer{
 * 			class Inner{
 * 				System.out.println("Inner Class Method");
 * 			}
 * 		}
 * 		class test{
 * 			public static void main(String ...args){
 * 				Outer O=new Outer();
 * 				Outer.Inner i=O.new Inner();
 * 				i.m2();		
 * 			}
 * 		}
 */




/*
 * 	Summary
 * 	
 * 					Accessing Inner Class Code  from
 * 						/					\
 * 					   /					 \
 * 					  /						  \
 * 		1) Static Area of Outer Class 		2)From Outside the Outer Class
 * 	
 * 
 * 			Outer O=new Outer();
 * 			Outer.Inner i=new O.new Inner();
 * 			i.method();
 * 
 * 
 * 			3) From Instance Area
 * 
 *  			Inner i=new Inner();
 *  			i.method();	
 */