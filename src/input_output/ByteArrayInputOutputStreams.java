package input_output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputStreams {
  static String filePath = "C:/Users/E-Kate/Desktop/arr.txt";

  public static void main(String[] args) throws IOException {
    String word = "Java";
    byte[] bytes = word.getBytes();

    try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes)) {
      System.out.println(byteArrayInputStream.available());
      for (int i = 0; i < bytes.length; i++) {
        System.out.println((char) byteArrayInputStream.read());
      }
    }

    try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
         FileOutputStream fileOutputStream = new FileOutputStream(filePath, true)) {

      System.out.println(byteArrayOutputStream.size());

      byteArrayOutputStream.write('K');
      byteArrayOutputStream.write('a');
      byteArrayOutputStream.write('t');
      byteArrayOutputStream.write('e');

      System.out.println(byteArrayOutputStream.size());

      System.out.println(byteArrayOutputStream);

      byteArrayOutputStream.writeTo(fileOutputStream);
      byteArrayOutputStream.flush();
    }
  }
}
