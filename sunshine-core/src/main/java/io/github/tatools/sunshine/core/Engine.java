package io.github.tatools.sunshine.core;

/**
 * The {@link Engine} interface declares a way to implement different unit test engines.
 *
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @since 17.03.2017
 */
public interface Engine<Listener> {

    /**
     * Runs tests in an engine.
     */
    void run();

    /**
     * Allow to get new instance of an engine with provided listeners.
     *
     * @param listeners an instance (or instances) of engine's listeners
     * @return new instance of an engine
     */
    Engine<Listener> with(Listener... listeners);
}