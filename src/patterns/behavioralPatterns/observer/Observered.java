package patterns.behavioralPatterns.observer;

public interface Observered {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
