package designpattern.策略模式_可以用在单元测试中;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyInterface() {
        //相关的业务
        System.out.println("策略A");
    }

}