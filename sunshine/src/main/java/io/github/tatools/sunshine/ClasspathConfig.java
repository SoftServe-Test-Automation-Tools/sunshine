package io.github.tatools.sunshine;


/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @since 21.04.2017
 */
public class ClasspathConfig implements Config {

    private final Config config;

    public ClasspathConfig(String file) {
        config = new FileConfig(ClassLoader.getSystemResourceAsStream(file));
    }

    @Override
    public String property(String key) {
        return config.property(key);
    }
}
