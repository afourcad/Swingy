package fr.fortytwo.afourcad.swingy.model.heroes;

public abstract class HeroBuilder {
    private Hero hero;

    public Hero getHero(){
        return this.hero;
    }

    public void createHero() {
        this.hero = new Hero();
    }

    public abstract void buildHero(String heroName);
}
