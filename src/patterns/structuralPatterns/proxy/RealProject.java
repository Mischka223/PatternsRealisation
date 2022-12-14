package patterns.structuralPatterns.proxy;

public class RealProject implements Project{

  private String url;

  public RealProject(String url) {
    this.url = url;
    load();
  }

  @Override
  public void run() {
    System.out.println("Run project " + url + "...");
  }


  private void load(){
    System.out.println("Loading project from " + url + " ...");
  }


}
