package patterns.behavioralPatterns.chainOfResponsibility;

public class ImportantNotifier extends Notifier {


  public ImportantNotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Send important report. Message: " + message);
  }
}
