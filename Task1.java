import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String... args){
        String[] wordArray = {"KBTU", "IITU", "IITU","KIMEP", "KBTU", "SDU"};
        var freq = Arrays.stream(wordArray)
                         .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(freq);
    }
}