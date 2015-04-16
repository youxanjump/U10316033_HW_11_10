import java.util.ArrayList;
import java.util.Scanner;

class myStack extends ArrayList{//class myStack extends class ArrayList 
	
	public boolean isEmpty(){
		return super.isEmpty();//a method type boolean return it's super class's method
	}
	
	public int getSize(){
		return super.size();//a method type int return it's super class's method to get the array size
	}
	
	public String peek(){
		return (String)super.get(getSize() - 1);//a method to get the substance of array
	}
	
	public String pop(){
		String o = (String)super.get(getSize() - 1);//a method to get the substance of array
		super.remove(this.getSize() - 1);//and remove the last substance of array
		return o;
	}
	
	public void push(String o){
		super.add(o);//a method to add substance
	}
	
	public void printString(){//a method to let user type 5 strings and print them counter
		String[] a = new String[5];//create a String array
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter 5 strings");
	
		for(int x = 0 ; x < 5 ; x++){
			a[x] = input.next();
			push(a[x]);//let array a to join ArrayList
		}

		for(int x = 1 ; x <= 5 ; x++){
			System.out.print(pop() + " ");//print them
		}
	}
	
	@Override
	public String toString(){
		return "Stack: " + super.toString();//override toString
	}
}

public class testMyStack{

	public static void main(String args[]){
	
		myStack myStack = new myStack();
		myStack.printString();//call printString
		
		
	}
}
