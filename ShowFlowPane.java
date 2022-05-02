package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
  @Override
  public void start(Stage primaryStage) {
    
    FlowPane pane = new FlowPane();
    pane.setPadding(new Insets(11, 12, 13, 14));
    pane.setHgap(5); 
    pane.setVgap(5);

    
    pane.getChildren().addAll(new Label("First Name:"), 
      new TextField(), new Label("MI:"));
    TextField tfMi = new TextField();
    tfMi.setPrefColumnCount(1);
    TextField tfln = new TextField();
    // tfln.setPrefColumnCount(10);
    System.out.println(tfln.getText());
    pane.getChildren().addAll(tfMi, new Label("Last Name:"), tfln);
    		// new TextField());
    		
     
    
    
    Scene scene = new Scene(pane, 400, 250);
    primaryStage.setTitle("User input"); 
    primaryStage.setScene(scene); 
    primaryStage.show();
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}