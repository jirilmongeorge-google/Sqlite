import java.io.IOException;

public class ChecKex extends IOException{
//my name conflict
	public ChecKex() {
		super(); 
	}

	public void doSomething(){
		System.out.println("hello world");
	}
	
	public void doSomething_other(){
		System.out.println("hello world");
	}
	// Index 1
	// Index 2
}
