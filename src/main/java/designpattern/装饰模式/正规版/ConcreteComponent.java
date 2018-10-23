package designpattern.装饰模式.正规版;

public class ConcreteComponent implements Component {

    @Override
    public void sampleOperation() {
        // 写相关的业务代码
        System.out.println("原本的");
    }

}