import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array elements is: " + sum);
        input.close();
    }
}
