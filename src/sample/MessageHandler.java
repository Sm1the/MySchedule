package sample;

import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MessageHandler {

    public void selectMessage(int selectMessage, String contentMessage) {
        Stage stage;
        switch (selectMessage) {
            case 1:
                Alert alert = new Alert(Alert.AlertType.WARNING);
                stage = (Stage) alert.getDialogPane().getScene().getWindow();
                stage.getIcons().add(new Image(getClass().getResource("/asset/icon.png").toString()));
                alert.setTitle("Предупреждение!!!");
                alert.setHeaderText(null);
                alert.setContentText(contentMessage + "");
                alert.show();
                break;
            case 2:
                alert = new Alert(Alert.AlertType.ERROR);
                stage = (Stage) alert.getDialogPane().getScene().getWindow();
                stage.getIcons().add(new Image(getClass().getResource("/asset/icon.png").toString()));
                alert.setTitle("Ошибка!!!");
                alert.setHeaderText(null);
                alert.setContentText(contentMessage + "");
                alert.show();
                break;
            case 3:
                alert = new Alert(Alert.AlertType.INFORMATION);
                stage = (Stage) alert.getDialogPane().getScene().getWindow();
                stage.getIcons().add(new Image(getClass().getResource("/asset/icon.png").toString()));
                alert.setTitle("Информация");
                alert.setHeaderText(null);
                alert.setContentText(contentMessage + "");
                alert.show();
                break;
        }
    }
}
