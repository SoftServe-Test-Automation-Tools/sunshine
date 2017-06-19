package io.github.tatools.sunshine.core;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @since 24.04.2017
 */
public interface FsPath {
    // @todo #91:1h Rename to FileSystemPath. Make sure all implementaions have self-explained names.
    Path path();

    boolean exist();

    final class Fake implements FsPath {

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
