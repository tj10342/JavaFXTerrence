package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class MultiplePanes extends Application {

@Override
public void start(Stage primaryStage) {
StackPane root = new StackPane();
Button btn1 = new Button(" 1 ");
Button btn2 = new Button("22222222");
root.getChildren().addAll(btn2, btn1);
root.setStyle("-fx-background-color: #87CEFA;");
GridPane grid = new GridPane();
grid.setPadding(new Insets(10, 10, 10, 10));
grid.setMinSize(300, 300);
grid.setVgap(5);
grid.setHgap(5);
Text username = new Text("Username:");
grid.add(username, 0, 0);
TextField text = new TextField();
text.setPrefColumnCount(10);
grid.add(text, 1, 0);
Text password = new Text("Password:");
grid.add(password, 0, 1);
TextField text2 = new TextField();
text2.setPrefColumnCount(10);
grid.add(text2, 1, 1);
grid.setStyle("-fx-background-color: #D8BFD8;");
FlowPane flow = new FlowPane();
flow.setPadding(new Insets(10, 10, 10, 10));
flow.setStyle("-fx-background-color: DAE6F3;");
flow.setHgap(5);
Button left = new Button(" left ");
Button center = new Button(" center ");

flow.getChildren().addAll(left, center);
Button top = new Button(" top ");
TilePane tile = new TilePane();
tile.setPadding(new Insets(10, 10, 10, 10));
tile.setPrefColumns(2);
tile.setStyle("-fx-background-color: #CD5C5C;");
HBox hbox2 = new HBox(8); // spacing = 8
hbox2.getChildren().addAll(top, left, center);
tile.getChildren().add(hbox2);
AnchorPane anchorpane = new AnchorPane();
Button buttonSave = new Button("Save");
Button buttonCancel = new Button("Cancel");
anchorpane.setStyle("-fx-background-color: #A9A9A9;");
HBox hb = new HBox();
hb.getChildren().addAll(buttonSave, buttonCancel);
anchorpane.getChildren().addAll(hb);
anchorpane.setMinSize(300, 100);
AnchorPane.setRightAnchor(hb, 10.0);
BorderPane pane = new BorderPane();
pane.setLeft(anchorpane);
pane.setCenter(root);
pane.setRight(grid);
pane.setTop(flow);
pane.setBottom(tile);
Scene scene = new Scene(pane, 300, 250);

primaryStage.setTitle("multi panes");
primaryStage.setScene(scene);
primaryStage.show();

}

public static void main(String[] args) {
launch(args);
}
}