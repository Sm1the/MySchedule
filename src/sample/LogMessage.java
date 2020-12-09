package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class LogMessage {

    private TimeAndDate timeAndDate = new TimeAndDate() {
        @Override
        protected Date getTimeAndDate() {
            return super.getTimeAndDate();
        }
    };
    private MessageHandler getSelectMessage = new MessageHandler();
    protected String fileWay = new File("").getAbsolutePath();

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


    protected void writeLog(String LogMessage){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileWay + "/log/log.dat", true))) {
            writer.write("["+ timeAndDate.getTimeAndDate() + "]" + LogMessage + "\n");
            writer.flush();
        } catch (Exception e) {
            getSelectMessage.selectMessage(2, e.toString());
            writeLog(e.toString());
        }
    }

}
