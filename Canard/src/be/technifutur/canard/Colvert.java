package be.technifutur.canard;

public class Colvert extends Canard{

    Colvert(ComportementCancan coincoin, ComportementVol volerAvecAile) {
        this.comportementCancan = coincoin;
        this.comportementVol = volerAvecAile;
    }


    @Override
    String afficher() {
        return "Je suis un colvert";
    }
}
