package be.technifutur.canard;

public class CanardEnPlastique extends Canard{

    CanardEnPlastique(ComportementCancan coincoin, ComportementVol volerAvecAile) {
        this.comportementCancan = coincoin;
        this.comportementVol = volerAvecAile;
    }

    @Override
    String afficher() {
        return "Je suis un canard en plastique";
    }
}
