package structure.bridge;

public class Sony extends TV {

    @Override
    public void on() {
        System.out.println("sony on");
    }

    @Override
    public void off() {
        System.out.println("sony off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("sony tunechannel");
    }
}
