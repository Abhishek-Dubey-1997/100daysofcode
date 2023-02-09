import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int sp=0;
        int st=n;
        for(int i=0;i<n;i++) {
            for (int j = 1; j <= sp; j++) // to print the spaces before star
            {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) // to print the stars
            {
                System.out.print("*\t");
            }

            sp++;
            st -= 2;
            System.out.println();
        }
    }
}
