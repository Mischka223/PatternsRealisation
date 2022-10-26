package patterns.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeveloperSite implements Observered {

  private List<String> vacancies = new ArrayList<>();

  private Set<Observer> subscriber = new HashSet<>();


  public void addVacancy(String vacancy) {
    vacancies.add(vacancy);
    notifyObservers();
  }

  public void removeVacancy(String vacancy) {
    vacancies.remove(vacancy);
    notifyObservers();
  }

  @Override
  public void addObserver(Observer observer) {
    this.subscriber.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    this.subscriber.remove(observer);
  }

  @Override
  public void notifyObservers() {
    this.subscriber.forEach(subscriber -> subscriber.handleEvent(vacancies));
  }
}
