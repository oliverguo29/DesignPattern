package Create.singleton;

/**
 * 饿汉-线程安全，效率低于懒汉
 */
public class TestSingleton_hungry {
    private static TestSingleton_hungry uniqueInstance = new TestSingleton_hungry();

    private TestSingleton_hungry(){

    }

    public  static TestSingleton_hungry getInstance(){
        return uniqueInstance;
    }
}
