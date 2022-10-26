package patterns.behavioralPatterns.chainOfResponsibility;

public class ChainOfResponsibilityMain {

  public static void main(String[] args) {
    Notifier routineNotifier = new RoutineNotifier(Priority.ROUTINE);
    Notifier importantNotifier = new ImportantNotifier(Priority.IMPORTANT);
    Notifier asapNotifier = new AsapNotifier(Priority.ASAP);


    routineNotifier.setNextNotifier(importantNotifier);
    importantNotifier.setNextNotifier(asapNotifier);


    routineNotifier.notifyManager("Everything is ok", Priority.ROUTINE);
    routineNotifier.notifyManager("Something strange is happened", Priority.IMPORTANT);
    routineNotifier.notifyManager("Oh, everything is going fu*k down", Priority.ASAP);
  }
}
