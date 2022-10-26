package patterns.structuralPatterns.decorator;

import java.util.StringJoiner;

public class DeveloperDecorator implements Developer{
  Developer developer;
  String developerName;

  @Override
  public void makeJob() {
    developer.makeJob();
  }

  public DeveloperDecorator(Developer developer) {
    this.developer = developer;
  }
}
