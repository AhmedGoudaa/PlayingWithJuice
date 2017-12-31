import Modules.MyModule;
import com.google.inject.Module;
import Interfaces.BaseInjector;

public class Bootstrap {

    private final BaseInjector injector;

    private Bootstrap(Module[] modules) {
        this.injector =   MyInjector.CreateInjector(modules );
    }

    private Bootstrap() {
        this( new Module[]{new MyModule()} );
    }



    public static Bootstrap init(){
        return new Bootstrap();
    }

    public static Bootstrap init(Module[] modules ){
        return new Bootstrap(modules);
    }

    public BaseInjector getInjector() {
        return injector;
    }

}
