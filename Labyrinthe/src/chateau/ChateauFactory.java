package chateau;

import interfaces.LabyrintheFactory;
import interfaces.Mur;
import interfaces.Piece;
import interfaces.Porte;

public class ChateauFactory implements LabyrintheFactory {
    @Override
    public Mur createMur() {
        return new MurChateau();
    }

    @Override
    public Piece createPiece() {
        return new PieceChateau();
    }

    @Override
    public Porte createPorte() {
        return new PorteChateau();
    }
}
