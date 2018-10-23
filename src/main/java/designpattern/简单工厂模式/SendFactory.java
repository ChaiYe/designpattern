package designpattern.简单工厂模式;

public class SendFactory {

    public Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("输入类型有误");
            return null;
        }
    }
}