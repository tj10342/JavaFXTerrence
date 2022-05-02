package application;



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

public class LoanCalculator extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER); // Set center alignment
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5);
    pane.setVgap(5.5); // Set vGap to 5.5px
    
    pane.add(new Label("Annual INterest Rate:"), 0, 0);
    TextField rate = new TextField();
    pane.add(rate, 1, 0);
    
    pane.add(new Label("Number of years:"), 0, 1); 
    TextField years = new TextField();
    pane.add(years, 1, 1);
    
    pane.add(new Label("Loan Amount:"), 0, 2);
    TextField Amount = new TextField();
    pane.add(Amount, 1, 2);
    
    pane.add(new Label("Monthly payment:"), 0, 3);
    TextField month = new TextField();
    pane.add(month, 1, 3);
    month.setEditable(false);
    
    pane.add(new Label("Total payment:"), 0, 4);
    TextField total = new TextField();
    pane.add(total, 1, 4);
    total.setEditable(false);

    
    Button button = new Button("calculate payments");
    pane.add(button, 1, 5);
    GridPane.setHalignment(button, HPos.RIGHT);
    
    /* Button button2 = new Button("Exit");
    pane.add(button2,0,5);
    GridPane.setHalignment(button2, HPos.LEFT);
    
    button2.setOnAction(new EventHandler<ActionEvent>() {
    	 @Override
         public void handle(ActionEvent event) {
    		 primaryStage.close();
    	 }
    });*/
    
   // button.setOnAction(new EventHandler<ActionEvent>() {
    
    //~~a different way using inner class
    	button.setOnAction( e ->{ //lambda expression
    //new EventHandler<ActionEvent>() {
    	//~~
       // @Override
        //public void handle(ActionEvent event) {
        	double monthly=0,totals=0;
        	double rateD=0, amountD=0;
        	int yearsI=0;
        	rateD = Double.parseDouble(rate.getText());
        	 amountD =Double.parseDouble(Amount.getText());
        	 yearsI = Integer.parseInt(years.getText());
        	monthly = (amountD * (rateD/1200)) / (1 -
        		      (1 / Math.pow(1 + (rateD/1200), yearsI * 12)));
        	totals = monthly * yearsI * 12;
        	
        	//String totalString = Double.toString(totals);  
        	//String monthlyString = Double.toString(monthly);
        	
        	total.setText(String.format("$%.2f",
        			totals));
        	month.setText(String.format("$%.2f",
        			monthly));
            
         //}
    }); 
    	
    
    
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Calculate loan"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  

  public static void main(String[] args) {
    launch(args);
    
    
  }
} 