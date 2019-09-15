package structure.facade;

public class Facade {
    private SubSystem subSystem=new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTv();
        subSystem.setCD("movie");
        subSystem.startWatch();
    }
}
