package Streams;

import Annotation.Mail;
import Annotation.Sms;
import Messages.Message;
import com.google.inject.Inject;
import Interfaces.Service;

import java.util.List;

public class Stream {

    @Inject @Mail
    public Service mailService;

    @Inject @Sms
    public Service smsService;


    public void sendMail(Message message){
        mailService.send( message );
    }

    public void sendMails(List<Message> messages){
        for (Message message: messages
             ) {
            mailService.send( message );
        }
    }


    public void sendSms(Message message){
        smsService.send( message );
    }

    public void sendSmss(List<Message> messages){
        for (Message message: messages
                ) {
            smsService.send( message );
        }
    }

}
