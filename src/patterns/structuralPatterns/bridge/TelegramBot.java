package patterns.structuralPatterns.bridge;

public class TelegramBot extends Program {

  protected TelegramBot(Developer developer) {
    super(developer);
  }

  @Override
  void developProgram() {
    System.out.println("Development telegram bot program in progress");
    developer.writeCode();
  }
}
