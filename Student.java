
import java.time.LocalDate;

public class Student 
{
    private String name;
    private LocalDate data;
    private int gread;

    public Student(String name, LocalDate data, int gread) {
        this.name = name;
        this.data = data;
        this.gread = gread;
    }

    @Override
    public String toString() {
        return "Student [" + name + ", " + data + ", " + gread + "]";
    }

    
}
