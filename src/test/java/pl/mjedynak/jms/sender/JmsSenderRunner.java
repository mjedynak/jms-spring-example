package pl.mjedynak.jms.sender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class JmsSenderRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sender-context.xml");
        JmsSender jmsSender = (JmsSender) applicationContext.getBean("jmsSender");
        jmsSender.sendText("hellooooo " + new Date());
    }
}
