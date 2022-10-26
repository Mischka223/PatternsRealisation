package patterns.structuralPatterns.proxy;

public class ProxyMain {

  public static void main(String[] args) {
    Project realProject = new ProxyProject("http://www.github.com");

    realProject.run();
  }
}
