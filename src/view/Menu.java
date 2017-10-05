package view;

import model.Reservation;
import model.Movie;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Ejer on 03-10-2017.
 */
public class Menu {
    Button buttonAddMovie = new Button("Tilføj film");
    Button buttonReservation = new Button("ReservationView");
    Button buttonMovie = new Button("Film");
    VBox vBox = new VBox();
    BorderPane borderPane = new BorderPane();

    public Menu() {
        vBox.getChildren().addAll(buttonAddMovie,buttonReservation,buttonMovie);
        vBox.setSpacing(100);
        borderPane.setLeft(vBox);
        borderPane.setPadding(new Insets(50));
        buttonAddMovie.setPrefSize(200,200);
        buttonMovie.setPrefSize(200,200);
        buttonReservation.setPrefSize(200,200);
        buttonClick();
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }

    private void buttonClick(){
        Stage primaryStage = new Stage();

        buttonAddMovie.setOnAction(event -> {
            AddMovie addMovie = new AddMovie();
            Scene scene = new Scene(addMovie.getBorderPane(),1200,800);
            primaryStage.setScene(scene);
            primaryStage.show();
        });
        buttonReservation.setOnAction(event -> {
            ReservationView reservationView = new ReservationView();
            Scene scene = new Scene(reservationView.getBorderPane(),1200,800);
            primaryStage.setScene(scene);
            primaryStage.show();
        });
        buttonMovie.setOnAction(event -> {
            MovieView movieView = new MovieView();
            Scene scene = new Scene(movieView.getBorderPane(),1200,800);
            primaryStage.setScene(scene);
            primaryStage.show();
        });
    }
}
