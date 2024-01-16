import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Student("StudentName1", "StudentSurname1", 2.88));
        people.add(new Student("StudentName2", "StudentSurname2", 2.55));
        people.add(new Student("StudentName3", "StudentSurname3", 2.68));
        people.add(new Employee("EmployeeName1", "EmployeeSurname1", "Position1", 999999));
        people.add(new Employee("EmployeeName2", "EmployeeSurname2", "Position2", 555555));
        people.add(new Employee("EmployeeName3", "EmployeeSurname3", "Position3", 111111));
        Collections.sort(people);
        printData(people);
    }
    public static void printData(Iterable<Person> people){
        for(Person person: people){
            System.out.println(person.toString());
        }
    }

}