package input_output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
//  FileReader is for reading streams of characters
//  FileWriter is for writing streams of characters

  static String filePath = "C:/Users/E-Kate/Desktop/file.txt";

  public static void main(String[] args) throws IOException {
    String string1 = "Learning is cool.\n";
    String string2 = "Learning is awesome.\n";

    try(FileWriter fw = new FileWriter(filePath, true)) {
      fw.write(string1);
      fw.write(string2);
    }

    try(FileReader fr = new FileReader(filePath)){
      int i;
      while((i = fr.read()) !=-1) {
        System.out.println((char) i);
      }
    }

  }

}
