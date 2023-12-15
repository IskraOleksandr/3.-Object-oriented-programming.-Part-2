import Ex6and7_Classes.Array;

public class Ex6and7 {
    public static void main(String[] args) {
        Array arr = new Array(16);
        arr.init(-5, 15);
        System.out.println("\n\n" + arr);

        int number = 0;
        number = arr.max();
        System.out.println("Макимальное значение массива: " + number);

        number = arr.min();
        System.out.println("Минимальное значение массива: " + number);

        float number2 = arr.avg();
        System.out.println("Среднеарифметическое значение массива: " + number2);

        arr.sortAsc();
        System.out.println("\nCортировка по возрастанию " + arr);

        arr.sortDesc();
        System.out.println("\nCортировка по убыванию " + arr + "\n\n");
    }
}
