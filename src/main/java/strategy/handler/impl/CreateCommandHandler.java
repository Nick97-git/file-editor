package strategy.handler.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import strategy.handler.CommandHandler;
import strategy.handler.ScannerSingleton;

public class CreateCommandHandler implements CommandHandler {
  @Override
  public void handle() {
    Scanner scanner = ScannerSingleton.getScanner();
    while (true) {
      System.out.println("Enter path to file: ");
      String pathToFile = scanner.nextLine();
      try {
        Files.createFile(Path.of(pathToFile));
        break;
      } catch (IOException e) {
        System.out.println("Can't create a file with path: " + pathToFile);
        System.out.println("You should enter a valid path");
      }
    }
    System.out.println("Your file was created");
  }
}
