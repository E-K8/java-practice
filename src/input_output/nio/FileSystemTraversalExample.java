package input_output.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSystemTraversalExample {
  public static void main(String[] args) throws IOException {
    MyFileVisitor visitor = new MyFileVisitor();
    Path path = Path.of("C:/Users/E-Kate/Desktop/kat_folder"); //there's a folder with PDFs

    Files.walkFileTree(path, visitor);
  }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException{
    System.out.println("At file: " + file);
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attributes) throws IOException{
    System.out.println("Before visiting: " + dir);
    return FileVisitResult.CONTINUE;
  }
}
