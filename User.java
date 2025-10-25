public class User {
  String username;
  String password;
  List<StickyNote> myNotes;
  public User(String username, String password) {
    this.username = username;
    this.password = password;
    myNotes = new ArrayList<>();
    //store user in database.
  }

  public static login(String username, password) {
    //pseudocode
    if (database.getPassword(username).equals(password)) {
      return database.getUser(username);
    } else {
      System.out.println("Incorrect Password");
      return null;
    }
  }



