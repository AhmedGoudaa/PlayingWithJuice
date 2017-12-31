package Serivces;

import Messages.Message;
import com.google.inject.Inject;
import Interfaces.Service;
import com.typesafe.config.Config;

import java.util.logging.Logger;


public class SmsService extends Service<Message> {

    @Inject
    public SmsService(Logger logger , Config config) {
        super.logger = logger;
        super.config = config;
    }




    @Override
    public void send(Message message) {
        logger.info( "Sent a sms message of body = "+ message.body+" ===>>>>... " );
    }

}
