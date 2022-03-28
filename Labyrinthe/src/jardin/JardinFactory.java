package jardin;

import interfaces.LabyrintheFactory;
import interfaces.Mur;
import interfaces.Piece;
import interfaces.Porte;

public class JardinFactory implements LabyrintheFactory {
    @Override
    public Mur createMur() {
        return new MurJardin();
    }

    @Override
    public Piece createPiece() {
        return new PieceJardin();
    }

    @Override
    public Porte createPorte() {
        return new PorteJardin();
    }
}
