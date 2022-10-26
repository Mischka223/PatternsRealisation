package patterns.behavioralPatterns.mediator;

public class MediatorMain {

  public static void main(String[] args) {
    SimpleTextChat chat = new SimpleTextChat();

    Admin admin = new Admin("Barabashka", chat);

    chat.setAdmin(admin);

    User user = new SimpleUser("Andiy", chat);
    User user2 = new SimpleUser("Sergiy", chat);


    chat.addUser(user);
    chat.addUser(user2);

    user.sendMessage("Hi everyBody");
    admin.sendMessage(admin.getName() + " is Admin");
  }
}
