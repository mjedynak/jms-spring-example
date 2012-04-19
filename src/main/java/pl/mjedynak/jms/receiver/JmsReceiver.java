package pl.mjedynak.jms.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.Message;
import javax.jms.MessageListener;

public class JmsReceiver implements MessageListener {

    private final Logger logger = LoggerFactory.getLogger(JmsReceiver.class);

    public void onReceive(String text) {
        logger.debug("Received: " + text);
    }

    @Override
    public void onMessage(Message message) {
        logger.debug("Received: " + message);
    }
}
