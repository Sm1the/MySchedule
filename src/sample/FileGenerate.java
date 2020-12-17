package sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileGenerate {

    private MessageHandler getSelectMessage = new MessageHandler();
    private FilePath filePath = new FilePath();
    private LogMessage logMessage = new LogMessage();

    protected void notePathGenerate() {
        try {
            Files.createDirectories(Paths.get(filePath.fileWay + "/note"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void noteGenerate() {
        File file = new File(filePath.fileWay + "/note/note.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void groupPathGenerate() {
        try {
            Files.createDirectories(Paths.get(filePath.fileWay + "/group"));
            Files.createDirectories(Paths.get(filePath.fileWay + "/group/group_IP911"));
            Files.createDirectories(Paths.get(filePath.fileWay + "/group/group_IP912"));
            Files.createDirectories(Paths.get(filePath.fileWay + "/group/group_IP913"));
            Files.createDirectories(Paths.get(filePath.fileWay + "/group/group_IP914"));
            Files.createDirectories(Paths.get(filePath.fileWay+ "/group/group_IP915"));
            Files.createDirectories(Paths.get(filePath.fileWay + "/group/group_IP916"));
            Files.createDirectories(Paths.get(filePath.fileWay + "/group/group_IP917"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void IP911FilesGenerate(){
        File fileMonday = new File(filePath.fileWay + "/group/group_IP911/Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP911/Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP911/Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP911/Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP911/Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP911/Saturday.dat");
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void IP912FilesGenerate(){
        File fileMonday = new File(filePath.fileWay + "/group/group_IP912/Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP912/Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP912/Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP912/Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP912/Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP912/Saturday.dat");
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void IP913FilesGenerate(){
        File fileMonday = new File(filePath.fileWay + "/group/group_IP913/Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP913/Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP913/Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP913/Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP913/Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP913/Saturday.dat");
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void IP914FilesGenerate(){
        File fileMonday = new File(filePath.fileWay + "/group/group_IP914/Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP914/Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP914/Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP914/Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP914/Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP914/Saturday.dat");
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void IP915FilesGenerate(){
        File fileMonday = new File(filePath.fileWay + "/group/group_IP915/Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP915/Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP915/Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP915/Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP915/Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP915/Saturday.dat");
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void IP916FilesGenerate(){
        File fileMonday = new File(filePath.fileWay + "/group/group_IP916/Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP916/Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP916/Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP916/Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP916/Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP916/Saturday.dat");
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void IP917FilesGenerate(){
        File fileMonday = new File(filePath.fileWay + "/group/group_IP917/Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP917/Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP917/Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP917/Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP917/Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP917/Saturday.dat");
        try {
            fileMonday.createNewFile();
            fileTuesday.createNewFile();
            fileWednesday.createNewFile();
            fileThursday.createNewFile();
            fileFriday.createNewFile();
            fileSaturday.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }
}
