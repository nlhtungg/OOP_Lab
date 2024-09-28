import java.util.Scanner;

public class Lab1_65 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the size of array: ");
            int s = input.nextInt();
            int[] a = new int[s];
            int swap;
            for (int i=0;i<s;i++)
            {
                a[i] = input.nextInt();
            }
            for (int i=0;i<s;i++)
            {
                for(int j=i;j<s;j++)
                {
                    if (a[i]>a[j])
                    {
                        swap = a[i];
                        a[i] = a[j];
                        a[j] = swap;
                    }
                }
            }
            for (int i=0;i<s;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}