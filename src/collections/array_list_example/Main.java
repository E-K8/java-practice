package collections.array_list_example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    static Comparator<Employee> salaryComparator = (e1, e2) -> Double.compare(e1.salary(), e2.salary());

    public static void main(String[] args) {
        List<Employee> list = getEmployeesList();
//        list.sort(Comparator.naturalOrder());
        list.sort(salaryComparator);
//        list.forEach(System.out::println);

        Employee employee = list.get(2);
        System.out.println(employee);

        maxSalary(list, "Male");
        maxSalary(list, "Female");
    }

    public static void maxSalary(List<Employee> list, String gender) {
        double maxSalary = 0;
        for (Employee emp : list) {
            if (emp.gender().equals(gender) && emp.salary() > maxSalary) {
                maxSalary = emp.salary();
            }
        }
        System.out.println("Max salary for gender: " + gender + " is: " + maxSalary);
    }

    public static List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Lewis", "Male", 21000.34, "Data Coordinator"));
        employees.add(new Employee(2, "Pamela Anderson", "Female", 22000.34, "Courier"));
        employees.add(new Employee(3, "Oliver Jones", "Male", 43000.34, "Data Engineer"));
        employees.add(new Employee(4, "Steven King", "Male", 25600.34, "Recruitment Consultant"));
        employees.add(new Employee(5, "Emma Burnham", "Female", 23700.34, "Office Administrator"));
        employees.add(new Employee(6, "Claudia Spikes", "Female", 31000.34, "Junior frontend developer"));
        employees.add(new Employee(7, "Abigail Stones", "Female", 71000.34, "Backend Developer"));
        return employees;
    }
}
