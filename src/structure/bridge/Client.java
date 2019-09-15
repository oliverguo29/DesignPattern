package structure.bridge;

public class Client {

    public static void main(String[] args) {
        RemoteControl rc1 = new ConcreteRemoteControl1(new Sony());
        rc1.on();
        rc1.tuneChannel();
        rc1.off();

        System.out.println("*************************************");
        RemoteControl rc2 = new ConcreteRemoteControl1(new LG());
        rc2.on();
        rc2.tuneChannel();
        rc2.off();


    }
}
