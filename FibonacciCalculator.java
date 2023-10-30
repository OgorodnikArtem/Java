import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {
    public List<Integer> generateFibonacciSequence(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть неотрицательным числом");
        }

        List<Integer> sequence = new ArrayList<>();
        if (n >= 1) {
            sequence.add(0);
        }
        if (n >= 2) {
            sequence.add(1);
        }

        while (sequence.size() < n) {
            int next = sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
            sequence.add(next);
        }

        return sequence;
    }
}
