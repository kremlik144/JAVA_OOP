package Presenter;
import java.util.InputMismatchException;
import java.util.Scanner;
import Model.*;
import View.AttendanceView;


public class Controller {
    private AttendanceService model;
    private AttendanceView view;
    private int modeNumber;

    public Controller(AttendanceService model, AttendanceView view) {
        this.model = model;
        this.view = view;
    }

    public void button(){
        Scanner in = new Scanner(System.in);
         
        while(true){
            try {
                view.helloMessage();
                System.out.print("Enter a number: ");
                modeNumber = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered an invalid value. Restart the program");            
            }
        
            switch (modeNumber) {
                case 1:
                    view.print(model.getDataMode1());
                    break;
                case 2:
                    view.print(model.getDataMode2());
                    break;
                case 3:
                    view.print(model.getDataMode3());
                    break;
                case 4:
                    view.mode4(getModel());
                    break;
                case 0:
                    in.close();
                    return;
            }
        }  
    }

    public AttendanceService getModel() {
        return model;
    }
}
