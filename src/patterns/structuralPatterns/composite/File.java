package patterns.structuralPatterns.composite;

import java.util.Date;

public class File {
  private String fileName;
  private Date creationDate;


  public String getFileName() {
    return fileName;
  }

  public File setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public File setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }
}
