import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double arr[] = { 11.0, 54.0, 23.0, 32.0, 15.0, 24.0, 31.0, 12.0 };
        System.out.print("Array: [ ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.print("]");


// 2
        System.out.println();
        double arr2[] = { 11.0, 54.0, 23.0, 32.0, 15.0, 24.0, 31.0, 12.0 };
        System.out.print("Array: [ ");
        Arrays.stream(arr2, 0, arr2.length).forEach(i -> System.out.print(i + " "));
        System.out.print("]");


// 3
        System.out.println();
        double arr3[] = { 11.0, 54.0, 23.0, 32.0, 15.0, 24.0, 31.0, 12.0 };
        System.out.print("Array: [ ");
        Arrays.stream(arr3, 0, 5).forEach(i -> System.out.print(i + " "));
        System.out.print("]");
    }
}