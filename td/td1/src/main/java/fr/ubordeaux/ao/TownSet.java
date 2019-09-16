package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

/**
 * Project : TD1
 * Class : TownSet
 * Created at 16/09/19 at 19:25
 * Author : rlasvenes
 */

/**
 * Réponse au TD:
 *  Il serait, là aussi, plus judicieux de ne permettre qu'une seule instance de cette classe, et même en la rendant
 *  statique (pas besoin d'instancier TownSet pour récupérer une ville (pas de sens)).
 */
public class TownSet {
    private TownFactory factory;
    private Set<Town> towns;

    public TownSet(TownFactory factory) {
        this.factory = factory;
        this.towns = new HashSet<>();

        Town t;
        while ((t = factory.getNextTown()) != null) {
            towns.add(t);
        }
    }

    /**
     * L'objet instance de cette classe (TownSet), n'est pas immutable, il peut changer, étant donné qu'on renvoie
     * la référence de l'objet (modifiable de l'extérieur => retourner une copie à la place).
     *
     * @return La référence de l'objet 'towns'
     */
    public Set<Town> getTowns() {
        return towns;
    }
}
