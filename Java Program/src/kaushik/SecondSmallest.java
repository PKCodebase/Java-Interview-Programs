package kaushik;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements space-separated: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Second smallest: " + findSecondSmallest(arr));

        sc.close();


    }

    public static int findSecondSmallest(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(-1);
    }
}
