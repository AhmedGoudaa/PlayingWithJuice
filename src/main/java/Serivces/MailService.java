package Serivces;

import Messages.Message;
import com.google.inject.Inject;
import Interfaces.Service;
import com.typesafe.config.Config;

import java.util.logging.Logger;

public class MailService extends Service<Message> {

    @Inject
    public MailService(Logger logger , Config config) {
    super.logger = logger;
    super.config = config;
    }


    @Override
    public void send(Message message) {
        logger.info( "Sent a mail message of body = "+ message.body+" ===>>>>... " );
    }
}
