public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(){}
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }
    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "Employee: " + getId() + ". " + getName() + " " + getSurname() +
                ", position: " + position +
                ", earns " + salary + " KZT" ;
    }
}
