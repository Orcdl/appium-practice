package Question6;

import java.util.List;

public class RacingController {

    public static Animal getWinner(List<Animal> animalList){
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if(animal.getSpeech() > winner.getSpeech()){
                winner = animal;
            }
        }
        return winner;
    }
}

