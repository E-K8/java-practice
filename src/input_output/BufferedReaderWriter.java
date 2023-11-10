package input_output;

import java.io.*;
import java.util.List;

public class BufferedReaderWriter {
  static String filePath = "C:/Users/E-Kate/Desktop/file.txt";

  public static void main(String[] args) throws IOException {
    String phrase = "Hey you";
    char[] chars = phrase.toCharArray();

//    try (FileWriter fileWriter = new FileWriter(filePath);
//         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
//      bufferedWriter.write(phrase);
//      bufferedWriter.newLine();
//      bufferedWriter.write(chars);
//    }

    try (FileReader fileReader = new FileReader(filePath);
         BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      List<String> list = bufferedReader.lines().filter(l -> l.contains("day")).toList(); // it says "day" because I changed the created file's contents with words containing "day"
      System.out.println(list);

      System.out.println(bufferedReader.readLine());
      System.out.println(bufferedReader.readLine());
      bufferedReader.mark(200);
      System.out.println(bufferedReader.readLine());
      System.out.println(bufferedReader.readLine());
      bufferedReader.reset();
      System.out.println(bufferedReader.readLine());
      System.out.println(bufferedReader.readLine());

      String sentence;
      while ((sentence = bufferedReader.readLine()) != null) {
        System.out.println(sentence);
      }
    }
  }
}
