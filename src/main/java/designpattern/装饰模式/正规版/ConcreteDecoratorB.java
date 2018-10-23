package designpattern.装饰模式.正规版;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    
    @Override
    public void sampleOperation() {
         super.sampleOperation();
        // 写相关的业务代码
        System.out.println("原本的基础上加了B");
    }
}