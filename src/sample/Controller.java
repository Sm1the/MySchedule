package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    private MessageHandler getSelectMessage = new MessageHandler();
    private FileGenerate getFileGenerate = new FileGenerate();
    private TimeAndDate timeAndDate = new TimeAndDate() {
        @Override
        protected Date getTimeAndDate() {
            return super.getTimeAndDate();
        }
    };

    private static String NAME_APPLICATION = "Заметки к Парам";
    private static int WIDTH = 390;
    private static int HEIGHT = 490;

    @FXML
    private ComboBox<String> selectGroup;

    @FXML
    private Label setToDay;

    @FXML
    private void initialize() {
        ObservableList<String> groupList = FXCollections.observableArrayList("ИП-911", "ИП-912", "ИП-913", "ИП-914", "ИП-915", "ИП-916", "ИП-917");
        selectGroup.setItems(groupList);
        generatePathAndFiles();
        setToDayDate();
    }

    private void setToDayDate() {
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        setToDay.setText("Сегодня " + formatForDateNow.format(timeAndDate.getTimeAndDate()));
    }


    private void generatePathAndFiles() {
        getFileGenerate.notePathGenerate();
        getFileGenerate.noteGenerate();

        getFileGenerate.versionPathGenerate();
        getFileGenerate.versionGenerate();

        getFileGenerate.logPathGenerate();
        getFileGenerate.logGenerate();

        getFileGenerate.groupPathGenerate();

        getFileGenerate.settingPathGenerate();
        getFileGenerate.settingGenerate();
    }

    @FXML
    private void startNoteWindow() {
        try {
            Stage stage = new Stage();
            Image icon = new Image(getClass().getResourceAsStream("/asset/icon.png"));//создает иконку с ссылкой на картинку
            stage.getIcons().add(icon);//заменяем стандартную иконку на новую
            Parent root = FXMLLoader.load(getClass().getResource("noteWindow.fxml"));
            stage.setResizable(false);//отключаем ресайз окна
            stage.setTitle(NAME_APPLICATION);
            stage.setScene(new Scene(root, WIDTH, HEIGHT));
            stage.show();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    @FXML
    private void getGroup() {
        String output = selectGroup.getSelectionModel().getSelectedItem();
        switch (output) {
            case "ИП-911":
                System.out.println("1");
                break;
            case "ИП-912":
                System.out.println("2");
                break;
            case "ИП-913":
                System.out.println("3");
                break;
            case "ИП-914":
                System.out.println("4");
                break;
            case "ИП-915":
                System.out.println("5");
                break;
            case "ИП-916":
                System.out.println("6");
                break;
            case "ИП-917":
                System.out.println("7");
                break;
        }
    }

    @FXML
    private void setTimetable() {
        getSelectMessage.selectMessage(3, "1 Пара * 08:00 - 09:35 * 15 мин\n" +
                "2 Пара * 09:50 - 11:25 * 15 мин\n" +
                "3 Пара * 11:40 - 13:15 * 30 мин\n" +
                "4 Пара * 13:45 - 15:20 * 15 мин\n" +
                "5 Пара * 15:35 - 17:10 * 15 мин\n" +
                "6 Пара * 17:25 - 19:00 * последняя пара");
    }

    @FXML
    private void openLinkEios() {
        startBrowseLink("https://eios.sibsutis.ru");
    }

    @FXML
    private void openLinkCyberEios() {
        startBrowseLink("http://cyber.sibsutis.ru");
    }

    @FXML
    void openProjectOnGitHub() {
        startBrowseLink("https://github.com/Sm1the/MySchedule.git");
    }

    private void startBrowseLink(String setLink) {
        try {
            Desktop.getDesktop().browse(new URL(setLink).toURI());
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        } catch (URISyntaxException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    @FXML
    void checkLogFunction() {
        getSelectMessage.selectMessage(1, "Данная функция еще находиться на стадии разработки!");
    }

    @FXML
    void checkNotification() {
        getSelectMessage.selectMessage(3,"Тест 3");
        getSelectMessage.selectMessage(2,"Тест 2");
        getSelectMessage.selectMessage(1,"Тест 1");
    }

    @FXML
    void checkUpdate() {
        getSelectMessage.selectMessage(1, "Данная функция еще находиться на стадии разработки!");
    }

    @FXML
    void clearNote() {
        File file = new File(getFileGenerate.fileWay + "/note/note.dat");
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
        getSelectMessage.selectMessage(3, "Заметки очищены!");
    }

    @FXML
    void openLogFile() {
        String logFilePath = getFileGenerate.fileWay + "/log/log.dat";
        try {
            Process process = Runtime.getRuntime().exec("cmd /c notepad.exe " + logFilePath);
            process.waitFor();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        } catch (InterruptedException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    @FXML
    void reGenerateFiles() {
        generatePathAndFiles();
        getSelectMessage.selectMessage(1, "Все файлы были пересозданы! Перезапустите приложение!");
    }

}
