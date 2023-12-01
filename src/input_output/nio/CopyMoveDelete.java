package input_output.nio;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyMoveDelete {
  public static void main(String[] args) throws IOException{
    Path srcPath = Path.of("example_folder/folder_level_1/folder_level_2/example_file.txt");
    Path destPath = Path.of("example_copied_files/folder_level_1/folder_level_2/example_file.txt");
// the copy directory has to be empty for the code to work

//    Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);

//    Files.deleteIfExists(destPath);
//    Files.move(srcPath, destPath);
//    Files.copy(srcPath, destPath);

    Path srcDir = Path.of("example_folder");
    Path destDir = Path.of("example_copied_files");
    Files.copy(srcDir, destDir);
    CopyDirectory.copy(srcDir, destDir);
  }
}

class CopyDirectory extends SimpleFileVisitor<Path> {
  private Path src, dest;

  private CopyDirectory(Path srcDirectory, Path destDirectory) {
    this.src = srcDirectory;
    this.dest = destDirectory;
  }

  public static boolean copy(Path srcPath, Path destPath) {
    CopyDirectory visitor = new CopyDirectory(srcPath, destPath);
    try {
      Files.walkFileTree(srcPath, visitor);
      return true;
    } catch (IOException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
    try {
      Path targetFile = dest.resolve(src.relativize(file));
      Files.copy(file, targetFile);
    } catch (IOException e) {
      System.err.println(e.getMessage());
      return FileVisitResult.TERMINATE;
    }
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attributes) {
    try {
      Path newDir = dest.resolve(src.relativize(dir));
      if (Files.notExists(newDir)) {
        Files.createDirectory(newDir);
      }
    } catch (IOException e) {
      System.err.println(e.getMessage());
      return FileVisitResult.TERMINATE;
    }
    return FileVisitResult.CONTINUE;
  }
}
