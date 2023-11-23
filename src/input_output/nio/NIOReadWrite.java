package input_output.nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NIOReadWrite {
  static String str = "Working from home\n";
  static byte[] bytes = "is good\n".getBytes();
  static List<String> list = new ArrayList<>() {
    {
      add("apples");

      add("oranges");
    }
  };

  public static void main(String[] args) throws IOException {
    Path path = Path.of("C:/Users/E-Kate/Desktop/folderKate", "file.txt"); // it'll work provided there's a folder with this name on my desktop
    Files.write(path, bytes, StandardOpenOption.APPEND);
    Files.write(path, list, StandardOpenOption.APPEND);
    Files.writeString(path, str, StandardOpenOption.APPEND);

    try (OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.APPEND)) {
      outputStream.write(65);
    }
    try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
      bufferedWriter.write("I can't imagine any other way.");
    }

    // reading data

    String s = Files.readString(path);
    System.out.println(Files.readAllLines(path));
    byte[] bytes1 = Files.readAllBytes(path);

    InputStream inputStream =Files.newInputStream(path);
    BufferedReader bufferedReader = Files.newBufferedReader(path);

    System.out.println(inputStream);
    System.out.println(bufferedReader);
  }
}
