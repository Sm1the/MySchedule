package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NoteController {

    private MessageHandler getSelectMessage = new MessageHandler();
    private TimeAndDate timeAndDate = new TimeAndDate() {
        @Override
        protected Date getTimeAndDate() {
            return super.getTimeAndDate();
        }
    };
    private FilePath filePath = new FilePath();

    private String noteText;

    @FXML
    private TextArea noteTextArea;

    @FXML
    private TextField keyWord;


    @FXML
    private ComboBox<String> selectLesson;
    ObservableList<String> lessonList = FXCollections.observableArrayList("Легкая атлетика", "Математика", "СиАОД", "Ин.Яз.", "Мат.Логика", "ИТ", "ООП", "ЭЭС");


    @FXML
    private void initialize() {
        readNote();
        selectLesson.setItems(lessonList);
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
    private void findWords() {
        if (keyWord.getText() != null && !keyWord.getText().isEmpty()) {
            int index = noteTextArea.getText().toLowerCase().indexOf(keyWord.getText());
            if (index == -1) {
                getSelectMessage.selectMessage(1, "Искомого слова нету в этом текста!");
            } else {
                noteTextArea.selectRange(index, index + keyWord.getLength());
            }
        } else {
            getSelectMessage.selectMessage(1, "Слово поиска не введено!");
        }
    }

    @FXML
    private void getLesson() {
        getNoteText();
        switch (selectLesson.getSelectionModel().getSelectedItem()) {
            case "Легкая атлетика":
                noteTextArea.setText("Легкая атлетика \n" + "Задание : \n" + noteText);
                break;
            case "Математика":
                noteTextArea.setText("Математика \n" + "Задание : \n" + noteText);
                break;
            case "СиАОД":
                noteTextArea.setText("Структуры и алгоритмы обработки данных \n" + "Задание : \n" + noteText);
                break;
            case "Ин.Яз.":
                noteTextArea.setText("Иностранный язык \n" + "Задание : \n" + noteText);
                break;
            case "Мат.Логика":
                noteTextArea.setText("Математическая логика и теория алгоритмов \n" + "Задание : \n" + noteText);
                break;
            case "ИТ":
                noteTextArea.setText("Интернет-технологии \n" + "Задание : \n" + noteText);
                break;
            case "ООП":
                noteTextArea.setText("Объектно-ориентированное программирование \n" + "Задание : \n" + noteText);
                break;
            case "ЭЭС":
                noteTextArea.setText("ЭЭС \n" + "Задание : \n" + noteText);
                break;
        }
    }


    private void readNote() {
        ArrayList<String> textFile = new ArrayList<>();
        String writeTextNote = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.getAbsolutePath()  + "/note/note.dat"))) {
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

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.getAbsolutePath()  + "/note/note.dat", false))) {
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
}

