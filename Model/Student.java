package Model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private String nameStudent;
    private List<String> attendance;
    private float attendancePercentage;
    private Random rand = new Random();

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
        this.attendance = new ArrayList<>();

        for(int i = 1; i < 15; i++){
            String time = LocalDate.of(2023, 02, i).toString();
            Boolean flag = rand.nextBoolean();
            if(flag == true) attendancePercentage++;
            attendance.add(time + " " + flag);
        }
    }

    @Override
    public String toString() {
        return "Student: " + nameStudent + "\nAttendance:\n\t" + toStringAttendance(attendance);
    }

    public String toStringAttendance(List<String> attendance) {
        String result = "";
        for(String line: attendance) {result += line + "\n\t";}
        return result;
    }

    public String getNameStudent() {return nameStudent;}

    public float getAttendancePercentage() {return (float)attendancePercentage / attendance.size() * 100;}
}
