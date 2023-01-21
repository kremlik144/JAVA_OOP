package Task1.Phone;
import Task1.Blockings.Unlocker;

public class Iphone{
    private String name;
    private Boolean status;
   
    public Iphone(String name) {
        this.name = name;
        this.status = false;
    }

    public Boolean getStatus() {
        return status;
    }

    public void unlockPhone(Unlocker mode){
        status = true;
        System.out.println(lockStatus(mode));
    }

    public void blockPhone(){
        status = false;
    }

    private String lockStatus(Unlocker mode){
        if(status) return name + " unlocked :)" + " Password: " + mode.unlock();
        else return name + " is locked :(";
    }
}
