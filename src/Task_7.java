import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Andrii on 24.11.2016.
 */
public class Task_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int ordinalNum;
        int prime;


        System.out.print("Enter a ordinal number of prime you wanna find: ");

        ordinalNum = Integer.parseInt(in.readLine());
        prime = findNPrime(ordinalNum);

        System.out.println(ordinalNum + " number is: " + prime);

    }

    public static int findNPrime(int n){
        int count = 0;
        int num = 0;
        int i = 0;

        while (count!=n){
            if (isPrime(i)){
                count++;
                num = i;
            }
            i++;
        }

        return  num;
    }

    public static boolean isPrime(int n){
        if (n%2 == 0) return false;
        for (int i = 3; i * i <=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}
