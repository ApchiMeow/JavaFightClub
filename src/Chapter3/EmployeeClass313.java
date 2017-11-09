package Chapter3;
public class EmployeeClass313 {
    private String firstName;
    private String lastName;
    private double salary;
    public EmployeeClass313(String firstName, String lastName, double salary){
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        if(salary > 0.0) {
            this.salary = salary;
        }
    }
    public double getSalary() {
        return salary;
    }
}