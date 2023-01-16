import Model.AttendanceService;
import Presenter.Controller;
import View.AttendanceView;

class Main{
    public static void main(String[] args) {
        new Controller(new AttendanceService(239), new AttendanceView()).button();;
    }
}