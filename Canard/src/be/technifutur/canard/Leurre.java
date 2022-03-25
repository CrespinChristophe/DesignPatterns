package be.technifutur.canard;

public class Leurre extends Canard{

    Leurre(ComportementCancan coincoin, ComportementVol volerAvecAile) {
        this.comportementCancan = coincoin;
        this.comportementVol = volerAvecAile;
    }

    @Override
    String afficher() {
        return "Je suis un leurre";
    }
}
