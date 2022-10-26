package patterns.structuralPatterns.bridge;

public class BridgeMain {

  public static void main(String[] args) {


    Program[] programs = {
        new BankProgram(new JavaDeveloper()),
        new TelegramBot(new PhpDeveloper())};


    for (Program program : programs) {
      program.developProgram();
    }
  }
}
