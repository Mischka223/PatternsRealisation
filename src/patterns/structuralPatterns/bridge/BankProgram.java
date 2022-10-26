package patterns.structuralPatterns.bridge;

public class BankProgram extends Program{

  protected BankProgram(Developer developer) {
    super(developer);
  }


  @Override
  void developProgram() {
    System.out.println("Development bank program in progress");
    developer.writeCode();
  }
}
