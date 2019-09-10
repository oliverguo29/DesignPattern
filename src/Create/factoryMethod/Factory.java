package Create.factoryMethod;



public abstract  class Factory {
    abstract  public Product factoryMethod();

    public  void dosomething(){
        Product product = factoryMethod();
    }
}
