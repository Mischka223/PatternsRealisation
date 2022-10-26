package patterns.structuralPatterns.flywight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMain {

  public static void main(String[] args) {
    DeveloperFactory developerFactory = new DeveloperFactory();

    List<Developer> developers = new ArrayList<>();

    developers.add(developerFactory.getDeveloperBySpecialty("java"));
    developers.add(developerFactory.getDeveloperBySpecialty("java"));
    developers.add(developerFactory.getDeveloperBySpecialty("java"));
    developers.add(developerFactory.getDeveloperBySpecialty("java"));
    developers.add(developerFactory.getDeveloperBySpecialty("java"));
    developers.add(developerFactory.getDeveloperBySpecialty("java"));
    developers.add(developerFactory.getDeveloperBySpecialty("php"));
    developers.add(developerFactory.getDeveloperBySpecialty("php"));
    developers.add(developerFactory.getDeveloperBySpecialty("php"));
    developers.add(developerFactory.getDeveloperBySpecialty("php"));
    developers.add(developerFactory.getDeveloperBySpecialty("php"));


    for (Developer developer: developers){
      developer.writeCode();
    }

  }
}
