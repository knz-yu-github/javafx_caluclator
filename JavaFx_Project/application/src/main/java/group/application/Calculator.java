package group.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calculator.class.getResource("calc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 300);

        stage.setTitle("でんたく!");
        stage.setScene(scene);
        stage.setResizable(false);        //サイズ固定
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}