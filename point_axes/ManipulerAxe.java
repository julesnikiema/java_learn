package Point_AXE;

/*Créer une classe permettant de manipuler un point d’un axe, repéré par une abscisse
(de type int). On devra pouvoir effectuer des changements d’origine, en conservant
en permanence l’abscisse d’une origine courante (initialement 0). On prévoira
simplement les méthodes suivantes :
• constructeur, recevant en argument l’abscisse "absolue" du point (c’est-à-dire
repérée par rapport au point d’origine 0 et non par rapport à l’origine courante),
• affiche qui imprime à la fois l’abscisse de l’origine courante et l’abscisse du
point par rapport à cette origine,
• setOrigine qui permet de définir une nouvelle abscisse pour l’origine (exprimée
de façon absolue et non par rapport à l’origine courante),
• getOrigine qui permet de connaître l’abscisse de l’origine courante.
Ecrire un petit programme de test fournissant les résultats suivants :
Point a - abscisse = 3
relative a une origine d'abscisse 0
Point b - abscisse = 12
relative a une origine d'abscisse 0
On place l'origine en 3
Point a - abscisse = 0
relative a une origine d'abscisse 3
Point b - abscisse = 9
relative a une origine d'abscisse 3  */


public class ManipulerAxe {

    // declaration de la variables contenant le point d'abscisses 
    private int PointAbscisses;
     // declaration de l'origine , ca sera une variable static 
    private static int origine ;

    // constructeur permettant de créer un point à une abscisse donnée
    public ManipulerAxe (int PointAbscisses) {
        this.PointAbscisses = PointAbscisses;
    }
    // méthode permettant de changer l'origine courante
    public static void setOrigine(int nouvelleOrigine) {
        origine = nouvelleOrigine;
    }
    // méthode permettant de récupérer l'abscisse de l'origine courante
    public static int getOrigine() {
        return origine;
    }

   // méthode permettant de récupérer l'abscisse du point par rapport à l'origine courante
   public int getAbscisseRelative() {
    return PointAbscisses - origine;
  }
}
