package ETUDIANT;

import java.util.Scanner;

public class Etudiant {
    private String nom, prenoms; // identification de l'etudiant
    private double [] notes; // les notes et la moyenne de l'etudiant 
    private double moyenne;

    // creons le constructeur un etudiant 
    public Etudiant(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("entrez le nom de l'etudiant" );
        nom = clavier.nextLine();
        System.out.println("entrez le prenom de l'etudiant");
        prenoms = clavier.nextLine();
        System.out.println("Combien de notes y'a t'il pour l'etudian "+nom+" "+prenoms+"?");
        int nbrNote = clavier.nextInt();
        notes = new double[nbrNote];

        // remplissons le tableau des notes de l'etudiant
        for (int i = 0; i < notes.length; i++) {
            System.out.println("saisir la note "+(i+1));
            notes[i]=clavier.nextDouble();
        }
        moyenne = CalculMoyenne();
        System.out.println("passons a l'etudiant suivant ");

    }
    // la methode de calcul des moyennes
     private double CalculMoyenne(){
        double somme = 0.0;
        for (double  valeurnote : notes) { 
            somme = somme + valeurnote;
        }
        
        return(somme/notes.length);

     }
     public void AfficherEtudiant(){
        System.out.println("voici les notes de l'etudiant "+nom+" "+prenoms);
        for (double valeurnotes : notes) {
            System.out.print(""+valeurnotes);
            System.out.println("");
        }
        System.out.println("Sa moyenne est : "+moyenne); 
     }

     public double QuellMoyenne(){
        return moyenne;
        
     }
    
}
