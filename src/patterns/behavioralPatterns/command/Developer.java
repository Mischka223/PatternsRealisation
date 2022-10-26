package patterns.behavioralPatterns.command;

public class Developer {

  private final Command insert;
  private final Command update;
  private final Command read;
  private final Command delete;

  public  Developer(Command insert, Command update, Command read, Command delete) {
    this.insert = insert;
    this.update = update;
    this.read = read;
    this.delete = delete;
  }


  public void insertRecord() {
    insert.execute();
  }

  public void updateRecord() {
    update.execute();
  }

  public void readRecord() {
    read.execute();
  }

  public void deleteRecord() {
    delete.execute();
  }
}
