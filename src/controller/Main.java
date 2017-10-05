package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.Menu;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Menu menu = new Menu();
        primaryStage.setScene(new Scene(menu.getBorderPane(), 1200, 800));
        primaryStage.show();

    }
}
