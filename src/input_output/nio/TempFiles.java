package input_output.nio;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class TempFiles {
  public static void main(String[] args) throws IOException {
    // Create a temporary file
    Path tempFilePath = Files.createTempFile("myApp", null);
    System.out.println("Temporary file created at: " + tempFilePath.toAbsolutePath());

    // Schedule the temporary file for deletion on exit
    tempFilePath.toFile().deleteOnExit();

    // Create a File object from the Path
    File tempFile = tempFilePath.toFile();

    // Example operation on the File object (e.g., writing to the file)
    try (FileWriter writer = new FileWriter(tempFile)) {
      writer.write("Sample content for temporary file.");
    }

    // Print the path of the file again to confirm the operation
    System.out.println("Temporary file modified at: " + tempFile.getAbsolutePath());
  }
}
