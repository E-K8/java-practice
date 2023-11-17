package input_output.nio;

import java.io.IOException;
import java.nio.file.*;

public class NioPathInterface {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("C:/Users/E-Kate/Desktop/folderKate");
    if (Files.notExists(path)){
      Files.createDirectories(path);
    }
    Path anotherPath = FileSystems.getDefault().getPath("");
    Path filePath = Paths.get(path.toString(),"text.txt");
    if(Files.notExists((filePath))) {
      Files.createFile(filePath);
    }
  }
}
