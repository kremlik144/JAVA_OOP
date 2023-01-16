package View;
import Model.AttendanceService;
import java.util.List;

public class AttendanceView {
    public void helloMessage(){
        StringBuilder startMessage = new StringBuilder()
            .append("\n ==== \n")
            .append("1 - Распечатать всех студентов и их посещаемость\n")
            .append("2 - Распечатать студентов, отсовтировав их по убыванию посещаемости\n")
            .append("3 - Распечатать студентов с посещаемостью ниже 25%\n")
            .append("4 - Распечатать всю группу\n")
            .append("0 - Выход\n")
            .append(" ==== \n");
        System.out.println(startMessage);
    }

    public void print(List<String> data) {for(String value: data) System.out.println(value);}

    public void mode4(AttendanceService data) {System.out.println(data);}
}
