package designpattern.代理模式.静态代理;

public class Main {
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.request();  //代理者代替真实者做事情
	}
}