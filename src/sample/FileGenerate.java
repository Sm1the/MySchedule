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

    protected void versionPathGenerate() {
        try {
            Files.createDirectories(Paths.get(filePath.fileWay + "/version"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void versionGenerate() {
        File file = new File(filePath.fileWay + "/version/version.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void settingPathGenerate() {
        try {
            Files.createDirectories(Paths.get(filePath.fileWay + "/setting"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

    protected void settingGenerate() {
        File file = new File(filePath.fileWay + "/setting/setting.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
    }

}
