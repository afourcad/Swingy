package fr.fortytwo.afourcad.swingy.view;

import fr.fortytwo.afourcad.swingy.model.heroes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {
    private JButton bouton;
    private JButton bouton2;
    private JButton bouton3;

    public Fenetre(){
        super();
        this.setTitle("My first Game");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.buildContentPane());
        this.setVisible(true);
    }

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        bouton = new JButton("Warrior");
        bouton.addActionListener( this);
        panel.add(bouton);

        bouton2 = new JButton("Mage");
        bouton2.addActionListener(this);
        panel.add(bouton2);

        bouton3 = new JButton("Rogue");
        bouton3.addActionListener(this);
        panel.add(bouton3);

        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        HeroBuilder heroBuilder;

        if (source == bouton) {
            System.out.println("Warrior");
            heroBuilder = new WarriorBuilder();
        }else if (source == bouton2) {
            System.out.println("Mage");
            heroBuilder = new MageBuilder();
        }else {
            System.out.println("Rogue");
            heroBuilder = new RogueBuilder();
        }

        heroBuilder.createHero();
        heroBuilder.buildHero("Henry");
        Hero hero = heroBuilder.getHero();

        System.out.println(hero);
    }
}
