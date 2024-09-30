package main;

import main.hotels.Hotel;
import main.plants.Cactus;
import main.plants.Carnivorous;
import main.plants.PalmTree;
import main.plants.Plant;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
    }

    public Main() {
        //Skapar olika typer av växter här.
        //Polymorphism
        Plant igge = new Cactus("Igge", 0.2);
        Plant laura = new PalmTree("Laura", 5.0);
        Plant meatloaf = new Carnivorous("Meatloaf", 0.7);
        Plant olof = new PalmTree("Olof", 1);

        //Lägger växterna i en lista av typen Plant. Polymorphism.
        List<Plant> plants = new ArrayList<>();
        plants.add(igge);
        plants.add(laura);
        plants.add(meatloaf);
        plants.add(olof);

        //Skapar upp hotellet och lägger till listan växterna som gäster hos hotellet
        Hotel hotel = new Hotel();
        hotel.addPlants(plants);

        //Whileloopa detta nedan
        while(true) {
            String input = JOptionPane.showInputDialog("Which plant do you want to feed?");
            //Kollar om användaren har klickat på Cancel eller kryss för att avsluta programmet
            if (input == null) {
                System.exit(0);
            }
            //Sök efter namnet i listan av hotellets växter.
            for (Plant p : hotel.getPlants()) {
                //Om den hittar växtens namn printar den ut en instruktion om hur man ska vattna den.
                //Här används polymorphism då listan är av typen planta, men beroende på vilken växt det är
                //skriver den ut en unik instruktion specifikt för den växten
                if (input.equals(p.getName())) {
                    p.printInstructions();
                    return;
                }
            }
            //Om namnet ej existerar så skriver den ut ett felmeddelande:
            JOptionPane.showMessageDialog(null, "Couldn't find that name in the Hotels guestlist of plants. Try again.");
        }
    }

}
