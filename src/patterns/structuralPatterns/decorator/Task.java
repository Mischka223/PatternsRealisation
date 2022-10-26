package patterns.structuralPatterns.decorator;

public class Task {
  private String taskName;
  private Developer developer;


  public Task(String taskName, Developer developer) {
    this.taskName = taskName;
    this.developer = developer;
  }

  public String getTaskName() {
    return taskName;
  }

  public Developer getDeveloper() {
    return developer;
  }


  public void getTaskInfo(){
    System.out.println("Task " + taskName + "is doing by developer. Developer make that function : ");
    developer.makeJob();
  }
}
