package model;

public enum Command {
  CREATE("creates a file"),
  DELETE("deletes a file"),
  WRITE("writes to file"),
  HELP("shows available commands"),
  EXIT("finishes the work of the program");

  private final String description;

  Command(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
