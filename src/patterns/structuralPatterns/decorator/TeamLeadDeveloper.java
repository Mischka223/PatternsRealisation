package patterns.structuralPatterns.decorator;

import java.util.StringJoiner;

public class TeamLeadDeveloper extends DeveloperDecorator{
  public TeamLeadDeveloper(Developer developer) {
    super(developer);
    super.developerName = "teamLeadDeveloper";
  }

  public void prioritiseTasks(){
    System.out.println(" Prioritise tasks. ");
  }

  @Override
  public void makeJob() {
    super.makeJob();
    prioritiseTasks();
  }
}
