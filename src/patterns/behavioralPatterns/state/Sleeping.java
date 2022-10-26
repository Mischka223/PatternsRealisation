package patterns.behavioralPatterns.state;

public class Sleeping implements Activity{


  @Override
  public void doingSomeActivity() {
    System.out.println("Sleeping...");
  }
}
