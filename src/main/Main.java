package main;

import hotels.Hotel;
import hotels.plants.Cactus;
import hotels.plants.Carnivorous;
import hotels.plants.PalmTree;
import hotels.plants.Plant;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
    }

    //Skapar olika typer av växter här samt en lista av växter.
    //Polymorphism
    private Plant igge = new Cactus("Igge", 0.2);
    private Plant laura = new PalmTree("Laura", 5.0);
    private Plant meatloaf = new Carnivorous("Meatloaf", 0.7);
    private Plant olof = new PalmTree("Olof", 1);

    //Lägger växterna i en lista av typen Plant. Polymorphism.
    private List<Plant> plants = Arrays.asList(igge, laura, meatloaf, olof);

    //Skapar upp ett hotell och fyller det med växterna från ovan lista.
    private Hotel hotel = new Hotel(plants);

    //Strängar med meddelanden till användaren
    private String errorMessage = "Couldn't find that name in the Hotels guestlist of plants. Try again.";
    private String waterPlant = "Which plant do you want to give water?";

    //Själva programmet
    public Main() {
        while(true) {

            boolean valueFound = false;
            String input = JOptionPane.showInputDialog(waterPlant);
            //Kollar om användaren har klickat på Cancel eller kryss för att avsluta programmet
            if (input == null) {
                System.exit(0);
            }
            //Sök efter namnet i listan av hotellets växter.
            for (Plant p : hotel.getPlants()) {
                //Om den hittar växtens namn printar den ut en instruktion om hur man ska vattna den.
                //Här används polymorphism då listan är av typen planta, men beroende på vilken växt det är
                //skriver den ut en unik instruktion specifikt för den växten
                if (input.equalsIgnoreCase(p.getName())) {
                    p.printInstructions();
                    valueFound = true;
                }
            }
            //Om namnet ej existerar så skriver den ut ett felmeddelande:
            if (!valueFound) {
                JOptionPane.showMessageDialog(null, errorMessage);
            }
        }
    }
}
