package sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileGenerate {

    private MessageHandler getSelectMessage = new MessageHandler();
    private ItemList itemList = new ItemList();
    private FilePath filePath = new FilePath();

    protected void notePathGenerate() {
        try {
            Files.createDirectories(Paths.get(filePath.getAbsolutePath() + "/note"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void noteGenerate() {
        File file = new File(filePath.getAbsolutePath()+ "/note/note.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void groupPathGenerate() {
        try {
            Files.createDirectories(Paths.get(filePath.getAbsolutePath()+ "/group"));
            Files.createDirectories(Paths.get(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(0)));
            Files.createDirectories(Paths.get(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(1)));
            Files.createDirectories(Paths.get(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(2)));
            Files.createDirectories(Paths.get(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(3)));
            Files.createDirectories(Paths.get(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(4)));
            Files.createDirectories(Paths.get(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(5)));
            Files.createDirectories(Paths.get(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(6)));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void IP911FilesGenerate() {
        File fileMonday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(0) + itemList.setDayPath(0));
        File fileTuesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(0) + itemList.setDayPath(1));
        File fileWednesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(0)+ itemList.setDayPath(2));
        File fileThursday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(0) + itemList.setDayPath(3));
        File fileFriday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(0) + itemList.setDayPath(4));
        File fileSaturday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(0) + itemList.setDayPath(5));
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void IP912FilesGenerate() {
        File fileMonday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(1) + itemList.setDayPath(0));
        File fileTuesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(1) + itemList.setDayPath(1));
        File fileWednesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(1) + itemList.setDayPath(2));
        File fileThursday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(1) + itemList.setDayPath(3));
        File fileFriday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(1) + itemList.setDayPath(4));
        File fileSaturday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(1) + itemList.setDayPath(5));
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void IP913FilesGenerate() {
        File fileMonday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(2) + itemList.setDayPath(0));
        File fileTuesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(2) + itemList.setDayPath(1));
        File fileWednesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(2) + itemList.setDayPath(2));
        File fileThursday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(2) + itemList.setDayPath(3));
        File fileFriday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(2) + itemList.setDayPath(4));
        File fileSaturday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(2) + itemList.setDayPath(5));
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void IP914FilesGenerate() {
        File fileMonday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(3) + itemList.setDayPath(0));
        File fileTuesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(3) + itemList.setDayPath(1));
        File fileWednesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(3) + itemList.setDayPath(2));
        File fileThursday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(3) + itemList.setDayPath(3));
        File fileFriday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(3) + itemList.setDayPath(4));
        File fileSaturday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(3) + itemList.setDayPath(5));
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void IP915FilesGenerate() {
        File fileMonday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(4) + itemList.setDayPath(0));
        File fileTuesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(4) + itemList.setDayPath(1));
        File fileWednesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(4) + itemList.setDayPath(2));
        File fileThursday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(4) + itemList.setDayPath(3));
        File fileFriday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(4) + itemList.setDayPath(4));
        File fileSaturday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(4) + itemList.setDayPath(5));
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void IP916FilesGenerate() {
        File fileMonday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(5) + itemList.setDayPath(0));
        File fileTuesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(5) + itemList.setDayPath(1));
        File fileWednesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(5) + itemList.setDayPath(2));
        File fileThursday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(5) + itemList.setDayPath(3));
        File fileFriday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(5) + itemList.setDayPath(4));
        File fileSaturday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(5) + itemList.setDayPath(5));
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void IP917FilesGenerate() {
        File fileMonday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(6) + itemList.setDayPath(0));
        File fileTuesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(6) + itemList.setDayPath(1));
        File fileWednesday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(6) + itemList.setDayPath(2));
        File fileThursday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(6) + itemList.setDayPath(3));
        File fileFriday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(6) + itemList.setDayPath(4));
        File fileSaturday = new File(filePath.getAbsolutePath() + "/group/" + itemList.setGroupPath(6) + itemList.setDayPath(5));
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }
}
