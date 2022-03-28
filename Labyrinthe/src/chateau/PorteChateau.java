package chateau;

import interfaces.Porte;

public class PorteChateau implements Porte {
    @Override
    public String getDescription() {
        return "Je suis une porte de chateau";
    }
}
