package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
	
	public void greet(){
	List<String> list =new ArrayList<>();
	list.add("Hello");
		for(String l: list){
			System.out.println("Greeting: "+l);
		}
			
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }
}