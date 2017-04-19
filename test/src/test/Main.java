package test;

public class Main {
	
	static void method(int i){
		System.out.println("Method" + i);
	}
	
	public static void main(String args[]){
		
		int i=0;
		
		System.out.println(i);
		method(i++); 
		System.out.println(i);
		method(++i); 
		System.out.println(i);
	}
	
	
}
