package input_output;

import java.io.*;

public class BufferedInputOutputStreams {
//  BufferedInputStream and BufferedOutputStream are efficient when reading and writing large files in chunks

  static String filePath = "C:/Users/E-Kate/Desktop/file.txt";

  public static void main(String[] args) throws IOException {
    String phrase = "Inspirational quote";
    byte[] bytes = phrase.getBytes();

    try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
         BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
      bufferedOutputStream.write(bytes);
    }

    try (FileInputStream fileInputStream = new FileInputStream(filePath);
         BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      bufferedInputStream.mark(200);

      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      bufferedInputStream.reset();

      System.out.println("after reset");
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println((char) bufferedInputStream.read());
      System.out.println(new String(bufferedInputStream.readAllBytes()));

    }
  }

}
