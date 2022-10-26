package patterns.structuralPatterns.bridge;

public class PhpDeveloper implements Developer{
  @Override
  public void writeCode() {
    System.out.println("PHP developer write code");
  }
}
