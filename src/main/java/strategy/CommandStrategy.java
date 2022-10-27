package strategy;

import strategy.handler.CommandHandler;

public interface CommandStrategy {
  CommandHandler get(String command);
}
