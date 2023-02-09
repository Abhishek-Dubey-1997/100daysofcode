import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int sp=0;
        int st=n;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }

            for(int k=1;k<=st;k++)
            {
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }

    }
}
