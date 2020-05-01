package fr.fortytwo.afourcad.swingy.model.vilains;

public class DarkMageBuilder extends VilainBuilder{
    @Override
    public void buildVilain() {
        this.getVilain().setName("Dark mage");
        this.getVilain().setVilainType(VilainType.DARKMAGE);
        this.getVilain().setAttack(6);
        this.getVilain().setDefense(2);
        this.getVilain().setHitPoints(5);
        this.getVilain().setLevel(4);
    }
}
