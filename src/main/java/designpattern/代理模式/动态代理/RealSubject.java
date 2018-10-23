package designpattern.代理模式.动态代理;

public class RealSubject implements Subject {
 
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("真实对象");
	}
 
}