import java.util.ArrayList;
import java.util.Scanner;

class myStack extends ArrayList{
	
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public int getSize(){
		return super.size();
	}
	
	public String peek(){
		return (String)super.get(getSize() - 1);
	}
	
	public String pop(){
		String o = (String)super.get(getSize() - 1);
		super.remove(this.getSize() - 1);
		return o;
	}
	
	public void push(String o){
		super.add(o);
	}
	
	public void printString(){
		String[] a = new String[5];
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter 5 strings");
	
		for(int x = 0 ; x < 5 ; x++){
			a[x] = input.next();
			push(a[x]);
		}

		for(int x = 1 ; x <= 5 ; x++){
			System.out.print(pop() + " ");
		}
	}
	
	@Override
	public String toString(){
		return "Stack: " + super.toString();
	}
}

public class testMyStack{

	public static void main(String args[]){
	
		myStack myStack = new myStack();
		myStack.printString();
		
		
	}
}
