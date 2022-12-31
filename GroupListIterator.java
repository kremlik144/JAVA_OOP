import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student>
{

    private int indexNext = -1;
    private StudentGroup studentGroup;
    private int indexPrevios;

    public GroupListIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        indexPrevios = studentGroup.getSize();

    }



    @Override
    public boolean hasNext() {
        return (indexNext < studentGroup.getSize()-1); 
    }

    @Override
    public Student next() {
        return studentGroup.getStudent(++indexNext);
    }

    @Override
    public boolean hasPrevious() {
        return (indexPrevios > 0); 
    }

    @Override
    public Student previous() {
        return studentGroup.getStudent(--indexPrevios);
    }





    @Override
    public int nextIndex() {
        // TODO Auto-generated method stub
        return 0;
    }

    

    @Override
    public int previousIndex() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub
    }
    
}
