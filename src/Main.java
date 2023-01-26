import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> divisorOf52 = new ArrayList<>();
        divisorOf52.add(1);
        divisorOf52.add(2);
        divisorOf52.add(4);
        divisorOf52.add(13);
        divisorOf52.add(26);
        divisorOf52.add(52);

        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisorOf52);

        System.out.println(randomNumbers + "Lunghezza è:" + randomNumbers.size());

        randomNumbers.stream().distinct().forEach(System.out::println);
        System.out.println(randomNumbers);

        randomNumbers.sort((o1, o2) -> {
            Integer a1 = (Integer) o1;
            Integer a2 = (Integer) o2;
            return o2.compareTo(o1);
        });

        System.out.println(randomNumbers);
    }
}
