import chateau.ChateauFactory;
import interfaces.LabyrintheFactory;
import jardin.JardinFactory;

public class Main {

    public static void main(String[] args) {
        LabyrintheFactory factory = getFactory("Jardin");

        System.out.println(factory.createMur().getDescription());
        System.out.println(factory.createPiece().getDescription());
        System.out.println(factory.createPorte().getDescription());
    }

    private static LabyrintheFactory getFactory(String type) {
        LabyrintheFactory factory=null;
        switch (type){
            case "Chateau":
                factory = new ChateauFactory();
                break;
            case "Jardin":
                factory = new JardinFactory();
                break;
        }
        return factory;
    }
}