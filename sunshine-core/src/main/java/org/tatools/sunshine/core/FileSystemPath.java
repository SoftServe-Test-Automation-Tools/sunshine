package org.tatools.sunshine.core;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public interface FileSystemPath {
    Path path();

    boolean exist();

    final class Fake implements FileSystemPath {

        private final Path path;
        private final boolean exist;

        public Fake() {
            this(Paths.get("."), false);
        }

        public Fake(String path) {
            this(Paths.get(path), false);
        }

        public Fake(String path, boolean exist) {
            this(Paths.get(path), exist);
        }

        public Fake(Path path, boolean exist) {
            this.path = path;
            this.exist = exist;
        }

        @Override
        public Path path() {
            return path;
        }

        @Override
        public boolean exist() {
            return exist;
        }
    }
}
