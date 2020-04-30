package fr.fortytwo.afourcad.swingy.model.heroes;

import fr.fortytwo.afourcad.swingy.model.Artifact;
import fr.fortytwo.afourcad.swingy.model.Character;

public class Hero extends Character {
    private HeroClass heroClass;
    private int experience;
    private Artifact artifact;

    Hero(){
        super();
        this.experience = 0;
        this.setAttack(1);
        this.setDefense(1);
        this.setHitPoints(2);
    }
    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroName=" + this.getName() +
                ", heroClass=" + heroClass +
                ", level=" + this.getLevel() +
                ", attack=" + this.getAttack() +
                ", defense=" + this.getDefense() +
                ", hitPoints=" + this.getHitPoints() +
                ", experience=" + experience +
                ", artifact=" + artifact +
                '}';
    }
}
