package input_output.nio;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class TempFiles {
  public static void main(String[] args) throws IOException {
    Path path = Files.createTempFile("myApp", null);
    System.out.println(path.toAbsolutePath().toString());
    path.toFile().deleteOnExit();

    File file = new File("");
    file.toPath();
  }
}
