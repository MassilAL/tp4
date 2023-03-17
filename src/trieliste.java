import java.util.ArrayList;
import java.util.Collections;
public class trieliste {



        public class ListeAlphabetique {
            public static void main(String[] args) {
                // Création d'une liste d'éléments
                ArrayList<String> liste = new ArrayList<String>();
                liste.add("orange");
                liste.add("pomme");
                liste.add("banane");
                liste.add("kiwi");

                // Tri de la liste par ordre alphabétique
                Collections.sort(liste);

                // Affichage de la liste triée
                System.out.println("Liste triée par ordre alphabétique:");
                for(String element: liste) {
                    System.out.println(element);
                }
            }
        }



}
