package patterns.creationalPatterns.singleton;

public class SingletonMain {

  public static void main(String[] args) {
    Singleton singleTon = Singleton.getSingleTon();
    Singleton singleTon2 = Singleton.getSingleTon();
    singleTon.i = 1;
    singleTon2.i = 2;

    System.out.println(singleTon.i);
  }

  static class Singleton{
   static Singleton singleton = new Singleton();
    int i = 0;

    private Singleton() {
    }

    public static Singleton getSingleTon(){
      return singleton;
    }
  }
}
