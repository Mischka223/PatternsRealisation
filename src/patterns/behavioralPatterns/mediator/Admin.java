package patterns.behavioralPatterns.mediator;

public class Admin implements User{

  private String name;
  private final Chat chat;

  public Admin(String name, Chat chat) {
    this.name = name;
    this.chat = chat;
  }

  public String getName() {
    return name;
  }

  public Admin setName(String name) {
    this.name = name;
    return this;
  }


  @Override
  public void sendMessage(String message) {
    chat.sendMessage(message, this);
  }

  @Override
  public void getMessage(String message) {
    System.out.println(this.name + " received message: " + message + ".");
  }
}
