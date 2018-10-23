package designpattern.抽象工厂;

public class FactoryBMW320 implements AbstractFactory{
      
    @Override  
    public Engine createEngine() {    
        return new EngineA();  
    }  
    @Override  
    public Aircondition createAircondition() {  
        return new AirconditionA();  
    }  
}  
