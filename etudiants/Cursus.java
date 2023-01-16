package ETUDIANT;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Scanner;

public class Cursus{

    private ArrayList liste;

    /* Le constructeur Cursus ( ) , qui fait appel au constructeur de la classe ArrayList afin de
    déterminer l' adresse du premier élément de la l i s t e . */
    public Cursus(){
        liste = new ArrayList<>();

    }
    // LA METHODE ajouter un etudiant 
    public void ajouterUnEtudant(){
        liste.add(new Etudiant());
    }

/*La méthode AfficherEtudiant ( ) parcourt l'ensemble de la liste grâce à la
méthode get ( ) , qui fournit en résultat l'élément stocké à la position spécifiée en paramètre,
soit i . Ce résultat, pour être consultable, doit obligatoirement être « casté » en Etudiant. */

    public void AfficherlesEtudiants(){
        int nbrEtudiant = liste.size();

        if(nbrEtudiant>0){
            Etudiant temp;
        
            for (int i = 0; i < nbrEtudiant; i++) {
                
                temp = (Etudiant)liste.get(i);
                temp.AfficherEtudiant(); 
                
            }
        }else{
            System.out.println("il n'y a pas d'etudiant dans cette liste");
        }


    }






}