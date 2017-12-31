import Messages.Message;
import Streams.Stream;

public class Main {

    public static void main(String[] args) {
        Bootstrap init = Bootstrap.init();

        Streams.Stream stream = init.getInjector().getInstance( Stream.class );

        Message mail = new Message( "Fuck it with mail " );

        stream.sendMail( mail );


        Message sms = new Message( "Fuck it with sms " );
        stream.sendSms( sms );

        System.out.println("Config SMS => "+stream.smsService.getConfig().hashCode());
        System.out.println("Config SMS => "+stream.mailService.getConfig().hashCode());

        if (stream.smsService.getConfig().equals( stream.mailService.getConfig() )){
            System.out.println("There is one instance of  typesafe Config ");
        }

    }
}
