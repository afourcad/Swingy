package fr.fortytwo.afourcad.swingy.model.heroes;

public class RogueBuilder extends HeroBuilder {

    @Override
    public void buildHero(String heroName) {
        this.getHero().setName(heroName);
        this.getHero().setHeroClass(HeroClass.Rogue);
        this.getHero().setLevel(1);
        this.getHero().setDefense(this.getHero().getDefense() + 1);
    }
}
