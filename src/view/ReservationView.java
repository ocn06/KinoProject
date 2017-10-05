package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Ejer on 03-10-2017.
 */
public class ReservationView {
    BorderPane borderPane = new BorderPane();

    Label labelName = new Label("Navn");
    Label labelMovie = new Label("Film");
    Label labelSeat = new Label("Sæde");
    Label labelHall = new Label();
    Label labelDate = new Label("Dato");
    Label labelSize = new Label("Størrelse");

    TextField textFieldName = new TextField();
    ComboBox comboBoxMovie = new ComboBox();
    //check combo box
    ComboBox comboBoxSeat = new ComboBox();
    DatePicker datePicker = new DatePicker();
    TextField textFieldSize = new TextField();
    VBox vBoxName = new VBox();
    VBox vBoxMovie = new VBox();
    VBox vBoxDate = new VBox();
    VBox vBoxSize = new VBox();
    VBox vBoxComplete = new VBox();
    HBox hBox = new HBox();

    Button buttonReserve = new Button("Reserver");
    Button buttonDelete = new Button("Fjern reservation");
    Button buttonBack = new Button("Tilbage");

    TableView tableView = new TableView();
    TableColumn tableColumnName = new TableColumn("Navn");
    TableColumn tableColumnMovie = new TableColumn("Film");
    TableColumn tableColumnDate = new TableColumn("Dato");
    TableColumn tableColumnSize = new TableColumn("Antal billeter");

    public ReservationView() {
        vBoxName.getChildren().addAll(labelName,textFieldName);
        vBoxMovie.getChildren().addAll(labelMovie,comboBoxMovie);
        vBoxDate.getChildren().addAll(labelDate,datePicker);
        vBoxSize.getChildren().addAll(labelSize,textFieldSize);
        hBox.getChildren().addAll(buttonReserve,buttonDelete,buttonBack);
        vBoxComplete.getChildren().addAll(vBoxName,vBoxMovie,vBoxDate,vBoxSize,hBox);

        borderPane.setLeft(vBoxComplete);
        borderPane.setRight(tableView);
        setSize();
        tableViewSetup();
        buttonClick();
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }
    private void datePickerSetup(){
        //Datepicker source: http://o7planning.org/en/11085/javafx-datepicker-tutorial
        //Opretter datepicker
        datePicker.setShowWeekNumbers(true);

        // Converter
        StringConverter<LocalDate> converter = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };
        datePicker.setConverter(converter);
        datePicker.setPromptText("dd-MM-yyyy");
    }
    private void setSize(){
        borderPane.setPadding(new Insets(50));
        vBoxComplete.setSpacing(60);
        hBox.setSpacing(20);
        comboBoxMovie.setPrefSize(140,40);
        tableView.setPrefSize(500,400);
        tableColumnName.setPrefWidth(125);
        tableColumnMovie.setPrefWidth(125);
        tableColumnDate.setPrefWidth(125);
        tableColumnSize.setPrefWidth(125);
    }
    private void tableViewSetup(){
        tableView.getColumns().addAll(tableColumnName,tableColumnMovie,tableColumnDate,tableColumnSize);
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
