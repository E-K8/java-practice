package streamAPI.intermediate_operations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    static List<Employee> list = Data.getEmployeesList();

    public static void main(String[] args) {

        list.stream().limit(10).forEach(System.out::println);

        Stream.of(1,2,3).map(e->e*5).forEach(System.out::println);

        Stream.of("Kate", "Peter").map(e->e.toUpperCase()).forEach(System.out::println);

        list.stream().limit(10).map(Employee::gender).forEach(System.out::println);

        System.out.println(list.stream().map(Employee::country).distinct().count());

        System.out.println(list.stream().map(Employee::country).distinct().toList());

        System.out.println(list.stream().filter(e->e.gender().equals("Female")).mapToDouble(Employee::salary).average());

        list.stream().limit(10).sorted(Comparator.comparingDouble(Employee::salary)).forEach(System.out::println);
    }
}
