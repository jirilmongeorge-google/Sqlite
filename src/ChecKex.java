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
	
	public void doSomething_other(){
		System.out.println("hello world");
	}
	
//All Conflict Changes
	// Finally Local Changes can be made
}
