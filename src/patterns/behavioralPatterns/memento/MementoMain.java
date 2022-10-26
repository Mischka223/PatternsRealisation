package patterns.behavioralPatterns.memento;

public class MementoMain {

  public static void main(String[] args) {
    Project project = new Project();

    Repo repo = new Repo();

    System.out.println("Create new Project. Version 1.0");
    project.setVersionAndDate("Version 1.0");
    System.out.println(project);

    System.out.println("Save project to repo");

    repo.setSave(project.save());

    System.out.println("Update project to Version 1.1");

    System.out.println("Writing some code...");

    project.setVersionAndDate("Version 1.1");

    System.out.println(project);


    System.out.println("Something went wrong");


    System.out.println("Rolling back to 1.0");

    project.load(repo.getSave());

    System.out.println("Repo after roll back");

    System.out.println(project);
  }
}
