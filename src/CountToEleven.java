import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number less than 11");
            int numInput = scanner.nextInt();
            if(numInput > 10){
                System.out.println(numInput);
                break;
            }
            for (int i = numInput; i < 12; i++){
                System.out.println(i);
            }
        }
    }

}
