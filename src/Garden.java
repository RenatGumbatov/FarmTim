import flowers.Flower;

import java.util.ArrayList;
import java.util.HashSet;

public class Garden {
    private int maxOfTypes = 5;
    private ArrayList<Flower> flowers;

    public void plantFlower(int choice) {
        if (amountOfFlowerTypesPlanted() <= maxOfTypes) {
            flowers.add(Flower.createFlower(choice));
        }
    }

    public void waterFlower(int i) {
        flowers.get(i).waterFlower();
    }

    public int amountOfFlowerTypesPlanted() {
        HashSet<Class> types = new HashSet<>();
        for (Flower flower : flowers) {
            types.add(flower.getClass());
        }
        return types.size();
    }
}
