package console;

import java.util.Scanner;

public class Console {
    /*
    1. Manage flowers
    2. Manage animals
    3. Exit

    >> 1
    1. Return
    2. Plant flower
    3. Water flower
    4. Remove flower

    >> 2
    Current flowers: ...
    Choose flower to plant:
    1. Return
    2. Flower1
    3. Flower2
    4. Flower3
    5. Flower4
    6. Flower5
    7. Rose

    >> 3
    1. Return
    2. Plant flower
    3. Water flower
    4. Remove flower

    >> 1
    1. Manage flowers
    2. Manage animals
    3. Exit

    >> 2
    1. Return
    2. Add animal
    3. Remove animal
     */

    public int nextInt(int min, int max) {
        int result;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                result = scanner.nextInt();
                if (min <= result && result <= max) return result;
            } catch (Exception ignored) {
                scanner = new Scanner(System.in);
            }
        }
    }
}