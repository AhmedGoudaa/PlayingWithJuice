package Modules;

import Annotation.Mail;
import Annotation.Sms;
import Serivces.MailService;
import Serivces.SmsService;
import Streams.Stream;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.typesafe.config.Config;
import Interfaces.Service;
import Providers.ConfigProvider;

public class MyModule extends AbstractModule {

    @Override
    protected void configure() {

        // provider bindings
        bindProviders();

        // service bindings
        bindServices();
    }


    private void bindProviders(){
       bind( Config.class ).toProvider( ConfigProvider.class ) ;
    }

    private void bindServices(){
        bind( Service.class ).annotatedWith( Mail.class ).to( MailService.class).in( Singleton.class );
        bind( Service.class ).annotatedWith( Sms.class ).to( SmsService.class ).in( Singleton.class );

        bind( Stream.class );
    }
}
