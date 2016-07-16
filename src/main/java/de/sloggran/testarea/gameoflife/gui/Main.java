package de.sloggran.testarea.gameoflife.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage window) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/GoLScene.fxml"));
        Parent root = loader.load();
        window.setTitle("Game of Life");
        window.setScene(new Scene(root, 600, 400));
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
