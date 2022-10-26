package patterns.structuralPatterns.facade;

public class WorkFlow {

  private Developer developer = new Developer();
  private SprintManager sprintManager = new SprintManager();

  private Job job = new Job();

    public void solveProblems() {
      job.doJob();
      sprintManager.startSprint();
      developer.doJobBeforeSprintDeadline(sprintManager);


      sprintManager.finishSprint();
      developer.doJobBeforeSprintDeadline(sprintManager);
    }
}
