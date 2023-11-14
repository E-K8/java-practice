package input_output.file_class;

import java.io.File;
import java.util.Arrays;

public class ListFilesDirectories {
  public static void main(String[] args) {
    File dir = new File("K:\\temporary");
    if (!dir.exists() || !dir.isDirectory()) {
      System.out.println("The path is not a directory or doesn't exist.");
      return;
    }

    String[] listOne = dir.list();
    System.out.println("List one, list ↓ ");
    if (listOne != null) {
      System.out.println(Arrays.toString(listOne));
    } else {
      System.out.println("No files found or an error occurred.");
    }

    File[] listTwo = dir.listFiles();
    System.out.println("List two, listFiles ↓");
    if (listTwo != null) {
      System.out.println(Arrays.toString(listOne));
    } else {
      System.out.println("No files found or an error occurred.");
    }

    System.out.println("List three, filtered to pdf only: ↓");
    File[] listThree = dir.listFiles((dirOne, name) -> name.toLowerCase().contains("pdf"));
    if (listThree != null) {
      for (File file : listThree) {
        System.out.println(file.getName());
      }
    } else {
      System.out.println("No .txt files found or an error occurred.");
    }

    traverseDirectory(dir);
  }

  static void traverseDirectory(File dir) {
    File[] listFour = dir.listFiles();
    assert listFour != null;
    for (File file : listFour) {
      if (file.isDirectory()) {
        System.out.println("directory: " + file.getName());
        traverseDirectory(file);
      } else {
        System.out.println("file found: " + file.getName());
      }
    }
  }
}
