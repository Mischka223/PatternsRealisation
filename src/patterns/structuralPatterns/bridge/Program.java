package patterns.structuralPatterns.bridge;

public abstract class Program {

  protected Developer developer;

  abstract void developProgram();

  protected Program(Developer developer) {
    this.developer = developer;
  }

}
