package fr.fortytwo.afourcad.swingy.model.vilains;

public class OrcBuilder extends VilainBuilder{
    @Override
    public void buildVilain() {
        this.getVilain().setName("Orc");
        this.getVilain().setVilainType(VilainType.ORC);
        this.getVilain().setAttack(2);
        this.getVilain().setDefense(2);
        this.getVilain().setHitPoints(2);
        this.getVilain().setLevel(2);
    }
}
