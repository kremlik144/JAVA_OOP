
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
    1.	Класс Группа содержит в себе коллекцию Студентов. По группе можно
    перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы).
    Остальные задачи надстраиваются поверх неё.

    2.	Создайте класс GroupListIterator, который позволяет перемещаться по группе
    в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
    Добавьте в Группу метод listIterator (), который позволяет начать итерацию
    с помощью GroupListIterator.

    3.	Создайте класс ReverseIterator, который работает как итератор по группе в
    обратном направлении:
    • Он отслеживает текущую позицию в переборе
    • Он изначально выставлен на конечную позицию
    • Он движется справа налево
    Проверьте, как он работает.
*/

class Main 
{
    public static void main(String[] args) 
    {
        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Ivan", LocalDate.of(1998, 3, 27), 5));
        listStudents.add(new Student("Alex", LocalDate.of(2000, 10, 10), 4));
        listStudents.add(new Student("Makar", LocalDate.of(2001, 12, 20), 3));

        StudentGroup group = new StudentGroup(listStudents);

        System.out.println("1 Часть");
        for(Student student: group)
        {
            System.out.println(student);
        }

        GroupListIterator it1 = new GroupListIterator(group);
        
        System.out.println("\n2 Часть");
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
        System.out.println("\n");

        while(it1.hasPrevious())
        {
            System.out.println(it1.previous());
        }


        System.out.println("\n3 Часть");
        Iterator<Student> it2 = group.reversIterator();
        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }


        

    }

}