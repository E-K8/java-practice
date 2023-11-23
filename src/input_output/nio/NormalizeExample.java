package input_output.nio;

import java.nio.file.Path;

public class NormalizeExample {
  public static void main(String[] args) {
    // paths to desktop

    Path path1 = Path.of("C:/Users/E-Kate/Desktop/./././");
    Path path2 = Path.of("C:/Users/E-Kate/Desktop/folderKate/../temp/./");
    Path path3 = Path.of("C:/Users/E-Kate/Desktop");

    System.out.println(path1.normalize());
    System.out.println(path2.normalize());
    System.out.println(path3.normalize());
  }
}
