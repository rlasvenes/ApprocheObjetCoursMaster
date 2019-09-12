package fr.ubordeaux.ao;
²
import java.util.*;

class SearchEngine {
  private List<Contact> contacts;


  public SearchEngine(List<Contact> contacts) {
      this.contacts = contacts;
  }

  public List<Contact> search(String contact) {
    return searchFilter(contact, 0);
  }

  public List<Contact> searchFilter(String contact, int filter) {
      List<Contact> tmp = new ArrayList<Contact>(contacts);
      switch (filter) {
        case 0:
          for (Contact c : contacts) {
            if (c.getFirstName().startsWith(contact) {
              tmp.add(c);
            } 
          }
          break;

        case 1:
          break;

        case 2:
          break;

        default:

          break;
      }
  }


}
