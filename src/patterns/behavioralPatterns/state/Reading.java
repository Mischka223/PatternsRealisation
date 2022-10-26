package patterns.behavioralPatterns.state;

public class Reading implements Activity{
  @Override
  public void doingSomeActivity() {
    System.out.println("Reading book...");
  }
}
