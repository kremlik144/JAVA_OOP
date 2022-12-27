import java.util.*;


/*
    Имеются данные о группе студентов. У каждого студента есть средний балл.
    - Создайте родительский класс "Записыватель В Файл".
    - Создайте 3 детских класса, которые записывают в файл информацию 
    о студентах в разных форматах: txt, Json, XML

*/

class Main 
{
    public static void main(String[] args) 
    {
        Map<String, Integer> student = new HashMap<>();

        student.put("Иванов Иван", 2);
        student.put("Петров Петр", 4);
        student.put("Савелий Великий", 5);
        student.put("Мартин Лютер", 3);
        student.put("Уолтер Уайт", 5);

        TxtRecordFormat txtRecord = new TxtRecordFormat(student);
        JsonRecordFormat jsonRecord = new JsonRecordFormat(student);
        XmlRecordFormat xmlRecord = new XmlRecordFormat(student);

        txtRecord.writeDown();
        jsonRecord.writeDown();
        xmlRecord.writeDown();

        
    }

}