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
        File fileMonday = new File(filePath.fileWay + "/group/group_IP911/ip911_Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP911/ip911_Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP911/ip911_Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP911/ip911_Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP911/ip911_Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP911/ip911_Saturday.dat");
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
        File fileMonday = new File(filePath.fileWay + "/group/group_IP912/ip912_Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP912/ip912_Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP912/ip912_Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP912/ip912_Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP912/ip912_Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP912/ip912_Saturday.dat");
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
        File fileMonday = new File(filePath.fileWay + "/group/group_IP913/ip913_Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP913/ip913_Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP913/ip913_Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP913/ip913_Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP913/ip913_Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP913/ip913_Saturday.dat");
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
        File fileMonday = new File(filePath.fileWay + "/group/group_IP914/ip914_Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP914/ip914_Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP914/ip914_Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP914/ip914_Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP914/ip914_Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP914/ip914_Saturday.dat");
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
        File fileMonday = new File(filePath.fileWay + "/group/group_IP915/ip915_Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP915/ip915_Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP915/ip915_Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP915/ip915_Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP915/ip915_Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP915/ip915_Saturday.dat");
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
        File fileMonday = new File(filePath.fileWay + "/group/group_IP916/ip916_Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP916/ip916_Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP916/ip916_Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP916/ip916_Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP916/ip916_Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP916/ip916_Saturday.dat");
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
        File fileMonday = new File(filePath.fileWay + "/group/group_IP917/ip917_Monday.dat");
        File fileTuesday = new File(filePath.fileWay + "/group/group_IP917/ip917_Tuesday.dat");
        File fileWednesday = new File(filePath.fileWay + "/group/group_IP917/ip917_Wednesday.dat");
        File fileThursday = new File(filePath.fileWay + "/group/group_IP917/ip917_Thursday.dat");
        File fileFriday = new File(filePath.fileWay + "/group/group_IP917/ip917_Friday.dat");
        File fileSaturday = new File(filePath.fileWay + "/group/group_IP917/ip917_Saturday.dat");
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
