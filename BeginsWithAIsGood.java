
public class BeginsWithAIsGood implements IsGood<String>{
    @Override
    public boolean isGood(String item) {
        char value = item.charAt(0);
        return (value == 'A');
    }
    
}
