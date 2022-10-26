package patterns.behavioralPatterns.command;

public class CommandMain {

  public static void main(String[] args) {
    Database database = new Database();

    Developer developer = new Developer(new InsertCommand(database), new UpdateCommand(database), new ReadCommand(database), new DeleteCommand(database));

    developer.insertRecord();
    developer.updateRecord();
    developer.readRecord();
    developer.deleteRecord();

  }

}
