package ETUDIANT;



public class GestionCursus {

    public static void main(String[] args) {
        /* En appelant le constructeur Cursus ( ) , le programme demande la sae du nombre
           d'étudiants. Puis, pour chaque étudiant, il fait appel au constructeur Etudiant ( ) , qui
           demande la saisie des nom, prénom et notes de 1' étudiant concerné */
        Cursus c1 = new Cursus();
        System.out.println("--------------le recapitulitf--------------");
        c1.AfficherlesEtudiants();
        c1.ClasserMoyenne();
        System.out.println("--------------le classement--------------");
        c1.AfficherlesEtudiants();




    }
}