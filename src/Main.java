import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        NotenProzessor notenProzessor = new NotenProzessor();

        int noten[] = new int[] { 10, 20, 30, 48, 50, 67, 80, 99, 100};

        System.out.println();
        System.out.print("Exercise 1");
        System.out.println();

        System.out.print("Theese are the grades, which aren't sufficient: ");
        System.out.println(Arrays.toString(notenProzessor.nichtAusreichendeNoten(noten)));
        System.out.print("This is the mean grade of all the grades of the array: ");
        System.out.println(notenProzessor.meanGrade(noten));
        System.out.print("Theese are the grades after being rounded: ");
        System.out.println(Arrays.toString(notenProzessor.roundedGrades(noten)));
        System.out.print("This is the maximum rounded grade: ");
        System.out.println(notenProzessor.maxGrade(noten));
        System.out.print("This is the maximum grade, which has been rounded: ");
        System.out.println(notenProzessor.maxRoundedGrade(noten));

        Problem2 problem2 = new Problem2();

        int values[] = new int[] {4, 8, 3, 10, 17};

        System.out.println();
        System.out.print("Exercise 2");
        System.out.println();

        System.out.print("The maximum value of the array: ");
        System.out.println(problem2.maxValue(values));
        System.out.print("The minimum value of the array: ");
        System.out.println(problem2.minValue(values));
        System.out.print("The minimum sum of the n - 1 values of the array is: ");
        System.out.println(problem2.minSum(values));
        System.out.print("The maximum sum of the n - 1 values of the array is: ");
        System.out.println(problem2.maxSum(values));

        Problem3 problem3 = new Problem3();

        int firstValue[] = new int[] {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int secondValue[] = new int[] {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int thirdValue = 2;

        System.out.println();
        System.out.print("Exercise 3");
        System.out.println();

        System.out.print("This is the sum between the 2 values: ");
        System.out.println(Arrays.toString(problem3.calculateSum(firstValue, secondValue) ));
        System.out.print("This is the difference between the 2 values: ");
        System.out.println(Arrays.toString(problem3.calculateDiff(firstValue, secondValue) ));
        System.out.print("This is the result of the multiplication of the 2 values: ");
        System.out.println(Arrays.toString(problem3.multiply(firstValue,thirdValue)));
        System.out.print("This is the result of the division of the 2 values: ");
        System.out.println(Arrays.toString(problem3.division(firstValue, thirdValue)));


        Problem4 problem4 = new Problem4();

        int keyboards[] = new int[] {40, 50, 60};
        int UDBdrive[] = new int[] {8, 16};
        int budget = 60;

        System.out.println();
        System.out.print("Exercise 4");
        System.out.println();

        System.out.print("This is the cheapest keyboard on stock: ");
        System.out.println(problem4.cheapestKeyboard(keyboards));
        System.out.print("This is the most expensive item on stock: ");
        System.out.println(problem4.mostExpensiveItem(keyboards,UDBdrive));
        System.out.print(("This is the most expensive USB drive Markus can afford: "));
        System.out.println(problem4.buyByBudget(UDBdrive, budget));
        System.out.print("This is the total cost after buying a keyboard and also a USB drive: ");
        System.out.println(problem4.costs(keyboards, UDBdrive, budget));



    }


}
