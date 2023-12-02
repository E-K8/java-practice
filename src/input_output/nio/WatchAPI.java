package input_output.nio;

import java.io.IOException;
import java.nio.file.*;

public class WatchAPI {
  public static void main(String[] args) throws IOException {
    try (WatchService watchService = FileSystems.getDefault().newWatchService()) {
      Path dir = Paths.get("C:/Users/E-Kate/Desktop/kat_folder");

      dir.register(watchService, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY);

      WatchKey watchKey = null;

      try {
        watchKey = watchService.take();
      } catch (InterruptedException e) {
        // Handle the InterruptedException here
        e.printStackTrace();
        return;
      }

      do {
        for (WatchEvent<?> event : watchKey.pollEvents()) {
          System.out.println("Kind of event: " + event.kind());
          System.out.println("Context of event: " + event.context());
          System.out.println("Count of event: " + event.count());
        }
      } while (watchKey.reset());
    }
  }
}
