package input_output.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JoinPathsExample {
  public static void main(String[] args) {
    Path path1 = Paths.get("C:/Users/E-Kate/Desktop/");
    Path resolve = path1.resolve("folder1/file.txt");
    System.out.println(resolve);

    Path path2 = Paths.get("folder2/file.txt");
    resolve = path1.resolve(path2);
    System.out.println(resolve);
  }
}
