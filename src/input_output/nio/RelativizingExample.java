package input_output.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizingExample {
  public static void main(String[] args) {
    // create path between two known paths
    Path p1 = Paths.get("C:/Users/E-Kate/Desktop/folderOne");
    Path p2 = Paths.get("C:/Users/E-Kate/Desktop/folderOne/folderTwo");

    Path relative1 = p1.relativize(p2);
    System.out.println(relative1);

    relative1 = p2.relativize(p1);
    System.out.println( relative1);

    Path p3 = Paths.get("/Users/ryan/Desktop/Folder1");
    Path p4 = Paths.get("/Users/ryan/Desktop/Folder2");
    System.out.println(p3.relativize(p4));
  }
}

