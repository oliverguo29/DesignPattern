package structure.adapter;

/**
 * 通过此适配器，将火鸡转换成鸭子使用
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }
}
