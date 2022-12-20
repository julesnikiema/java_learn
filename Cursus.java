package ETUDIANT;

import java.util.Scanner;

public class Cursus {
    /*   liste est un tableau d'objet de type etudiant 
    chaque case du tableau ne correspond pas à une
    valeur numérique simple mais à l'ensemble des données 
    caractéristiques d'un étudiant.*/
    
    private Etudiant [] liste;

    public Cursus(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("combien d'etudiant y'a t'il dans la classe ?");
        int nbrEtudiant = clavier.nextInt();
        //  initialisation de la liste de type Etudiant

        liste = new Etudiant[nbrEtudiant];
        
         for(int i=0;i<liste.length;i++){
            // la nous allons saisir les etudiansts qui sont sur la liste 
            liste[i]=new Etudiant();
         }
    }
    public void AfficherlesEtudiants(){
        for (Etudiant e : liste) {
            e.AfficherEtudiant();  
        }
    }
// la methode pour trier la plus petite moyenne on recupere l'indice du plus petit pour echanger plus tard 
// avec une methode echange 
    private int  OuLePlusPetit (int debut) {
        int IndiceMinimum = debut;
              /*recherche doit être réalisée dans
        un premier temps sur l' intégralité de la liste, puis à partir du deuxième élément,
         ensuite à partir
        du troisième élément, etc. */

        for (int j = debut+1 ; j < liste.length; j++) {
      

            if(liste[j].QuellMoyenne()< liste[IndiceMinimum].QuellMoyenne()){
                IndiceMinimum = j;  
            }
            
        }
        return IndiceMinimum;
    }
    /*Connaissant l' indice où se trouve la plus petite moyenne, 
    nous devons échanger cette valeur
    avec celle correspondant au début de la recherche
    --------------------------------------------------------------------------------------------- 
    Ce traitement est réalisé sur l'ensemble des
    étudiants en faisant varier l'indice du début de recherche de la première valeur du tableau
    jusqu'à la dernière. La méthode c lasserParMoyenne ( ) , qui s'insère dans la classe
    Cursus, réalise ces opérations :
    */
    public void ClasserMoyenne(){
        int IndicePlusPetit;
        // variabe de types etudiant (variable temporaire )
        Etudiant temp;
        /* Grâce à la boucle for, le programme parcourt l'ensemble des étudiants 
           de la classe. Ainsi,
           pour chaque étudiant de la l i s te, la boucle réalise : */
        for (int i = 0; i < liste.length; i++) {
            // la recherche de la plus petite moyenne (ouLePlusPetit ( ) ) à partir de l'indice i,
           // correspondant à l'indice de début de recherche ;
            IndicePlusPetit = OuLePlusPetit(i);
        // l'échange dans la liste des données concernant l'étudiant ayant la plus petite moyenne
        // (indiceDuPlusPeti t) avec les données de l'étudiant placé à l' indice i (indice du
        // début de recherche).
            temp = liste[i];
            liste[i]=liste[IndicePlusPetit];
            liste[IndicePlusPetit] = temp;
            
        }

    }

    



    
}
