package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Ejer on 02-10-2017.
 */
public class AddMovie {
    Label label = new Label("Film oversigt");
    Label labelMovie = new Label("Vælg film");
    Label labelSal = new Label("Vælg sal");
    Label labelTime = new Label("Tidspunkt");
    BorderPane borderPane = new BorderPane();

    TableView tableView1 = new TableView();


    TableColumn tableColumn1 = new TableColumn("Film navn");
    TableColumn tableColumn2 = new TableColumn("Længde på film");
    TableColumn tableColumn3 = new TableColumn("Genre");

    ComboBox comboBoxMovie = new ComboBox();
    ComboBox comboBoxSal = new ComboBox();
    ComboBox comboBoxTime = new ComboBox();


    VBox vBoxTable = new VBox();
    VBox vBoxCombo = new VBox();
    HBox hBox = new HBox();
    Button buttonAdd = new Button("Tilføj film");
    Button buttonBack = new Button("Tilbage");

    public AddMovie() {
        vBoxCombo.getChildren().addAll(labelMovie,comboBoxMovie,labelSal,comboBoxSal,labelTime,comboBoxTime);
        borderPane.setLeft(vBoxCombo);
        hBox.getChildren().addAll(buttonAdd,buttonBack);
        borderPane.setPadding(new Insets(50));
        vBoxTable.getChildren().addAll(label,tableView1,hBox);
        borderPane.setRight(vBoxTable);
        tableSetup();
        setSize();
        buttonClick();
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }
    private void tableSetup(){
        tableView1.getColumns().addAll(tableColumn1,tableColumn2,tableColumn3);
        tableColumn1.setPrefWidth(200);
        tableColumn3.setPrefWidth(160);
        tableView1.setPrefSize(400,400);
    }
    private void setSize(){
        comboBoxMovie.setPrefSize(200,100);
        comboBoxSal.setPrefSize(200,100);
        comboBoxTime.setPrefSize(200,100);
        vBoxCombo.setSpacing(100);
        vBoxTable.setSpacing(100);
        buttonAdd.setPrefSize(200,100);
        buttonBack.setPrefSize(200,100);
    }
    private void buttonClick(){
        Stage primaryStage = new Stage();
        buttonBack.setOnAction(event -> {
            Menu menu = new Menu();
            Scene scene = new Scene(menu.getBorderPane(),1200,800);
            primaryStage.setScene(scene);
            primaryStage.show();
        });
    }
}
