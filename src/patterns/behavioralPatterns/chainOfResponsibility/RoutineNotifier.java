package patterns.behavioralPatterns.chainOfResponsibility;

public class RoutineNotifier extends Notifier {

  public RoutineNotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Send simple report. Message : " + message);
  }
}
