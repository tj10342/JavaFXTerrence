package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestProblem1 extends Application {
	
	@Override
	public void start(Stage primaryStage)  {
		Button sign = new Button("Sign in");
		TextField user = new TextField();
		TextField pass = new TextField();
		Label username = new Label("User Name:");
		Label password = new Label("Password:");
		Text welcome = new Text();
		Font font = Font.font(24);
		welcome.setFont(font);
		welcome.setText("Welcome"); 
	      
	      GridPane pane = new GridPane();
	      pane.setHgap(5);
	      pane.setVgap(5);
	      
	      pane.add(welcome, 0, 0);
	      pane.add(username,0,1);
	      pane.add(password,0,2);
	      pane.add(user,1,1);
	      pane.add(pass,1,2);
	      pane.add(sign,1,4);
	      
	      pane.setAlignment(Pos.CENTER);
	      GridPane.setHalignment(welcome, HPos.LEFT);
	      GridPane.setHalignment(username, HPos.LEFT);
	      GridPane.setHalignment(password, HPos.LEFT);
	      GridPane.setHalignment(user, HPos.RIGHT);
	      GridPane.setHalignment(pass, HPos.RIGHT);
	      GridPane.setHalignment(sign, HPos.RIGHT);
		
	      Scene scene = new Scene(pane, 300, 300);
	    primaryStage.setTitle("JavaFx Welcome"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}

}
