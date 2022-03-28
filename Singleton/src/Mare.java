public class Mare {

    private static Mare mare = null;

    private Mare(){}

    public static Mare getMare(){
        if (mare == null) { //lazy creation // taper lazy et le code sera automatiquement généré
            mare = new Mare();
            //TODO initialiser la mare
        }
        return mare;
    }
}
