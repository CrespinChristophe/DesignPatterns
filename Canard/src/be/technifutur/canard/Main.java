package be.technifutur.canard;

public class Main {
    public static void main(String[] args) {
        /*ComportementVol volerAvecAiles1;
        ComportementVol nePasVoler1;
        ComportementCancan cancan1;
        ComportementCancan coincoin1;
        ComportementCancan canardMuet1;*/

        //initialisation des comportements

        VolerAvecDesAiles volerAvecDesAiles = new VolerAvecDesAiles();
        NePasVoler nePasVoler = new NePasVoler();
        CoinCoin coincoin = new CoinCoin();
        Cancan cancan = new Cancan();
        CanardMuet canardMuet = new CanardMuet();

        Canard[] mare = new Canard[]{
                new Colvert(coincoin, volerAvecDesAiles),
                new Mandarin(cancan, volerAvecDesAiles),
                new Leurre(canardMuet, nePasVoler),
                new CanardEnPlastique(canardMuet, nePasVoler)
        };

        for(Canard c : mare) {
            System.out.println(c.afficher());
            System.out.println(c.effectuerCancan());
            System.out.println(c.effectuerVol());
        }

    }
}
