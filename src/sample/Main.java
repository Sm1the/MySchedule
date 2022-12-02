package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

        private static String NAME_APPLICATION = "Моё Расписание[СибГУТИ]";
        private static int WIDTH = 800;
        private static int HEIGHT = 450;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setResizable(false);
        Image icon = new Image(getClass().getResourceAsStream("/asset/icon.png"));
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle(NAME_APPLICATION);
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
        primaryStage.setOnCloseRequest(e -> Platform.exit());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
