package _1_learn._1_4_data_structure._1_4_13_blocking_deque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**/
public class BlockingDequeExample {
    public static void main(String[] args) {
        blockingDeque();
    }

    private static void blockingDeque() {
        BlockingDeque<String> number = new LinkedBlockingDeque<>();
        number.offer("1");
        number.offer("2");
        number.offer("3");
        number.offerFirst("4");
        number.offerLast("5");
        System.out.println(".offer(), .offerFirst(), .offerLast(): " + number);
        System.out.println(".peek()                              : " + number.peek());
        System.out.println(".peekFirst()                         : " + number.peekFirst());
        System.out.println(".peekLast()                          : " + number.peekLast());
        System.out.println(".poll()                              : " + number.poll());
        System.out.println(".poll() after                        : " + number);
        System.out.println(".pollFirst()                         : " + number.pollFirst());
        System.out.println(".pollFirst() after                   : " + number);
        System.out.println(".pollLast()                          : " + number.pollLast());
        System.out.println(".pollLast() after                    : " + number);

        number.push("6");
        System.out.println(".push() after                        : " + number);
        System.out.println(".pop()                               : " + number.pop());
        System.out.println(".peek()                              : " + number.peek());
    }
}