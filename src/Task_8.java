/**
 * Created by Andrii on 24.11.2016.
 */
public class Task_8
{
    public static void main(String[] args) {
        int sum=0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

//        while (true){
//            num1 = i;
//            num2 = i+1;
//            num3 = num1*num1 + num2*num2;
//
//            sum = sum(num1, num2, num3);
//            if (sum == 1000)break;
//
//            i++;
//        }

//        for (int i = 1; i <= 1000; i++){
//            num1 = i;
//            for (int j = i; j <= 1000; j++) {
//                num2 = j;
//                num3 = num1*num1 + num2*num2;
//                if (sum(num1, num2, num3)==1000 && isNatural(num3)){
//                    System.out.printf("Num1: %d, Num2: %d, Num3: %d, Sum: %d\n ", num1, num2, num3, sum);
//                    break;
//                }
//            }
//        }

        int i=0;
        int j=0;

        while (true){
            num1 = i;
            num2 = j;

            num3 = num1*num1 + num2 * num2;
            if (isNatural(num3)){
                sum = sum(num1, num2, num2);
                System.out.printf("Num1: %d, Num2: %d, Num3: %d, Sum: %d\n ", num1, num2, num3, sum);
                if (sum >= 1000){
                    break;
                }
            }
            i++;
            j++;
        }

        double n1= 4;
        double n2= 16;
        double n3= 63;

        System.out.println(n1 + " " + Math.sqrt(n1) + " " +  isNatural(Math.sqrt(n1)));
        System.out.println(n2 + " " + Math.sqrt(n2) + " " +  isNatural(Math.sqrt(n2)));
        System.out.println(n3 + " " + Math.sqrt(n3) + " " +  isNatural(Math.sqrt(n3)));

        System.out.println();

        //System.out.printf("Num1: %d, Num2: %d, Num3: %d, Sum: %d\n ", num1, num2, num3, sum);
        System.out.println("Product: " + (num1 * num2 * num3));
    }

    public static int sum(int a, int b, int c){
        return (a + b + c);
    }

    public static boolean isNatural(double square){
        double number = Math.sqrt(square);


        if ((int)number == number){
            return true;
        }else return false;
    }

}
