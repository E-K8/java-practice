package streamAPI.terminal_operations;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Kate", "is", "a", "programmer"));
        String truth =  list.stream().reduce("", (acc, word) -> acc + " " + word);
        System.out.println(truth);
    }
}
