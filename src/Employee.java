public class Employee {
    public static int count;
    private int id;
    private String name;
    private String middleName;
    private String lastName;
    private int department;
    private float salary;



    public Employee(String name, String pytronymic, String lastName, int department, float salary) {

        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = count + 1;
        count += 1;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", middleName = '" + middleName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", department = " + department +
                ", salary = " + salary;
    }
}