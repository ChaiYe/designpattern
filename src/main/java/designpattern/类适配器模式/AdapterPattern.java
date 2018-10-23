package designpattern.类适配器模式;

public class AdapterPattern {

    public static void main(String[] args){

        Target mAdapter = new Adapter();
        mAdapter.Request();

    }
}
