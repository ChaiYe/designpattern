package designpattern.策略模式_可以用在单元测试中;

public class Test {

    public static void main(String[] args) {
        Strategy strategy=new ConcreteStrategyA();

        Context context = new Context(strategy);

        context.contextInterface();

    }

}
