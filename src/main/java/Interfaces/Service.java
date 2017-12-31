package Interfaces;

import Messages.Message;
import com.typesafe.config.Config;

import java.util.logging.Logger;

public abstract class Service<M extends Message> {

    protected Logger logger;

    protected Config config;

    public Config getConfig() {
        return config;
    }

    public abstract void send(M message);
}
