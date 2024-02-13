package CreationalDesignPattern.BuilderPattern;

public final class Employee {
    private final String name; //necessary
    private final String company; //necessary
    private final boolean hasCar; //optional
    private final boolean hasBike; //optional

    private Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.company = employeeBuilder.company;
        this.hasCar = employeeBuilder.hasCar;
        this.hasBike = employeeBuilder.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public static class EmployeeBuilder {
        private final String name; //necessary
        private final String company; //necessary
        private boolean hasCar; //optional
        private boolean hasBike; //optional

        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
