package designpattern.对象适配器模式;

public class AdapterPattern {
    public static void main(String[] args){
        //需要先创建一个被适配类的对象作为参数  
        Target mAdapter = new Adapter(new Adaptee());
        mAdapter.Request();

    }
}
