package Model;
import java.util.ArrayList;
import java.util.List;


public class StudentsGroup{
    private int numberGroup;
    private List<Student> students;
    
    public StudentsGroup(int numberGroup) {
        this.numberGroup = numberGroup;
        this.students = new ArrayList<>();
    }

    public void add(Student user){
        students.add(user);
    }

    @Override
    public String toString() {
        return "Number Group №" + numberGroup + "\n" + printSt(students);
    }

    public String printSt(List<Student> students){
        String result = "";
        for(Student line: students){
            result += line.toString();
            result += "\n";
        }
        return result;
    }

    public List<Student> getStudents() {return students;}

}
