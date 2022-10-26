package patterns.structuralPatterns.composite;

import java.sql.Date;
import java.time.Instant;
import java.time.temporal.ChronoUnit;


public class CompositeMain {

  public static void main(String[] args) {
    FolderComposite folderComposite = new FolderComposite("newFolder", Date.from(Instant.now()));

    folderComposite.addFolder(new FolderComposite("defaultFolder", java.util.Date.from(Instant.now().plus(1, ChronoUnit.HOURS))));

    FolderComposite defaultFolder = folderComposite.getFolderByName("defaultFolder");

    System.out.println(defaultFolder);

    System.out.println(folderComposite);

    folderComposite.getFolderByName("blabal");
  }
}
