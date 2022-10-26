package patterns.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

public class FolderComposite {
  private String name;
  private final Date creationDate;
  private List<FolderComposite> folders;
  private List<File> files;


  public FolderComposite(String name, Date creationDate) {
    this.name = name;
    this.creationDate = creationDate;
    this.folders = new ArrayList<>();
    this.files = new ArrayList<>();
  }

  public void addFolder(FolderComposite folder){
    folders.add(folder);
  }

  public void removeFolder(FolderComposite folder){
    folders.remove(folder);
  }

  public FolderComposite getFolderByName(String name){
    return folders.stream().filter(folder -> folder.name.equals(name)).findFirst().orElseThrow(NullPointerException::new);
  }


  public void addFile(File file){
    files.add(file);
  }

  public void removeFile(File file){
    files.remove(file);
  }

  public File getFileByName(String name){
    return files.stream().filter(file -> file.getFileName().equals(name)).findFirst().orElseThrow(NullPointerException::new);
  }


  @Override
  public String toString() {
    return new StringJoiner(", ", FolderComposite.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("creationDate=" + creationDate)
        .add("folders=" + folders)
        .add("files=" + files)
        .toString();
  }
}
