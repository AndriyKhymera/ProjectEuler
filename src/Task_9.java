/**
 * Created by andrii on 24.01.17.
 */
public class Task_9 {
    public static void main(String[] args) {

        double c;
        int c1;


        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                c = Math.sqrt(i*i + j*j);
                if ( c == (int)c){
                    if (sum(i, j, (int)c) == 1000) {
                        System.out.println("A: " + i + " B: " + j + " C: " + c + " Sum: " + sum(i, j,(int) c));
                        System.out.println("Mult: " + multiplie(i, j, (int) c));
                        break;
                    }
                }
            }
        }

    }

    public static int sum (int a, int b, int c){
        return (a + b + c);
    }

    public static int multiplie(int a, int b, int c){
        return a*b*c;
    }
}
