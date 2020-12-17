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
    protected String getScheduleIP913Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/ip913_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/ip913_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/ip913_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/ip913_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/ip913_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/ip913_Saturday.dat");
        return finalTextReader;
    }

    //IP914
    protected String getScheduleIP914Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/ip914_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/ip914_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/ip914_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/ip914_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/ip914_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/ip914_Saturday.dat");
        return finalTextReader;
    }

    //IP915
    protected String getScheduleIP915Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/ip915_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/ip915_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/ip915_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/ip915_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/ip915_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/ip915_Saturday.dat");
        return finalTextReader;
    }

    //IP916
    protected String getScheduleIP916Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/ip916_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/ip916_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/ip916_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/ip916_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/ip916_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/ip916_Saturday.dat");
        return finalTextReader;
    }

    //IP917
    protected String getScheduleIP917Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/ip917_Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/ip917_Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/ip917_Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/ip917_Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/ip917_Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/ip917_Saturday.dat");
        return finalTextReader;
    }
}
