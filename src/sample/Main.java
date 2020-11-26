package sample;

import javafx.application.Application;
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
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));//Связь класса и xml файла
        primaryStage.setResizable(false);//отключаем ресайз окна
        Image icon = new Image(getClass().getResourceAsStream("/asset/icon.png"));//создает иконку с ссылкой на картинку
        primaryStage.getIcons().add(icon);//заменяем стандартную иконку на новую
        primaryStage.setTitle(NAME_APPLICATION);//Имя приложения
        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));//Ширина и Высота
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
