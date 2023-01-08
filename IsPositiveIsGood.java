
public class IsPositiveIsGood implements IsGood<Integer>{
    @Override
    public boolean isGood(Integer item) {
        return (item > 0);
    }
    
}
