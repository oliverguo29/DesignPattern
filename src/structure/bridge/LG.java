package structure.bridge;

public class LG extends  TV {
    @Override
    public void on() {
        System.out.println("LG on");
    }

    @Override
    public void off() {
        System.out.println("LG off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("LG tunechannel");
    }
}
