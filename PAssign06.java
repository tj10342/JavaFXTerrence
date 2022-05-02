package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PAssign06 extends Application{
private Button bt1 = new Button("1");
private Button bt2 = new Button("2");
private Button bt3 = new Button("3");
private Button bt4 = new Button("4");
private Button bt5 = new Button("5");
private Button bt6 = new Button("6");
private Button bt7 = new Button("7");
private Button bt8 = new Button("8");
private Button bt9 = new Button("9");
private Button bt0 = new Button("0");
private Button btAsterik = new Button("*");
private Button btPound = new Button("#");
@Override
public void start(Stage primaryStage) {
Font font = Font.font(24);
TextField entry = new TextField();
bt1.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("1");
}
});
bt2.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("2");
}
});
bt3.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("3");
}
});
bt4.setOnAction(new EventHandler<ActionEvent>() {
@Override

public void handle(ActionEvent event) {
System.out.print("4");
}
});
bt5.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("5");
}
});
bt6.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("6");
}
});
bt7.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("7");
}
});
bt8.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("8");
}
});
bt9.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("9");
}
});
bt0.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("0");
}
});
btAsterik.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.print("*");
}
});
btPound.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {

System.out.print("#");
}
});

bt1.setFont(font);
bt2.setFont(font);
bt3.setFont(font);
bt4.setFont(font);
bt5.setFont(font);
bt6.setFont(font);
bt7.setFont(font);
bt8.setFont(font);
bt9.setFont(font);
bt0.setFont(font);
btAsterik.setFont(font);
btPound.setFont(font);
GridPane gridPane = new GridPane();
gridPane.setHgap(5);
gridPane.setVgap(5);
gridPane.add(bt1, 0, 0);
gridPane.add(bt2, 1, 0);
gridPane.add(bt3, 2, 0);
gridPane.add(bt4, 0, 1);
gridPane.add(bt5, 1, 1);
gridPane.add(bt6, 2, 1);
gridPane.add(bt7, 0, 2);
gridPane.add(bt8, 1, 2);
gridPane.add(bt9, 2, 2);
gridPane.add(bt0, 1, 3);
gridPane.add(btAsterik, 0, 3);
gridPane.add(btPound, 2, 3);

gridPane.setAlignment(Pos.CENTER);
GridPane.setHalignment(bt1, HPos.LEFT);
GridPane.setHalignment(bt2, HPos.CENTER);
GridPane.setHalignment(bt3, HPos.RIGHT);
GridPane.setHalignment(bt4, HPos.LEFT);
GridPane.setHalignment(bt5, HPos.CENTER);
GridPane.setHalignment(bt6, HPos.RIGHT);
GridPane.setHalignment(bt7, HPos.LEFT);
GridPane.setHalignment(bt8, HPos.CENTER);
GridPane.setHalignment(bt9, HPos.RIGHT);
GridPane.setHalignment(bt0, HPos.CENTER);
GridPane.setHalignment(btAsterik, HPos.LEFT);
GridPane.setHalignment(btPound, HPos.RIGHT);
GridPane.setHalignment(entry, HPos.CENTER);
Scene scene = new Scene(gridPane, 250, 250);
primaryStage.setTitle("Phone keypad");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}