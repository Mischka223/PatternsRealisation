package patterns.structuralPatterns.facade;

public class SprintManager {
  private boolean springIsActive = false;

  public boolean springIsActive() {
    return springIsActive;
  }

  public void finishSprint(){
    System.out.println("Sprint was finished");
    springIsActive = false;
  }

  public void startSprint(){
    System.out.println("Sprint is active");
    springIsActive = true;
  }
}
