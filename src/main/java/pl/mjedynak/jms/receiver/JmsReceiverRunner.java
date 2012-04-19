package pl.mjedynak.jms.receiver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class JmsReceiverRunner {

    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("receiver-context.xml");
        System.in.read();
    }
}
