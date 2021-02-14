package Hello.Gradle;

import javafx.application.Application;
import javafx.stage.Stage;
import view.Sampler;

public class HelloWorld extends Application {
	
	public static void main(String[] args) throws Exception {
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		new Sampler().start(primaryStage);
	}
}