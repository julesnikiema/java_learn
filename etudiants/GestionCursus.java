package ETUDIANT;



import java.util.Scanner;

public class GestionCursus {

    public static void main(String[] args) {
        /* En appelant le constructeur Cursus ( ) , le programme demande la saise du nombre
           d'étudiants. Puis, pour chaque étudiant, il fait appel au constructeur Etudiant ( ) , qui
           demande la saisie des nom, prénom et notes de 1' étudiant concerné */
        byte choix = 0;
        Scanner clavier = new Scanner(System.in);
        Cursus C = new Cursus();
        do {
            System.out.println ( " l . Ajoute un etudiant " ) ;
            System.out.println ( " 2 . Affiche la liste des eleves " ) ;
            System.out.println ( " 3 . Pour sortir " ) ;
            System.out.print ( "Votre choix : " ) ;
            choix = clavier.nextByte() ;

            switch (choix) {
                case 1:
                    C.ajouterUnEtudant();
                    break;

                case 2:
                    C.AfficherlesEtudiants();
                    break;


                case 3:
                    System.exit(0);
                    break;
            
                default: System.out.println("cette option n'existe pas ");
                    break;
            }



    
        } while (choix !=3 );

    }
}