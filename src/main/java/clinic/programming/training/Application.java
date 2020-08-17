package clinic.programming.training;

public class Application {
	public void helloworld(){
		System.out.println("Hi i am Surekha");
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}