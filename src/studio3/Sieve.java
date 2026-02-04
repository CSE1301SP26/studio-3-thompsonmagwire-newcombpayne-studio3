package studio3;
import java.util.Scanner;
public class Sieve {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give an intiger");
    int x = in.nextInt();
    int[] numbers = new int[x-1];
    int[] composites = new int[x-1];
    int i=x;
    while (i>1) {
        numbers[i-2] = i;
        i--;
    }
    for (x=2; x<numbers[x-1]; x++) {
        for (int number : numbers) {
            int y = number*x;
            if (y<x) {
            composites[y-2] = y;
            }
        }
    }
    for (int composite : composites) {
        System.out.println(composite);
    }
    
}   
}

