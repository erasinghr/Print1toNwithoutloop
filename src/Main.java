import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNos(number);
    }
    public static void printNos(int N)
    {
        //Your code here
        if(N == 0){
            return;
        }
        printNos(N-1);
        System.out.print(N + " ");
    }
}