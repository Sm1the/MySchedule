package sample;

public class ItemList {

    protected String setNameGroup(int numberGroup){
        String nameGroup[] = {"ИП-911","ИП-912","ИП-913","ИП-914","ИП-915","ИП-916","ИП-917"};
        return nameGroup[numberGroup];
    }

    protected String setToDay(int numberDay){
        String toDay[] = {"Понедельник","Вторник","Среда","Четверг","Пятница","Суббота"};
        return toDay[numberDay];
    }

    protected String setGroupPath(int numberGroupPath){
        String groupPath[] = {"group_IP911","group_IP912","group_IP913","group_IP914","group_IP915","group_IP916","group_IP917"};
        return groupPath[numberGroupPath];
    }

    protected String setDayPath(int numberDayPath){
        String dayPath[] = {"/Monday.dat","/Tuesday.dat","/Wednesday.dat","/Thursday.dat","/Friday.dat","/Saturday.dat"};
        return dayPath[numberDayPath];
    }
}
