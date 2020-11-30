package sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileGenerate {

    private MessageHandler getSelectMessage = new MessageHandler();
    protected String fileWay = new File("").getAbsolutePath();

    protected void notePathGenerate() {
        try {
            Files.createDirectories(Paths.get(fileWay + "/note"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void noteGenerate() {
        File file = new File(fileWay + "/note/note.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void groupPathGenerate() {
        try {
            Files.createDirectories(Paths.get(fileWay + "/group"));
            Files.createDirectories(Paths.get(fileWay + "/group/group_IP911"));
            Files.createDirectories(Paths.get(fileWay + "/group/group_IP912"));
            Files.createDirectories(Paths.get(fileWay + "/group/group_IP913"));
            Files.createDirectories(Paths.get(fileWay + "/group/group_IP914"));
            Files.createDirectories(Paths.get(fileWay + "/group/group_IP915"));
            Files.createDirectories(Paths.get(fileWay + "/group/group_IP916"));
            Files.createDirectories(Paths.get(fileWay + "/group/group_IP917"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void versionPathGenerate() {
        try {
            Files.createDirectories(Paths.get(fileWay + "/version"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void versionGenerate() {
        File file = new File(fileWay + "/version/version.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void logPathGenerate() {
        try {
            Files.createDirectories(Paths.get(fileWay + "/log"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void logGenerate() {
        File file = new File(fileWay + "/log/log.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void settingPathGenerate() {
        try {
            Files.createDirectories(Paths.get(fileWay + "/setting"));
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

    protected void settingGenerate() {
        File file = new File(fileWay + "/setting/setting.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            getSelectMessage.selectMessage(2, e.toString());
        }
    }

}
