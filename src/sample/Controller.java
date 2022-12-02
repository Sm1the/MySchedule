package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    private ItemList itemList = new ItemList();
    private FilePath filePath = new FilePath();
    private ScheduleReader scheduleReader = new ScheduleReader();

    private static String NAME_APPLICATION = "Заметки к Парам";
    private static int WIDTH = 390;
    private static int HEIGHT = 490;
    private Stage stage;

    @FXML
    private TabPane tp_Schedule;

    @FXML
    private Tab tp_Monday;

    @FXML
    protected ListView<String> tv_Monday;

    @FXML
    private Tab tp_Tuesday;

    @FXML
    protected ListView<String> tv_Tuesday;

    @FXML
    private Tab tp_Wednesday;

    @FXML
    protected ListView<String> tv_Wednesday;

    @FXML
    private Tab tp_Thursday;

    @FXML
    protected ListView<String> tv_Thursday;

    @FXML
    private Tab tp_Friday;

    @FXML
    protected ListView<String> tv_Friday;

    @FXML
    private Tab tp_Saturday;

    @FXML
    protected ListView<String> tv_Saturday;

    @FXML
    private ComboBox<String> selectGroup;

    @FXML
    private Label setToDay;

    @FXML
    private void initialize() {
        //Доделать класс
        ObservableList<String> groupList = FXCollections.observableArrayList();
        for (int i = 0; i <= 6; i++){
            groupList.add(itemList.setNameGroup(i));
        }
        selectGroup.setItems(groupList);
        generatePathAndFiles();
        setToDayDate();
        selectTableView();
    }

    private void setToDayDate() {
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        setToDay.setText("Сегодня " + formatForDateNow.format(timeAndDate.getTimeAndDate()));
    }

    private void generatePathAndFiles() {
        getFileGenerate.notePathGenerate();
        getFileGenerate.noteGenerate();

        getFileGenerate.groupPathGenerate();
        getFileGenerate.IP911FilesGenerate();
        getFileGenerate.IP912FilesGenerate();
        getFileGenerate.IP913FilesGenerate();
        getFileGenerate.IP914FilesGenerate();
        getFileGenerate.IP915FilesGenerate();
        getFileGenerate.IP916FilesGenerate();
        getFileGenerate.IP917FilesGenerate();
    }

    @FXML
    private void startNoteWindow() {
        if (stage == null) {
            try {
                stage = new Stage();
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
        } else if (stage.isShowing()) {
            stage.toFront();
            getSelectMessage.selectMessage(1, "У вас уже открыто окно с Заметками!");
        } else if (stage.isShowing() == false){
            stage.show();
        }
    }

    @FXML
    private void getGroup() {
        String output = selectGroup.getSelectionModel().getSelectedItem();
        switch (output) {
            case "ИП-911":
                setGroupSchedule(1);
                break;
            case "ИП-912":
                setGroupSchedule(2);
                break;
            case "ИП-913":
                setGroupSchedule(3);
                break;
            case "ИП-914":
                setGroupSchedule(4);
                break;
            case "ИП-915":
                setGroupSchedule(5);
                break;
            case "ИП-916":
                setGroupSchedule(6);
                break;
            case "ИП-917":
                setGroupSchedule(7);
                break;
        }
    }

    private void selectTableView() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek - 1) {
            case 1:
                tp_Schedule.getSelectionModel().select(tp_Monday);
                break;
            case 2:
                tp_Schedule.getSelectionModel().select(tp_Tuesday);
                break;
            case 3:
                tp_Schedule.getSelectionModel().select(tp_Wednesday);
                break;
            case 4:
                tp_Schedule.getSelectionModel().select(tp_Thursday);
                break;
            case 5:
                tp_Schedule.getSelectionModel().select(tp_Friday);
                break;
            case 6:
                tp_Schedule.getSelectionModel().select(tp_Saturday);
                break;
            case 7:
                tp_Schedule.getSelectionModel().select(tp_Monday);
                break;
        }
    }

    private void setGroupSchedule(int numberGroup) {
        tv_Monday.getItems().clear();
        tv_Tuesday.getItems().clear();
        tv_Wednesday.getItems().clear();
        tv_Thursday.getItems().clear();
        tv_Friday.getItems().clear();
        tv_Saturday.getItems().clear();
        tp_Schedule.setOnMouseClicked(event -> {
            tv_Monday.getSelectionModel().clearSelection();
            tv_Tuesday.getSelectionModel().clearSelection();
            tv_Wednesday.getSelectionModel().clearSelection();
            tv_Thursday.getSelectionModel().clearSelection();
            tv_Friday.getSelectionModel().clearSelection();
            tv_Saturday.getSelectionModel().clearSelection();
        });
        switch (numberGroup) {
            case 1:
                tv_Monday.getItems().addAll(scheduleReader.getScheduleIP911Monday());
                tv_Tuesday.getItems().addAll(scheduleReader.getScheduleIP911Tuesday());
                tv_Wednesday.getItems().addAll(scheduleReader.getScheduleIP911Wednesday());
                tv_Thursday.getItems().addAll(scheduleReader.getScheduleIP911Thursday());
                tv_Friday.getItems().addAll(scheduleReader.getScheduleIP911Friday());
                tv_Saturday.getItems().addAll(scheduleReader.getScheduleIP911Saturday());
                break;
            case 2:
                tv_Monday.getItems().addAll(scheduleReader.getScheduleIP912Monday());
                tv_Tuesday.getItems().addAll(scheduleReader.getScheduleIP912Tuesday());
                tv_Wednesday.getItems().addAll(scheduleReader.getScheduleIP912Wednesday());
                tv_Thursday.getItems().addAll(scheduleReader.getScheduleIP912Thursday());
                tv_Friday.getItems().addAll(scheduleReader.getScheduleIP912Friday());
                tv_Saturday.getItems().addAll(scheduleReader.getScheduleIP912Saturday());
                break;
            case 3:
                tv_Monday.getItems().addAll(scheduleReader.getScheduleIP913Monday());
                tv_Tuesday.getItems().addAll(scheduleReader.getScheduleIP913Tuesday());
                tv_Wednesday.getItems().addAll(scheduleReader.getScheduleIP913Wednesday());
                tv_Thursday.getItems().addAll(scheduleReader.getScheduleIP913Thursday());
                tv_Friday.getItems().addAll(scheduleReader.getScheduleIP913Friday());
                tv_Saturday.getItems().addAll(scheduleReader.getScheduleIP913Saturday());
                break;
            case 4:
                tv_Monday.getItems().addAll(scheduleReader.getScheduleIP914Monday());
                tv_Tuesday.getItems().addAll(scheduleReader.getScheduleIP914Tuesday());
                tv_Wednesday.getItems().addAll(scheduleReader.getScheduleIP914Wednesday());
                tv_Thursday.getItems().addAll(scheduleReader.getScheduleIP914Thursday());
                tv_Friday.getItems().addAll(scheduleReader.getScheduleIP914Friday());
                tv_Saturday.getItems().addAll(scheduleReader.getScheduleIP914Saturday());
                break;
            case 5:
                tv_Monday.getItems().addAll(scheduleReader.getScheduleIP915Monday());
                tv_Tuesday.getItems().addAll(scheduleReader.getScheduleIP915Tuesday());
                tv_Wednesday.getItems().addAll(scheduleReader.getScheduleIP915Wednesday());
                tv_Thursday.getItems().addAll(scheduleReader.getScheduleIP915Thursday());
                tv_Friday.getItems().addAll(scheduleReader.getScheduleIP915Friday());
                tv_Saturday.getItems().addAll(scheduleReader.getScheduleIP915Saturday());
                break;
            case 6:
                tv_Monday.getItems().addAll(scheduleReader.getScheduleIP916Monday());
                tv_Tuesday.getItems().addAll(scheduleReader.getScheduleIP916Tuesday());
                tv_Wednesday.getItems().addAll(scheduleReader.getScheduleIP916Wednesday());
                tv_Thursday.getItems().addAll(scheduleReader.getScheduleIP916Thursday());
                tv_Friday.getItems().addAll(scheduleReader.getScheduleIP916Friday());
                tv_Saturday.getItems().addAll(scheduleReader.getScheduleIP916Saturday());
                break;
            case 7:
                tv_Monday.getItems().addAll(scheduleReader.getScheduleIP917Monday());
                tv_Tuesday.getItems().addAll(scheduleReader.getScheduleIP917Tuesday());
                tv_Wednesday.getItems().addAll(scheduleReader.getScheduleIP917Wednesday());
                tv_Thursday.getItems().addAll(scheduleReader.getScheduleIP917Thursday());
                tv_Friday.getItems().addAll(scheduleReader.getScheduleIP917Friday());
                tv_Saturday.getItems().addAll(scheduleReader.getScheduleIP917Saturday());
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
    void clearNote() {
        File file = new File(filePath.getAbsolutePath() + "/note/note.dat");
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
        Desktop desktop = null;
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
        }
        try {
            desktop.open(new File(filePath.getAbsolutePath() + "/log/"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    @FXML
    void reGenerateFiles() {
        generatePathAndFiles();
        getSelectMessage.selectMessage(1, "Все файлы были пересозданы! Перезапустите приложение!");
    }
}
