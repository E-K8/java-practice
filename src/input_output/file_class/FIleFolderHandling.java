package input_output.file_class;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FIleFolderHandling {
  public static void main(String[] args) throws IOException {
    String desktopPath = "C:/Users/E-Kate/Desktop";
    File directory = new File(desktopPath, "/JavaFolder");
    if (directory.mkdirs()) {
      System.out.println("Directory created...");
    }
    File file = new File(directory, "/file.txt");
    if (file.createNewFile()) {
      System.out.println("file created...");
    }

//    get information
    System.out.println("Relative file path: " + file.getPath());
    System.out.println("Absolute file path: " + file.getAbsolutePath());
    System.out.println("File exists: " + file.exists());
    System.out.println("Is file: " + file.isFile());
    System.out.println("Is directory: " + file.isDirectory());
    System.out.println("Is hidden: " + file.isHidden());
    System.out.println("Last modified in milliseconds: " + file.lastModified());

    ZonedDateTime lastModified = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault());
    System.out.println("Last modified date time: " + lastModified);

//    check permissions
    System.out.println("Can read: " + file.canRead());
    System.out.println("Can write: " + file.canWrite());
    System.out.println("Can execute: " + file.canExecute());

    file.setWritable(true);
    try (FileWriter fileWriter = new FileWriter(file)) {
      fileWriter.write("So here we are cracking jokes(c)");
    }
  }
}
