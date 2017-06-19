package io.github.tatools.sunshine.core;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @since 16.03.2017
 */
public class FileSystemOfClassesTest {
    @Test
    public void onlyFilesInFileSystem() throws FileSystemException {
        MatcherAssert.assertThat(
                new FileSystemOfClasses(new FileSystem.Fake(
                        Arrays.asList(
                                new FsPath.Fake("SomeTest.class"),
                                new FsPath.Fake("some-file.txt")
                        )
                )).files(),
                Matchers.hasSize(1)
        );
    }

    @Test
    public void filesAndJarsInFileSystem() throws FileSystemException {
        MatcherAssert.assertThat(
                new FileSystemOfClasses(
                        new FileSystemOfJarFile("build/sample-tests.jar")
                ).files(),
                Matchers.hasSize(5)
        );
    }
}