package patterns.behavioralPatterns.observer;

import java.util.List;

public interface Observer {

  void handleEvent(List<String> vacancies);
}