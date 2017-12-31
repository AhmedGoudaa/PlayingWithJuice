import Interfaces.BaseInjector;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Stage;

public class MyInjector   implements BaseInjector{

    private final Injector injector ;

    private MyInjector( Injector injector) {

        this.injector = injector;
    }

    public static MyInjector CreateInjector(Stage stage, Module... modules){
        return new MyInjector( Guice.createInjector(stage , modules ) );
    }


    public static MyInjector CreateInjector(Module[] modules){
        return  MyInjector.CreateInjector(Stage.DEVELOPMENT , modules );
    }


    @Override
    public <T> T getInstance(Class<T> tClass) {
        return injector.getInstance( tClass );
    }

}
