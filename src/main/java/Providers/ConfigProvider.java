package Providers;

import com.google.inject.Provider;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ConfigProvider implements Provider<Config> {

    @Override
    public Config get() {

        // then i can load from any location
        return ConfigFactory.load();
    }
}
