package Task1;
import java.util.Arrays;
import java.util.List;
import Task1.Blockings.*;
import Task1.Phone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone phone = new Iphone("Iphone 15 Pro");
        List<Unlocker> modes = Arrays.asList(
                    new PinUnlocker(1, 2517),
                    new FingerprintUnlocker(2, "указательный палец Валеры"),
                    new FaceIDUnlocker(3, "лицо Виталика")
                    );

        for(Unlocker<Object> mode: modes){
            phone.unlockPhone(mode);
        }
    }
}
