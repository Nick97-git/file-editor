package strategy.handler.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import strategy.handler.CommandHandler;
import strategy.handler.ScannerSingleton;

public class DeleteCommandHandler implements CommandHandler {
  @Override
  public void handle() {
    System.out.println("Enter path to file: ");
    Scanner scanner = ScannerSingleton.getScanner();
    String pathToFile = scanner.nextLine();
    try {
      Files.delete(Path.of(pathToFile));
    } catch (IOException e) {
      throw new RuntimeException("Can't delete a file with path: " + pathToFile);
    }
    System.out.println("Your file was deleted");
  }
}
