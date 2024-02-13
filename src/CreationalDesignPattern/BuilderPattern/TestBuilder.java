package CreationalDesignPattern.BuilderPattern;


public class TestBuilder {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Sachin", "ABC").setHasBike(true).setHasCar(false).build();
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Company: " + employee.getCompany());
        System.out.println("Has Bike: " + employee.isHasBike());
        System.out.println("Has Car: " + employee.isHasCar());
    }
}
