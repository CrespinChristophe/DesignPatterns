package be.technifutur.canard;

public class Mandarin extends Canard{

    Mandarin(ComportementCancan coincoin, ComportementVol volerAvecAile) {
        this.comportementCancan = coincoin;
        this.comportementVol = volerAvecAile;
    }

    @Override
    String afficher() {
        return "Je suis un Canard Mandarin";
    }
}
