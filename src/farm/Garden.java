package farm;

import farm.flowers.Flower;

import java.util.ArrayList;
import java.util.HashSet;

public class Garden {
    private int maxOfTypes = 5;
    private ArrayList<Flower> flowers;
    private Farm farm;

    public void plantFlower(int choice) {
        Flower flowerToAdd = Flower.createFlower(choice);
        if (amountOfFlowerTypesPlanted() <= maxOfTypes && farm.getArea()-flowerToAdd.getNeededArea() >= 0) {
            flowers.add(flowerToAdd);
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
