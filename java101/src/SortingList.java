import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class SortingList {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        List<Integer> less = new ArrayList<>();
        List<Integer> up = new ArrayList<>();
        sort(list);

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();

        for (int i : list) {
            if (i < num) {
                less.add(i);
            } else {
                up.add(i);
            }
        }
        int min, max;
        min = less.get(less.size() - 1);
        max = less.get(0);
        System.out.println(less);
        System.out.println(up);

        System.out.println(min);
        System.out.println(max);

    }
}