package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Movie;
import model.Reservation;

public class AddMovie {
    Label label = new Label("Film oversigt");
    Label labelMovie = new Label("Vælg film");
    Label labelSal = new Label("Vælg sal");
    Label labelTime = new Label("Tidspunkt");
    BorderPane borderPane = new BorderPane();

    TableView tableView1 = new TableView();


    TableColumn<Reservation, String> nameColumn = new TableColumn("Film navn");
    TableColumn<Reservation, String> movieTimeColumn = new TableColumn("Tidspunkt");
    TableColumn<Reservation, String> genreColumn = new TableColumn("Genre");
    TableColumn<Reservation, String> seatColumn = new TableColumn("Sæde");

    static ComboBox comboBoxMovie = new ComboBox();
    static ComboBox comboBoxSal = new ComboBox();
    static ComboBox comboBoxTime = new ComboBox();


    VBox vBoxTable = new VBox();
    VBox vBoxCombo = new VBox();
    HBox hBox = new HBox();
    Button buttonAdd = new Button("Tilføj film");
    Button buttonBack = new Button("Tilbage");



    public AddMovie(Stage primaryStage) {
        vBoxCombo.getChildren().addAll(labelMovie,comboBoxMovie,labelSal,comboBoxSal,labelTime,comboBoxTime);
        borderPane.setLeft(vBoxCombo);
        hBox.getChildren().addAll(buttonAdd,buttonBack);
        borderPane.setPadding(new Insets(50));
        vBoxTable.getChildren().addAll(label,tableView1,hBox);
        borderPane.setRight(vBoxTable);
        tableSetup();
        setSize();
        buttonClick(primaryStage);
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }
    private void tableSetup(){
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("reservationName"));
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        movieTimeColumn.setCellValueFactory(new PropertyValueFactory<>("reservationTime"));
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seatNumber"));

        tableView1.getColumns().addAll(nameColumn, movieTimeColumn, genreColumn, seatColumn);
        tableView1.setItems(getMovies());
        nameColumn.setPrefWidth(200);
        genreColumn.setPrefWidth(160);
        tableView1.setPrefSize(650,400);
    }

    private void setSize(){
        comboBoxMovie.setPrefSize(200,50);
        comboBoxSal.setPrefSize(200,50);
        comboBoxTime.setPrefSize(200,50);
        vBoxCombo.setSpacing(25);
        vBoxTable.setSpacing(25);
        buttonAdd.setPrefSize(200,100);
        buttonBack.setPrefSize(200,100);
    }

    private void buttonClick(Stage primaryStage){
        buttonBack.setOnAction(event -> {

            Menu menu = new Menu(primaryStage);
            Scene scene = new Scene(menu.getBorderPane(),600,400);
            primaryStage.setScene(scene);
            primaryStage.show();
        });
    }

    public static void comboBoxSalItems() {
        comboBoxSal.getItems().addAll(
                "1",
                "2",
                "3",
                "4");
    }

    public static void ComboBoxMovieItems() {
        comboBoxMovie.getItems().addAll(
                "Jigsaw",
                "Saw II",
                "Avatar",
                "Titanic");
    }

    public static void comboBoxTimeItems() {
        comboBoxTime.getItems().addAll(
                "13:00",
                "14:00",
                "15:00",
                "16:00",
                "17:00",
                "18:00",
                "19:00",
                "20:00",
                "21:00",
                "22:00",
                "23:00");
    }

    public ObservableList<Reservation> getMovies() {
        ObservableList<Reservation> movies = FXCollections.observableArrayList();
        movies.add(new Reservation("Jigsaw", "Horror", "71", "2", "19:00"));
        return movies;
    }


}
