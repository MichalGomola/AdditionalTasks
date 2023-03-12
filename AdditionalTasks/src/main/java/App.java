import com.info.javabasics.streamst1.Task1;

import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<Integer> data = Stream.iterate(1, i -> i + 1).limit(100);
        List<Integer> result = Task1.paging(10,3,data);
        System.out.println(result);
    }
}
