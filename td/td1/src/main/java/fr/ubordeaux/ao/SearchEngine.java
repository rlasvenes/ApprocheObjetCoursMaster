package fr.ubordeaux.ao;

import java.util.*;

/**
 * Réponse au TD:
 *  Pas besoin d'avoir plusieurs instances de cette classe, cela n'a pas de sens d'avoir plusieurs moteur de
 *  recherche. (cf: Design pattern 'Singleton' + délégation dynamique (cf: cours du 16/09))
 */
public class SearchEngine {
  private Set<Contact> contacts;


  public SearchEngine(ContactSet contacts) {
    // On ne modifie pas l'objet contacts passé en paramètre du constructeur
    this.contacts = contacts.getContactSet(0, contacts.size());
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
