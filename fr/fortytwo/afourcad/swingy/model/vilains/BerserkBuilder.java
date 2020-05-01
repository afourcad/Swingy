package fr.fortytwo.afourcad.swingy.model.vilains;

public class BerserkBuilder extends VilainBuilder{
    @Override
    public void buildVilain() {
        this.getVilain().setName("Berserk");
        this.getVilain().setVilainType(VilainType.BERSERK);
        this.getVilain().setAttack(4);
        this.getVilain().setDefense(1);
        this.getVilain().setHitPoints(4);
        this.getVilain().setLevel(3);
    }
}
