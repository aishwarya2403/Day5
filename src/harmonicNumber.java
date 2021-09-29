import java.util.Scanner;
public class harmonicNumber {
        static double nthHarmonic(int N)
        {
            float harmonic = 1;
            for (int i = 2; i <= N; i++) {
                harmonic += (float)1 / i;
            }
            return harmonic;
        }
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int N= sc.nextInt();
            System.out.println(nthHarmonic(N));
        }
    }



