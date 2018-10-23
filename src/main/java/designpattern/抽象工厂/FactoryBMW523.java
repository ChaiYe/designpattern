package designpattern.抽象工厂;

public class FactoryBMW523 implements AbstractFactory {
  
     @Override  
    public Engine createEngine() {    
        return new EngineB();  
    }  
    @Override  
    public Aircondition createAircondition() {  
        return new AirconditionB();  
    }  
 
 
}
