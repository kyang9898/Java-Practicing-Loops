import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number: ");
            int inputNum = Integer.valueOf(scanner.nextLine());
            for (int i = 1; i <= 10; i++) {
                System.out.println(inputNum + "x" + i + "=" + inputNum * i);
            }
            break;
        }
    }

}
