package strategy.handler;

import java.util.Scanner;

public class ScannerSingleton {
  private static final Scanner scanner = new Scanner(System.in);

  public static Scanner getScanner() {
    return scanner;
  }
}
