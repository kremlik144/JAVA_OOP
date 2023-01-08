
public class BeginsWithIsGood implements IsGood<String>{
    private String line;
    private boolean flag;
    
    public BeginsWithIsGood(String line) {
        this.line = line;
    }

    @Override
    public boolean isGood(String item) {
        for(int i = 0; i < line.length(); i++)
        {
            if(line.charAt(i) == item.charAt(i)) flag = true;
            else flag = false;
        }
        return flag;
    }
    
}
