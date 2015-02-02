import java.io.IOException;

//Comment
// Checking Conflict
public class ChecKex extends IOException{
//my name conflict
	public ChecKex() {
		super(); 
	}
	
	// Adding the new method
	public void doSomething(){
		System.out.println("hello world");
	}
	// Adding the new method
	public void doSomething_other(){
		System.out.println("hello world");
	}
	//Adding from Computer
	public void doSomething_other(){
		System.out.println("hello world");
	}
}
