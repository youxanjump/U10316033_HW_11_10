# U10316033_HW_11_10
修改範例程式11.10，利用現有方法及繼承ArrayList，倒著print出字串

import java.util.ArrayList;
import java.util.Scanner;

class myStack{
	private ArrayList<String> list = new ArrayList<>();
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int getSize(){
		return list.size();
	}
	
	public String peek(){
		return list.get(getSize() - 1);
	}
	
	public String pop(){
		String o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public void push(String o){
		list.add(o);
	}
	
	public void printString(){
		String[] a = new String[5];
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter 5 strings");
	
		for(int x = 0 ; x < 5 ; x++){
			a[x] = input.next();
			this.push(a[x]);
		}

		for(int x = 1 ; x <= 5 ; x++){
			System.out.print(this.pop() + " ");
		}
	}
	
	@Override
	public String toString(){
		return "Stack: " + list.toString();
	}
}

public class testMyStack{

	public static void main(String args[]){
	
		myStack myStack = new myStack();
		myStack.printString();
		
		
	}
}
