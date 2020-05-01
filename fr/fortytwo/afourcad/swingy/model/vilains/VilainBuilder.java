package fr.fortytwo.afourcad.swingy.model.vilains;

public abstract class VilainBuilder {
    private Vilain vilain;

    public Vilain getVilain() { return this.vilain; }

    public void createVilain() { this.vilain = new Vilain(); }

    public abstract void buildVilain();
}
