import java.util.Scanner;
import strategy.CommandStrategy;
import strategy.CommandStrategyImpl;
import strategy.handler.CommandHandler;

public class Main {
  public static void main(String[] args) {
    FileEditor fileEditor = new FileEditor(new CommandStrategyImpl());
    fileEditor.run();
  }
}
