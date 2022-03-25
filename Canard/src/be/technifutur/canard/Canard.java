package be.technifutur.canard;

public abstract class Canard {

    public ComportementVol comportementVol;
    public ComportementCancan comportementCancan;

    public  String nager(){
        return "Je nage";
    }

    abstract String afficher();

    public String effectuerCancan(){
        return comportementCancan.cancanner();
    }

    public String effectuerVol(){
        return comportementVol.voler();
    }

    public void SetComportementVol(ComportementVol comportementVol){
        this.comportementVol = comportementVol;
    }

    public void SetComportementCancan(ComportementCancan comportementCancan){
        this.comportementCancan = comportementCancan;
    }




}
