public class Student extends Person {
    private double gpa;
    public Student(){}
    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa>2.67)
            return 36660;
        return 0;
    }

    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "Student: " + getId() + ". " + getName() + " " + getSurname() +
                ", earns " + getPaymentAmount() + " KZT" ;
    }
}
