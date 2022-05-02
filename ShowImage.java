package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImage extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	    // Create a pane to hold the image views
	    Pane pane = new HBox(10);
	    pane.setPadding(new Insets(5, 5, 5, 5));
	    Image image = new Image("C:\\Users\\tj10342\\Desktop\\trashcan-animation-random.gif");
	  
	    pane.getChildren().add(new ImageView(image));
	    Image image2 = new Image("C:\\Users\\tj10342\\Desktop\\everything-is-fine-itsfine.gif");
	    ImageView imageView2 = new ImageView(image2);
	    imageView2.setFitHeight(500);
	    imageView2.setFitWidth(500);
	    pane.getChildren().add(imageView2);   

	    ImageView imageView3 = new ImageView(image);
	    imageView3.setRotate(90);
	    pane.getChildren().add(imageView3);    
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("random gif"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  
	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }
	}