package patterns.structuralPatterns.decorator;

public class SeniorDeveloper extends DeveloperDecorator{
  public SeniorDeveloper(Developer developer) {
    super(developer);
    super.developerName = "seniorDeveloper";
  }


  public void makeCodeReview(){
    System.out.println(" Make code review. ");
  }

  @Override
  public void makeJob() {
    super.makeJob();
    makeCodeReview();
  }
}
