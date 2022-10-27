package strategy.handler.impl;

import strategy.handler.CommandHandler;

public class ExitCommandHandler implements CommandHandler {
  @Override
  public void handle() {
    System.exit(0);
  }
}
