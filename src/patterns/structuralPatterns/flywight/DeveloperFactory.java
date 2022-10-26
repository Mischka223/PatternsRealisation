package patterns.structuralPatterns.flywight;

import java.util.HashMap;
import java.util.Map;

//FlyWeight
public class DeveloperFactory {

  private Map<String, Developer> developerMap = new HashMap<>();


  public Developer getDeveloperBySpecialty(String specialty){
    Developer developer = developerMap.get(specialty);

    if (developer == null){
      switch (specialty){
        case "java" :
          System.out.println("Hiring java developer");
          developer = new JavaDeveloper();
          developerMap.put(specialty,developer);
          break;
        case "php" :
          System.out.println("Hiring php developer");
          developer = new PhpDeveloper();
          developerMap.put(specialty,developer);
          break;
      }
    }
    return developer;
  }
}
