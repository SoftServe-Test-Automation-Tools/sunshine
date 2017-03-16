package org.sstat.sunshine.location;

import org.sstat.sunshine.Artifact;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @since 16.03.2017
 */
public class CompositeLocation implements Location {
    private final List<Location> locations;

    public CompositeLocation(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public List<Artifact> files() {
        List<Artifact> files = new ArrayList<>();
        for (Location location : locations) {
            files.addAll(location.files());
        }
        return files;
    }
}
