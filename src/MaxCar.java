import java.util.*;

public class MaxCar {
    private Integer[] array;
    private Integer[] transformedArray;

    MaxCar(){
        generateArray();
    }

    public void generateArray() {
        Random randomizer = new Random();
        int seed = Math.abs(randomizer.nextInt(128));
        int N = seed % 2 == 0 ? ++seed : seed;
        array = new Integer[N];
        ArrayList<Integer> checker = new ArrayList<>();
        int i = 0;
        do {
            array[i] = randomizer.nextInt(256);
            if (checker.contains(array[i])){
                continue;
            }
            else
            {
                checker.add(array[i]);
                i++;
            }
        } while (i < N);
        transformArray();
    }

    private void transformArray(){
        if (array.length != 1) {
            Integer[] sortedArray = Arrays.copyOf(array, array.length);
            Arrays.sort(sortedArray);
            Integer[] reverseArray = Arrays.copyOf(array, array.length);
            Arrays.sort(reverseArray, Collections.reverseOrder());
            transformedArray = new Integer[array.length];
            transformedArray[array.length / 2] = sortedArray[array.length - 1];
            System.arraycopy(sortedArray, 0, transformedArray, 0, sortedArray.length / 2);
            System.arraycopy(reverseArray, 1, transformedArray, transformedArray.length / 2 + 1, reverseArray.length / 2);
        }
        else
        {
            transformedArray = array;
        }
    }

    public Integer[] getArray() {
        return array;
    }

    public Integer[] getTransformedArray() {
        return transformedArray;
    }
}
