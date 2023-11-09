package input_output;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayReaderWriter {
  static String filePath = "C:/Users/E-Kate/Desktop/file.txt";

  public static void main(String[] args) throws IOException {
    String string = "Java";
    char[] chars = string.toCharArray();

    try (CharArrayReader charArrayReader = new CharArrayReader(chars)) {
      int i;
      while ((i = charArrayReader.read()) != -1) {
        System.out.println((char) i);
      }
    }

    try (CharArrayWriter charArrayWriter = new CharArrayWriter();
         FileWriter fileWriter = new FileWriter(filePath)) {
      charArrayWriter.write("\nI love Java");
      charArrayWriter.write("\nI really do");
      System.out.println(charArrayWriter);
      charArrayWriter.writeTo(fileWriter);
    }
  }
}
