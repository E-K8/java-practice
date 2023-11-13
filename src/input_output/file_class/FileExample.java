package input_output.file_class;

import java.io.File;
import java.io.IOException;

public class FileExample {
  public static void main(String[] args) {
    try {
      // Create a File object
      File myFile = new File("C:/Users/E-Kate/Desktop/testfile.txt");

      // Create a new file
      boolean fileCreated = myFile.createNewFile();
      if (fileCreated) {
        System.out.println("File created: " + myFile.getName());
      } else {
        System.out.println("File already exists.");
      }

      // Get file information
      System.out.println("Absolute path: " + myFile.getAbsolutePath());
      System.out.println("Writable: " + myFile.canWrite());
      System.out.println("Readable: " + myFile.canRead());
      System.out.println("File size in bytes: " + myFile.length());

//      // Delete the file

/*      boolean fileDeleted = myFile.delete();

      if (fileDeleted) {
        System.out.println("File deleted.");
      } else {
        System.out.println("Failed to delete the file.");
      }
      */
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
