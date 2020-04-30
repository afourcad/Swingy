package fr.fortytwo.afourcad.swingy.model.heroes;

public class WarriorBuilder extends HeroBuilder{
    @Override
    public void buildHero(String heroName) {
        this.getHero().setName(heroName);
        this.getHero().setHeroClass(HeroClass.Warrior);
        this.getHero().setLevel(1);
        this.getHero().setHitPoints(this.getHero().getHitPoints() + 1);
    }
}
