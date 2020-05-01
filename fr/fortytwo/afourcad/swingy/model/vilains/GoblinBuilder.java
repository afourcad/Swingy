package fr.fortytwo.afourcad.swingy.model.vilains;

public class GoblinBuilder extends VilainBuilder{
    @Override
    public void buildVilain() {
        this.getVilain().setName("Goblin");
        this.getVilain().setVilainType(VilainType.GOBLIN);
        this.getVilain().setAttack(1);
        this.getVilain().setDefense(1);
        this.getVilain().setHitPoints(1);
        this.getVilain().setLevel(1);
    }
}
