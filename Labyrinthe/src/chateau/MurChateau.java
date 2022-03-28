package chateau;

import interfaces.Mur;

public class MurChateau implements Mur {
    @Override
    public String getDescription() {
        return "Je suis un mur de chateau";
    }
}
