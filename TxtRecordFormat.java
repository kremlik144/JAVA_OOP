import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class TxtRecordFormat extends RecordFormat
{
    private Map<String, Integer> students;
    
    public TxtRecordFormat(Map<String, Integer> students) {
        this.students = students;
    }

    
    @Override
    public void writeDown() 
    {
        try(FileWriter writer = new FileWriter("txtFormat.txt"))
        {
            for(String key: students.keySet())
            {
                writer.write(key + " = " + students.get(key) + "\n");
            }

        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
    }
   
}