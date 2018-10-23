package designpattern.简单工厂模式;

public class Test {

    public static void main(String[] args) {
        /*简单工厂模式*/
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("mail");
        sender.send();
        sender = sendFactory.produce("sms");
        sender.send();
    }
}
