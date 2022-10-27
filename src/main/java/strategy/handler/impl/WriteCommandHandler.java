package strategy.handler.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import strategy.handler.CommandHandler;
import strategy.handler.ScannerSingleton;

public class WriteCommandHandler implements CommandHandler {
  @Override
  public void handle() {
    System.out.println("Enter path to file: ");
    Scanner scanner = ScannerSingleton.getScanner();
    String pathToFile = scanner.nextLine();
    System.out.println("Enter your text: ");
    String text = scanner.nextLine();
    try {
      Files.write(Path.of(pathToFile), text.getBytes());
    } catch (IOException e) {
      throw new RuntimeException("Can't write to file with path: " + pathToFile);
    }
    System.out.println("Your file was being written");
  }
}
