import java.util.Scanner;

public class Kap7_1 {
    /*
(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is >= best - 10;
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
 run:
*/
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the nubmer of students: ");
            int[] scores = new int[input.nextInt()];
            char[] grades = new char[scores.length];


            System.out.print("Enter " + scores.length + " scores: ");
            for (int i = 0; i < scores.length; i++) {
                scores[i] = input.nextInt();
            }

            getGrades(scores, grades);


            for (int i = 0; i < scores.length; i++) {
                System.out.println("Student " + i + " score is " +
                        scores[i] + " and grade is " + grades[i]);
            }
        }

        public static int max(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            return max;
        }

        public static void getGrades(int[] scores, char[] grades) {
            int best = max(scores);
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] >= best - 10)
                    grades[i] = 'A';
                else if (scores[i] >= best - 20)
                    grades[i] = 'B';
                else if (scores[i] >= best - 30)
                    grades[i] = 'C';
                else if (scores[i] >= best - 40)
                    grades[i] = 'D';
                else
                    grades[i] = 'F';
            }
        }
}

