package create.singleton;

/**
 *      单例模式： 懒汉型
 *      线程不安全，除非加锁
 */
public class TestSingleton_lazy {
    private static  TestSingleton_lazy uniqueInstance;

    private TestSingleton_lazy(){

    }

    public  static synchronized  TestSingleton_lazy getInstance(){      //加锁，效率低
        if(uniqueInstance==null){
            uniqueInstance=new TestSingleton_lazy();
        }
        return uniqueInstance;
    }
}
