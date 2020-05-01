package fr.fortytwo.afourcad.swingy.model.vilains;

import fr.fortytwo.afourcad.swingy.model.Character;

public class Vilain extends Character {
    private VilainType vilainType;

    Vilain() {
        super();
        this.setAttack(1);
        this.setDefense(1);
        this.setHitPoints(2);
    }

    public VilainType getVilainType() { return vilainType; }

    public void setVilainType(VilainType vilainType) {
        this.vilainType = vilainType;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroName=" + this.getName() +
                ", vilainType= " + this.vilainType +
                ", level=" + this.getLevel() +
                ", attack=" + this.getAttack() +
                ", defense=" + this.getDefense() +
                ", hitPoints=" + this.getHitPoints() +
                '}';
    }
}

