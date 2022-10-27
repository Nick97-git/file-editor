import java.util.Scanner;
import strategy.CommandStrategy;
import strategy.CommandStrategyImpl;
import strategy.handler.CommandHandler;
import strategy.handler.ScannerSingleton;

public class FileEditor {
  private final CommandStrategy commandStrategy;

  public FileEditor(CommandStrategy commandStrategy) {
    this.commandStrategy = commandStrategy;
  }

  public void run() {
    Scanner scanner = ScannerSingleton.getScanner();
    while (true) {
      System.out.println("Enter command: ");
      String command = scanner.nextLine();
      CommandHandler commandHandler = commandStrategy.get(command);
      commandHandler.handle();
    }
  }
}
