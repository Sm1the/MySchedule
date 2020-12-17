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
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Tuesday(){
        String finalTextReader= fileReader(filePath.fileWay + "/group/group_IP911/Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP911Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP911/Saturday.dat");
        return finalTextReader;
    }

    //IP912
    protected String getScheduleIP912Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP912Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP912/Saturday.dat");
        return finalTextReader;
    }

    //IP913
    protected String getScheduleIP913Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP913Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP913/Saturday.dat");
        return finalTextReader;
    }

    //IP914
    protected String getScheduleIP914Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP914Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP914/Saturday.dat");
        return finalTextReader;
    }

    //IP915
    protected String getScheduleIP915Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP915Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP915/Saturday.dat");
        return finalTextReader;
    }

    //IP916
    protected String getScheduleIP916Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP916Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP916/Saturday.dat");
        return finalTextReader;
    }

    //IP917
    protected String getScheduleIP917Monday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/Monday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Tuesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/Tuesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Wednesday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/Wednesday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Thursday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/Thursday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Friday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/Friday.dat");
        return finalTextReader;
    }
    protected String getScheduleIP917Saturday(){
        String finalTextReader = fileReader(filePath.fileWay + "/group/group_IP917/Saturday.dat");
        return finalTextReader;
    }
}
