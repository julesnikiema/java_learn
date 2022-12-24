package Point_AXE;

public class Main_axe {

    public static void main(String[] args) {
        // creons deux points d'axes de types ManipulerAxe 
        ManipulerAxe p1Axe = new ManipulerAxe(3);
        ManipulerAxe p2Axe = new ManipulerAxe(12);

        System.out.println("Origine courante: " + ManipulerAxe.getOrigine());
        // Origine courante = 0 c'est en effet l'origine initial

        // les abscisses relatives des points par rappot a l'origine 0 

        System.out.println("Abscisse relative de p1: " + p1Axe.getAbscisseRelative());
        System.out.println("Abscisse relative de p2: " + p2Axe.getAbscisseRelative());

        // changeons l'origine initial et mettons la  a 3 
        ManipulerAxe.setOrigine(3);
        System.out.println("Origine courante: " + ManipulerAxe.getOrigine());
        
        // les abscisses relatives des points par rapport a l'origine 3 
        System.out.println("Abscisse relative de p1: " + p1Axe.getAbscisseRelative());
        System.out.println("Abscisse relative de p2: " + p2Axe.getAbscisseRelative());
        



   
    }
    
}
