package Exercise;
import java.util.Scanner;
public class Q3 {
    String name ;
    int age ;
    int empId;

    public Q3(String name, int age, int empId) {
        this.name = name;
        this.age = age;
        this.empId = empId;
    }

    public static void showDetails(Q3[] empl,int limit){
        for(int i=0; i<limit; i++){
            System.out.println("---------* Employee Details *-----------");
            System.out.println("        Employee Name :" + empl[i].name);
            System.out.println("        Employee age :" + empl[i].age);
            System.out.println("        Employee empId :" + empl[i].empId);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Employees to store : ");
        int num = sc.nextInt();
        sc.nextLine();
        Q3 []empl = new Q3[num];

        for(int i=0;i<num ; i++){
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();
            empl[i] = new Q3(name, age, empId);
        }

        System.out.print("\nEnter the limit of employees to display: ");
        int limit = sc.nextInt();

        showDetails(empl,limit);
    }
}
