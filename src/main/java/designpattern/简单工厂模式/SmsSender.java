package designpattern.简单工厂模式;

public class SmsSender implements Sender {
    public void send() {
        System.out.println("send SMS!");
    }
}