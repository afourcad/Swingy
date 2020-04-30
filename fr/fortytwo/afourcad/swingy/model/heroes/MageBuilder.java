package fr.fortytwo.afourcad.swingy.model.heroes;

public class MageBuilder extends HeroBuilder{
    @Override
    public void buildHero(String heroName) {
        this.getHero().setName(heroName);
        this.getHero().setHeroClass(HeroClass.Mage);
        this.getHero().setLevel(1);
        this.getHero().setAttack(this.getHero().getAttack() + 1);
    }
}
