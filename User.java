package StickyNoteAR;

import java.util.ArrayList;
import java.util.List;

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

  public static User login(String username, String password) {
    //pseudocode
    if (username not in database) {
	    Sysmtem.out.println("User does not exist");
	    return null;
    }
    if (database.getPassword(username).equals(password)) {
      return database.getUser(username);
    } else {
      System.out.println("Incorrect Password");
      return null;
    }
  }



