package patterns.behavioralPatterns.chainOfResponsibility;

public class AsapNotifier extends Notifier {


  public AsapNotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Send asap report. Message: " + message);
  }
}
