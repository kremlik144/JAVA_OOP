import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JsonRecordFormat extends RecordFormat
{
    private Map<String, Integer> students;
    
    public JsonRecordFormat(Map<String, Integer> students) {
        this.students = students;
    }

    @Override
    public void writeDown() 
    {
        try(FileWriter writer = new FileWriter("JsonFormat.json"))
        {
            int count = 0;
            writer.write("{\n");
            for(String keys: students.keySet())
            {
                String key = String.format("\"%s\"", keys);
                String value = String.format("\"%d\"", students.get(keys));
                writer.write(String.format("\t%s : %s%s\n", key, value,
                             count < students.size()-1 ? "," : ""));
                count++;
            }
            writer.write("}\n");
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
    }

}
