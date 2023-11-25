package input_output.nio;

import java.nio.file.Path;

public class CompareExample {
  public static void main(String[] args) {
    Path path1 = Path.of("C:/Users/E-Kate/Desktop/folderOne");
    Path path2 = Path.of("C:/Users/E-Kate/Desktop/folderOne");
    Path path3 = Path.of("C:/Users/E-Kate/Desktop/folderOne/folderTwo/file.txt");
    Path path4 = path3.subpath(4,6); // folder2/file.txt

    System.out.println(path4);
    System.out.println(path1.equals(path2));
    System.out.println(path1.equals(path3));
    System.out.println(path3.startsWith(path1));
    System.out.println(path3.endsWith(path4));
  }
}
