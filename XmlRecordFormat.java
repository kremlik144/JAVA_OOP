import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class XmlRecordFormat extends RecordFormat
{
    private Map<String, Integer> students;
    
    public XmlRecordFormat(Map<String, Integer> students) {
        this.students = students;
    }

    @Override
    public void writeDown() 
    {
        try(FileWriter writer = new FileWriter("xmlFormat.xml"))
        {
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
            writer.write("<data>\n");
            for(String keys: students.keySet())
            {
                writer.write("\t<student>\n");
                writer.write(String.format("\t\t<name>%s</name>\n", keys));
                writer.write(String.format("\t\t<grade>%s</grade>\n", students.get(keys)));
                writer.write("\t</student>\n");
            }
            writer.write("</data>\n");
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
    }
    
}
