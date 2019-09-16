package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static  final int MAX = 10;
    public static void main(String[] args) {
        ContactSet contactSet = new ContactSet();
        Set<Contact> resultContacts = new HashSet<Contact>();

        // Map map = new HashMap<Town>();
        Town talence = new Town("Talence", 33405);
        for (int i = 0 ; i < MAX ; i++) {
            Address address = new Address(351, "Cours de la libération", talence);
            Contact newContact = new Contact("John", "Do", address);
            contactSet.addContact(newContact);
        }
        System.out.println(MAX+" contacts created !");

        // ******************************* Service ***********************************

        Contact c2 = new Contact("Marie", "Tesla", null);
        Contact c3 = new Contact("Mathilde", "Tesla", null);
        Contact c4 = new Contact("Maria", "Tesla", null);
        Contact c5 = new Contact("Marine", "Tesla", null);



        contactSet.addContact(c2);
        contactSet.addContact(c3);
        contactSet.addContact(c4);
        contactSet.addContact(c5);

        SearchEngine searchEngine = new SearchEngine(contactSet);
        resultContacts = searchEngine.search("Marine");

        System.out.println("Result is : " + resultContacts);

        // ******************************** Dépôt **********************************

        TownSet townSet = new TownSet(new TownFactory());
        System.out.println("Nombre de villes : " + townSet.getTowns().size());

        try {
            Thread.sleep(200000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
