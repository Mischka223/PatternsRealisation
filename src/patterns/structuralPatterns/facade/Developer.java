package patterns.structuralPatterns.facade;

public class Developer {


  public void doJobBeforeSprintDeadline(SprintManager sprintManager){
    if (sprintManager.springIsActive()){
      writeCode();
    }else {
      System.out.println("Developer is reading books");

    }
  }

  public void writeCode(){
    System.out.println("Developer is writing code before sprint deadline");
  }


}
