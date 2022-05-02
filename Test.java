package application;

import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Test extends Application {
public Test() {
	System.out.println("Test is onvoked");
}
	

	@Override
	public void start(Stage arg0)   {
		String [] names = {"Bugs", "Daffy", "Porky"};
		System.out.println(names[3]);
		
		
	}
	public static void main(String[] args) {
		System.out.println("launch app");
		Application.launch(args);

	}

}
