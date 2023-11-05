package input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamOutputStream {
      /*
         J  a  v  a  -  v  s  -  J  a  v  a  s  c  r  i  p  t
         0  1  2  3  4  5  6  7  8  9  10   11   12   13   14
                        1  2  3  4  5  6    7    8    9    10
    */

  // FileInputStream is meant for reading streams of raw bytes such as PDFs, images, MP3s, MP4s, ...
  //FileOutputStream is meant for writing streams of raw bytes such as PDFs, images, MP3s, MP4s, ...

  static String filePath = "C:/Users/E-Kate/Desktop/test.txt";

  public static void main(String[] args) throws FileNotFoundException, IOException {
/*    try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
      String sent = "\nJava vs Javascript\n";
      fos.write(67); // it will write a letter for this ASCII code ("C")
      fos.write(68); // "D"

      fos.write(sent.getBytes());

      fos.write(sent.getBytes(), 5, sent.length() - 5);
    }*/

    try(FileInputStream fis = new FileInputStream(filePath)) {
//      First way to read the file
      byte[] bytes = fis.readAllBytes();
      String readText = new String(bytes);
      System.out.println(readText);

//      Second way to read the file
      byte[] bytes1 = new byte[fis.available()];
      int read = fis.read(bytes1);
      System.out.println(read);
      String readText1 = new String(bytes1);
      System.out.println(readText1);

//      Third way
      int i;
      while ((i=fis.read()) !=-1) {
        System.out.println((char)i);
      }
    }
  }
}
