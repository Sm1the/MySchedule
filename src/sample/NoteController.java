package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NoteController {

    private MessageHandler getSelectMessage = new MessageHandler();
    private FileGenerate fileGenerate = new FileGenerate();
    private TimeAndDate timeAndDate = new TimeAndDate() {
        @Override
        protected Date getTimeAndDate() {
            return super.getTimeAndDate();
        }
    };

    private String noteText;
    private static String layingOne = "\n################################################";
    private static String layingTwo = "\n/////////////////////////////////////////////////////////////////////////";
    private static String layingThree = "\n+++++++++++++++++++++++++++++++++++++++++";
    private static String layingFour = "\n-----------------------------------------------------------------------";
    private static String layingFive = "\n=========================================";

    @FXML
    private TextArea noteTextArea;

    @FXML
    private ComboBox<String> selectLesson;
    ObservableList<String> lessonList = FXCollections.observableArrayList("ИП-911", "ИП-912", "ИП-913", "ИП-914", "ИП-915", "ИП-916", "ИП-917");


    @FXML
    private void initialize() {
        readNote();
        selectLesson.setItems(lessonList);
    }

    @FXML
    private void findWord() {

    }

    @FXML
    private void getNoteText() {
        noteText = noteTextArea.getText();
    }

    @FXML
    private void clearComboBox() {
        selectLesson.setValue("Предмет");
    }

    @FXML
    private void getLesson() {
        getNoteText();
        switch (selectLesson.getSelectionModel().getSelectedItem()) {
            case "ИП-911":
                noteTextArea.setText("жопа \n" + noteText);
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

    private String getFilePath() {
        fileGenerate.notePathGenerate();
        String getWayPath = fileGenerate.fileWay;
        return getWayPath;
    }

    private void readNote() {
        ArrayList<String> textFile = new ArrayList<>();
        String writeTextNote = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(getFilePath() + "/note/note.dat"))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                textFile.add(currentLine + "\n");
            }
        } catch (Exception e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
        for (String word : textFile) {
            writeTextNote = writeTextNote + word;
        }
        noteTextArea.setText(writeTextNote);
    }

    @FXML
    private void saveNote() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFilePath() + "/note/note.dat", false))) {
            writer.write(noteTextArea.getText());
            writer.flush();
        } catch (Exception e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }


    @FXML
    private void writeTimeDate() {
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E hh:mm:ss dd.MM.yyyy");
        noteText = noteTextArea.getText();
        noteTextArea.setText("\n" + formatForDateNow.format(timeAndDate.getTimeAndDate()) + "\n" + noteText + "\n");
    }

    @FXML
    private void aboutNote() {
        getSelectMessage.selectMessage(3, "123");
    }

    @FXML
    private void writeKeyFind() {
        getNoteText();
        noteTextArea.setText("@" + noteText);
    }

    @FXML
    private void writeRoundBrackets() {
        getNoteText();
        noteTextArea.setText("===============(  )===============\n" + noteText);
    }

    @FXML
    private void writeSquareBrackets() {
        getNoteText();
        noteTextArea.setText("===============[  ]===============\n" + noteText);
    }

    @FXML
    private void writeLayingOne() {
        getNoteText();
        noteTextArea.setText(layingOne + "\n" + noteText);
    }

    @FXML
    private void writeLayingTwo() {
        getNoteText();
        noteTextArea.setText(layingTwo + "\n" + noteText);
    }

    @FXML
    private void writeLayingThree() {
        getNoteText();
        noteTextArea.setText(layingThree + "\n" + noteText);
    }

    @FXML
    private void writeLayingFour() {
        getNoteText();
        noteTextArea.setText(layingFour + "\n" + noteText);
    }

    @FXML
    private void writeLayingFive() {
        getNoteText();
        noteTextArea.setText(layingFive + "\n" + noteText);
    }
}
