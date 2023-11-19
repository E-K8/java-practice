package input_output.nio;

import java.io.IOException;
import java.nio.file.*;

public class NioPathInterface {
  public static void main(String[] args) throws IOException {
    // Create a path for the directory
    Path directoryPath = Paths.get("C:/Users/E-Kate/Desktop/folderKate");

    // Create directory if it does not exist
    if (Files.notExists(directoryPath)) {
      Files.createDirectories(directoryPath);
    }

    // Create a path for a new file within the directory
    Path filePath = directoryPath.resolve("text.txt");

    // Create the file if it does not exist
    if (Files.notExists(filePath)) {
      Files.createFile(filePath);
    }

    // Get the current working directory
    Path currentDirectory = FileSystems.getDefault().getPath("").toAbsolutePath();

    // Ensure both paths are on the same root
    if (filePath.getRoot().equals(currentDirectory.getRoot())) {
      // Find and print the relative path
      Path relativePath = currentDirectory.relativize(filePath.toAbsolutePath());
      System.out.println("Relative path from current directory to the file: " + relativePath);
    } else {
      System.out.println("Cannot relativize: Paths are on different roots.");
      System.out.println("File path: " + filePath.toAbsolutePath());
      System.out.println("Current directory: " + currentDirectory);
    }
  }
}
