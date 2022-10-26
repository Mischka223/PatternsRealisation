package patterns.structuralPatterns.decorator;

public class DecoratorMain {

  public static void main(String[] args) {
    Developer developer = new TeamLeadDeveloper(new SeniorDeveloper(new JavaDeveloper()));
    Task task = new Task("task 1 ", developer);

    task.getTaskInfo();
  }
}
