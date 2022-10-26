package patterns.behavioralPatterns.memento;

public class Repo {
  private Save save;

  public Save getSave() {
    return save;
  }

  public Repo setSave(Save save) {
    this.save = save;
    return this;
  }
}
