package patterns.behavioralPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {

  private Admin admin;
  private List<User> users = new ArrayList<>();


  public SimpleTextChat setAdmin(Admin admin) {
    this.admin = admin;
    return this;
  }

  public SimpleTextChat() {
  }


  public void addUser(User user) {
    this.users.add(user);
  }

  @Override
  public void sendMessage(String message, User user) {
    users.forEach(simpleUser -> {
      if (simpleUser != user) {
        simpleUser.getMessage(message);
      }
    });
    admin.getMessage(message);
  }
}
