import java.util.Scanner;

public class Kap7_3 {
    public static void main(String[] args) {
        System.out.println("hey");

        int[] numbers = new int[100];


        System.out.print("Enter the integers between 1 and 100: " + "\r\n"  + "End with 0" + "\r\n"  );

        numbers(numbers);

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[1] > 0)
                System.out.println((i+1) + "occurs " + numbers[i] +
                        " time" + (numbers[i] > 1 ? "s" : ""));
        }
    }

    public static void numbers(int[] counts){
        Scanner input = new Scanner(System.in);
        int num;
        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100)
                counts[num - 1]++;
        } while (num != 0);
    }
}
