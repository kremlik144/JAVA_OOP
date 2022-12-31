
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student> 
{
    List<Student> students;

    public StudentGroup(List<Student> students) 
    {
        this.students = students;
    }

    public int getSize() 
    {
        return this.students.size();
    }

    public Student getStudent(int index) 
    {
        return students.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public ListIterator<Student> listIterator() {
        return new GroupListIterator(this);
    }

    public Iterator<Student> reversIterator() {
        return new ReverseIterator(this);
    }
    

    
}
