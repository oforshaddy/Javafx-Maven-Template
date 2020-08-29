package com.o4codes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {


    public void start(Stage stage) throws Exception {
       getWelcomeStage(stage).show();
    }

    public static Stage getWelcomeStage(Stage stage) throws IOException {
        System.out.println("Starting Hello JavaFX and Maven demonstration application");
        String fxmlFile = "/fxml/welcome.fxml";
        System.out.println("Loading FXML for main view from: {} "+fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation( MainApp.class.getResource( fxmlFile ) );
        Parent rootNode = loader.load();
        Scene scene = new Scene(rootNode, 400, 200);
        stage.setTitle("Welcome");
        stage.setScene(scene);

        stage.setOnCloseRequest( e -> System.out.println( "App closing" ));
        return stage;
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
