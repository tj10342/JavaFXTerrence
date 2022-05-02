package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
  @Override 
  public void start(Stage primaryStage) {
    
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
    Button btOK = new Button("OK");
    Button btCancel = new Button("Cancel");
    OkHandlerClass handler1 = new OkHandlerClass();
    btOK.setOnAction(handler1);
    CancelClass handler2 = new CancelClass();
    btCancel.setOnAction(handler2);
    pane.getChildren().addAll(btOK, btCancel);
    newhandle handler3 = new newhandle();
    keyboardHandle handler4 = new keyboardHandle();
    
    
    
    Scene scene = new Scene(pane);
    scene.setOnMousePressed(handler3);
    scene.setOnKeyPressed(handler4);
    
    primaryStage.setTitle("HandleEvent"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
    
  }


  public static void main(String[] args) {
    launch(args);
  }
} 

class OkHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("OK button clicked"); 
  }
}

class CancelClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
  }
}
class newhandle implements EventHandler<MouseEvent>  {
	  @Override
	  public void handle(MouseEvent e) {
		  
	    System.out.println("mouse  clicked");
	   double x= e.getX();
	    double y = e.getY();
	    Circle circle = new Circle(2);
	    
	  }

	public Circle createCircle(double x, double y) {
		Circle circle = new Circle(2);
		return circle;
		
		
	}
	}
class keyboardHandle implements EventHandler<KeyEvent> {
	  @Override
	  public void handle(KeyEvent e) {
	    System.out.println("key pressed  ");
	  }
	}
