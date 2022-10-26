package patterns.behavioralPatterns.memento;

import java.util.Date;
import java.util.StringJoiner;

public class Project {
  private String version;
  private Date date;

  public void setVersionAndDate(String version) {
    this.version = version;
    this.date = new Date();
  }


  public Save save() {
    return new Save(version);
  }

  public void load(Save save) {
    version = save.getVersion();
    date = save.getDate();
  }


  @Override
  public String toString() {
    return new StringJoiner(", ", Project.class.getSimpleName() + "[", "]")
        .add("Version=" + version)
        .add("Date=" + date)
        .toString();
  }
}
