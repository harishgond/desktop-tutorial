import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students(N): ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of subjects(M): ");
        int m = scanner.nextInt();
        int[][] test1= new int[n][m];
        int[][] test2= new int[n][m];
        int[][] comulativeMarks= new int[n][m];
        System.out.println("Enter the marks for Test 1: ");
        for(int i=0;i<n;i++){
            System.out.println("Enter marks for student " + (i+1) + ": cd hh");
            for(int j=0;j<m;j++){
                System.out.print("Subject " + (j+1) + ": ");
                test1[i][j] = scanner.nextInt();
            }
        
        }
        System.out.println("Enter the marks for Test 2: ");
        for(int i=0;i<n;i++){
            System.out.println("Enter marks for student " + (i+1) + ": ");
            for(int j=0;j<m;j++){
                System.out.print("Subject " + (j+1) + ": ");
                test2[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                comulativeMarks[i][j] = test1[i][j] + test2[i][j];
            }
        }
        System.out.println("======================================");
        System.out.println("          CUMULATIVE MARKS SHEET         ");
        System.out.println("======================================");
        System.out.println("Student\t\t");
        for(int j=0;j<m;j++){
            System.out.print("Subject " + (j+1) + "\t");
        }
        System.out.println("\n--------------------------------------");
        for (int i=0;i<n;i++){
            System.out.print("Student " + (i+1) + "\t");
            for(int j=0;j<m;j++){
                System.out.print(comulativeMarks[i][j] + "\t");
            }
        }
    }
}