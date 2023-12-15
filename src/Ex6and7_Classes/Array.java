package Ex6and7_Classes;

import java.util.Arrays;
import java.util.Random;

public class Array implements IMath, ISort {
    private final Random rand = new Random();
    private int[] array;
    private final int size;


    public Array(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void init(int start, int end) {
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(start, end);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public int min() {
        int number = array[0];
        for (int i : array) {
            if (number < i) {
                number = i;
            }
        }
        return number;
    }

    @Override
    public int max() {
        int number = array[0];
        for (int i : array) {
            if (number > i) {
                number = i;
            }
        }
        return number;
    }

    @Override
    public float avg() {
        float number = 0;
        for (int i : array) {
            number += i;
        }
        number = number / size;
        return number;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(array);
    }

    @Override
    public void sortDesc() {
        Arrays.sort(array);
        int[] arraySecond = new int[size];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            arraySecond[j] = array[i];
            j++;
        }
        array = arraySecond;
    }
}
