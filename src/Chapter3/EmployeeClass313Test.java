package Chapter3;
import java.util.Scanner;

public class EmployeeClass313Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeClass313 emp1 = new EmployeeClass313("Tom", "Cat",3500);
        EmployeeClass313 emp2 = new EmployeeClass313("Jerry", "Mouse",3850);

        System.out.printf("%s, the %s - salary: %.2f%n", emp1.getFirstName(),emp1.getLastName(),emp1.getSalary());
        System.out.printf("%s, the %s - salary: %.2f%n", emp2.getFirstName(),emp2.getLastName(),emp2.getSalary());
        displaySalary(emp1, emp2);
        emp1.setSalary(emp1.getSalary()*1.1);
        emp2.setSalary(emp2.getSalary()*1.1);
        System.out.println("Прибавим 10%");
        displaySalary(emp1, emp2);
        System.out.print("Вводим новую зарплату Тому: ");
        emp1.setSalary(input.nextDouble());
        displaySalary(emp1,emp2);

        input.close();
    }

    public static void displaySalary(EmployeeClass313 emp1, EmployeeClass313 emp2){
        System.out.printf("Годовая зарплата %s: %.2f%n", emp1.getFirstName(), emp1.getSalary()*12);
        System.out.printf("Годовая зарплата %s: %.2f%n", emp2.getFirstName(), emp2.getSalary()*12);
    }
}