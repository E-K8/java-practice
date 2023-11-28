package input_output.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectoryContentsFilterExample {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("C:/Users/E-Kate/Desktop/kat_folder"); // I created a folder with files in it

    File file = new File("C:/Users/E-Kate/Desktop/kat_folder");
    System.out.println(Arrays.toString(file.list()));

    try (Stream<Path> paths = Files.list(path)) {
      paths.filter(f -> f.endsWith("txt")).forEach(System.out::println);
    }

//    The block below walks through the directory structure up to a depth of 3 levels, including following symbolic links. ↓

    try (Stream<Path> paths = Files.walk(path, 3, FileVisitOption.FOLLOW_LINKS)) {
      List<Path> PDFs = paths.filter(p -> p.toString().endsWith(".pdf"))
          .collect(Collectors.toList());
      PDFs.forEach(System.out::println);
    }
  }
}
