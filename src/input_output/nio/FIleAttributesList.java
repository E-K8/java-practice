package input_output.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class FIleAttributesList {
  public static void main(String[] args) throws IOException {
    Path absPath = Paths.get("C:/Users/E-Kate/Desktop/FileAttributesList"); // this directory doesn't exist in the current working directory of my Java program, so this is going to throw an error
    Path directoryPath = Paths.get("Folder1");
    Path filePath = Paths.get("Folder1", "text.txt");

    System.out.println("directoryPath: " + directoryPath);
    System.out.println("isAbsolute: " + absPath.isAbsolute());
    System.out.println("Absolute Path: " + directoryPath.toAbsolutePath());
    System.out.println("URI: " + directoryPath.toUri());

    System.out.println("Name: " + directoryPath.getFileName());
    System.out.println("Parent: " + directoryPath.getParent());
    System.out.println("Root: " + directoryPath.toAbsolutePath().getRoot());

    System.out.println("Exist: " + Files.exists(directoryPath));
    System.out.println("Not Exist: " + Files.notExists(directoryPath));
    System.out.println("Hidden: " + Files.isHidden(directoryPath));
    System.out.println("Is Readable: " + Files.isReadable(filePath));

    BasicFileAttributes basicFileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);
    PosixFileAttributes posixFileAttributes = Files.readAttributes(filePath, PosixFileAttributes.class);
    DosFileAttributes DosFileAttributes = Files.readAttributes(filePath, DosFileAttributes.class);

    System.out.println(basicFileAttributes.creationTime());
    System.out.println(basicFileAttributes.isDirectory());
    System.out.println(basicFileAttributes.lastAccessTime());
    System.out.println(basicFileAttributes.lastModifiedTime());
    System.out.println(basicFileAttributes.isRegularFile());
    System.out.println(basicFileAttributes.size());
  }
}
