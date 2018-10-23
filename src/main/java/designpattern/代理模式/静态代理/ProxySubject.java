package designpattern.代理模式.静态代理;

public class ProxySubject extends Subject {
	
	private RealSubject realSubject = null;
	
	/**
	 * 除了代理真实角色做该做的事情，代理角色也可以提供附加操作，
	 * 如：preRequest()和postRequest()
	 */
	@Override
	public void request() {
		preRequest();  //真实角色操作前的附加操作
		
		if(realSubject == null){
			realSubject =  new RealSubject();
		}
		realSubject.request();
		
		postRequest();  //真实角色操作后的附加操作
	}
 
	/**
	 *	真实角色操作后的附加操作
	 */
	private void postRequest() {
		// TODO Auto-generated method stub
		System.out.println("王婆后");
	}
 
	/**
	 *	真实角色操作前的附加操作
	 */
	private void preRequest() {
		// TODO Auto-generated method stub
		System.out.println("王婆前");
	}
 
}
