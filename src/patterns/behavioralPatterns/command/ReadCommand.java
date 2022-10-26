package patterns.behavioralPatterns.command;

public class ReadCommand implements Command{

  Database database;

  public ReadCommand(Database database) {
    this.database = database;
  }

  @Override
  public void execute() {
    database.read();
  }
}
