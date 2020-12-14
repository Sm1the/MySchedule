package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ScheduleReader {

    private MessageHandler getSelectMessage = new MessageHandler();
    private LogMessage logMessage = new LogMessage();
    private FilePath filePath = new FilePath();

    private String fileReader(String fileName){
        String writeText = "";
        ArrayList<String> textFile = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                textFile.add(currentLine + "\n");
            }
        } catch (Exception e) {
            getSelectMessage.selectMessage(2, e.toString());
            logMessage.writeLog(e.toString());
        }
        for (String word : textFile) {
            writeText = writeText + word;
        }
        return writeText;
    }

    //IP911
    protected String getScheduleIP911Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/ip911_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Tuesday(){
        String finalTextReader= fileReader(filePath.fileWay + "/group/group_IP911/ip911_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/ip911_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/ip911_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/ip911_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/ip911_Saturday.dat");
        return finalTextReader;
    }

    //IP912
    protected String getScheduleIP912Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Saturday.dat");
        return finalTextReader;
    }

    //IP913
    protected String getScheduleIP912Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Saturday.dat");
        return finalTextReader;
    }

    //IP914
    protected String getScheduleIP912Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Saturday.dat");
        return finalTextReader;
    }

    //IP915
    protected String getScheduleIP912Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Saturday.dat");
        return finalTextReader;
    }

    //IP916
    protected String getScheduleIP912Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Saturday.dat");
        return finalTextReader;
    }

    //IP917
    protected String getScheduleIP912Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/ip912_Saturday.dat");
        return finalTextReader;
    }
}
