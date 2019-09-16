package fr.ubordeaux.ao;

import java.util.*;

public class SearchEngine {
  private Set<Contact> contacts;


  public SearchEngine(ContactSet contacts) {
    this.contacts = contacts.getContact(0, contacts.size());
  }

  public Set<Contact> search(String contact) {
    return searchFilter(contact, 0);
  }

  public Set<Contact> searchFilter(String contact, int filter) {
    System.out.println("Searching : " + contact);
    Set<Contact> tmp = new HashSet<Contact>();

    switch (filter) {
      case 0:
        for (Contact c : contacts) {
          if (contact.compareToIgnoreCase(c.getFirstName()) < 3) {
            tmp.add(c);
          }
        }
        break;

      case 1:
        //TODO
        break;

      case 2:
        //TODO
        break;

      default:

        break;
    }

    return tmp;
  }


}
