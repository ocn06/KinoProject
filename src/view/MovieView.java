package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.stage.Stage;

/**
 * Created by Ejer on 03-10-2017.
 */
public class MovieView {
    Label labelName = new Label("Film navn");
    Label labelGenre = new Label("Genre");
    Label labelTime = new Label("Tid på film");
    Label labelPeriode = new Label("Periode");

    Button buttonAdd = new Button("Tilføj film");
    Button buttonRemove = new Button("Fjern film");
    Button buttonBack = new Button("Tilbage");

    TextField textFieldName = new TextField();
    ComboBox comboBoxGenre = new ComboBox();
    TextField textFieldTime = new TextField();
    TextArea textAreaPeriode = new TextArea();

    BorderPane borderPane = new BorderPane();

    VBox vBoxName = new VBox();
    VBox vBoxGenre = new VBox();
    VBox vBoxTime = new VBox();
    VBox vBoxPeriode = new VBox();
    VBox vBoxComplete = new VBox();
    HBox hBoxButton = new HBox();

    public MovieView() {

        vBoxName.getChildren().addAll(labelName,textFieldName);
        vBoxGenre.getChildren().addAll(labelGenre,comboBoxGenre);
        vBoxTime.getChildren().addAll(labelTime,textFieldTime);
        vBoxPeriode.getChildren().addAll(labelPeriode,textAreaPeriode);
        hBoxButton.getChildren().addAll(buttonAdd,buttonRemove,buttonBack);
        vBoxComplete.getChildren().addAll(vBoxName,vBoxGenre,vBoxTime,vBoxPeriode,hBoxButton);
        borderPane.setLeft(vBoxComplete);
        borderPane.setPadding(new Insets(50));
        setSize();
        buttonClick();
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }
    private void setSize(){
        vBoxComplete.setSpacing(50);
        hBoxButton.setSpacing(400);
        buttonAdd.setPrefSize(100,100);
        buttonRemove.setPrefSize(100,100);
        comboBoxGenre.setPrefSize(200,50);
        buttonBack.setPrefSize(100,100);
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
