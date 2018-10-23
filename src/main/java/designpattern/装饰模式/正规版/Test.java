package designpattern.装饰模式.正规版;

public class Test {

    public static void main(String[] args) {

         Component component = new ConcreteComponent();

         Component changComponent=new ConcreteDecoratorA(component);
         Component changComponent1=new ConcreteDecoratorB(changComponent);

         changComponent1.sampleOperation();

    }

}
