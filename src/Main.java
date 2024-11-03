import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");

        int[] box = new int[]{1, 2, 3};
        float[] pot = new float[]{1.57f, 7.654f, 9.986f};
        int[] milk = new int[]{121, 232, 343};

        System.out.println("Задача 2");
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i]);
            if (i != box.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < pot.length; i++) {
            System.out.print(pot[i]);
            if (i != pot.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < milk.length; i++) {
            System.out.print(milk[i]);
            if (i != milk.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println("Задача 3");

        for (int i = box.length - 1; i >= 0; i--) {
            System.out.print(box[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = pot.length - 1; i >= 0; i--) {
            System.out.print(pot[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = milk.length - 1; i >= 0; i--) {
            System.out.print(milk[i]);
            if (i != 0)
                System.out.print(", ");
        }

        System.out.println();
        System.out.println("Задача 4");

        int[] code = {1, 2, 3};
        for (int y = 0; y < code.length; y++)
            if (code[y] % 2 != 0) {
                code[y]++;
            }

                    System.out.print(Arrays.toString(code));
                }
                }

