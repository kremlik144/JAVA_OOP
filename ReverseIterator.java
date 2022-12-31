import java.util.Iterator;

public class ReverseIterator implements Iterator<Student>
{

    private int indexRevers;
    private StudentGroup studentGroup;

    public ReverseIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        indexRevers = studentGroup.getSize();
    }

    @Override
    public boolean hasNext() 
    {
        return (indexRevers > 0);          
    }

    @Override
    public Student next() 
    {
        return studentGroup.getStudent(--indexRevers);
    }
    
}
