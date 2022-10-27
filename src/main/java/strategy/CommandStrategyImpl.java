package strategy;

import java.util.Map;
import model.Command;
import strategy.handler.CommandHandler;
import strategy.handler.impl.CreateCommandHandler;
import strategy.handler.impl.DeleteCommandHandler;
import strategy.handler.impl.ExitCommandHandler;
import strategy.handler.impl.HelpCommandHandler;
import strategy.handler.impl.WriteCommandHandler;

public class CommandStrategyImpl implements CommandStrategy {
  private final Map<Command, CommandHandler> strategyMap;

  public CommandStrategyImpl() {
    strategyMap = Map.of(
        Command.CREATE, new CreateCommandHandler(),
        Command.DELETE, new DeleteCommandHandler(),
        Command.WRITE, new WriteCommandHandler(),
        Command.HELP, new HelpCommandHandler(),
        Command.EXIT, new ExitCommandHandler()
    );
  }

  @Override
  public CommandHandler get(String command) {
    return strategyMap.get(Command.valueOf(command.toUpperCase()));
  }
}
