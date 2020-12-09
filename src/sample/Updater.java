package sample;

import java.io.BufferedReader;
import java.io.FileReader;

public class Updater {

    private MessageHandler getSelectMessage = new MessageHandler();
    private LogMessage logMessage = new LogMessage();
    private FilePath filePath = new FilePath();

    protected String getAppVersion(){
        String versionApp = "";
        try (BufferedReader reader = new BufferedReader(new FileReader( filePath.fileWay + "/version/version.txt"))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                versionApp = versionApp + currentLine;
            }
        } catch (Exception e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
        return versionApp;
    }
}
