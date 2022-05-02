package application;


import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER); // Set center alignment
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5);
    pane.setVgap(5.5); // Set vGap to 5.5px
    ArrayList<String> names = new ArrayList<String>();
    // Place nodes in the pane
    pane.add(new Label("First Name:"), 0, 0);
    TextField first = new TextField();
    pane.add(first, 1, 0);
    pane.add(new Label("MI:"), 0, 1); 
    TextField middle = new TextField();
    pane.add(middle, 1, 1);
    pane.add(new Label("Last Name:"), 0, 2);
    TextField last = new TextField();
    pane.add(last, 1, 2);
    Button btAdd = new Button("Add Name");
    pane.add(btAdd, 1, 3);
    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
    btAdd.setOnAction(new EventHandler<ActionEvent>() {
    	 
        @Override
        public void handle(ActionEvent event) {
        	for (int i = 0; i < 40; ++i) System.out.println();
        	names.add(first.getText());
        	names.add(middle.getText());
        	names.add(last.getText());
        	//System.out.println(first.getText());
        	//System.out.println(middle.getText());
        	//System.out.println(last.getText());
        	for(int i=0;i<names.size();i++) {
        		System.out.println(names.get(i));
        	}
            
        }
    });
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowGridPane"); // Set the stage title
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