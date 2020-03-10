package com.IntrepeterPattern.Intrepeter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	Expression person1 = new TerminalExpression("Pavani"); 
    Expression person2 = new TerminalExpression("Priyanka");
    Expression isSingle = new OR(person1, person2); 
      
    Expression krishna= new TerminalExpression("Krishna"); 
    Expression committed = new TerminalExpression("Committed"); 
    Expression isCommitted = new AND(krishna, committed);     

    System.out.println(isSingle.interpreter("Pavani")); 
    System.out.println(isSingle.interpreter("Priyanka")); 
    System.out.println(isSingle.interpreter("Madeti")); 
      
    System.out.println(isCommitted.interpreter("Committed,krishna")); 
     
    }
}