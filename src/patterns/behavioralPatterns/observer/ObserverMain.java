package patterns.behavioralPatterns.observer;

import patterns.structuralPatterns.decorator.Developer;

public class ObserverMain {


  public static void main(String[] args) {
    DeveloperSite jobSite = new DeveloperSite();

    jobSite.addVacancy("First vacancy");
    jobSite.addVacancy("Second vacancy");
    jobSite.addVacancy("Third vacancy");


    Observer observer = new Subscriber("Yra");
    Observer observer1 = new Subscriber("Igor");


    jobSite.addObserver(observer);
    jobSite.addObserver(observer1);


    jobSite.addVacancy("Fourth vacancy");
    jobSite.removeVacancy("Third vacancy");
  }

}
