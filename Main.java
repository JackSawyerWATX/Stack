import java.util.*;

class Main {
    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println(stack.peek());

        ArrayDeque<Integer> stack2 = new ArrayDeque<>();

        stack2.push(0);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack2.push(7);
        stack2.push(8);
        stack2.push(9);
        stack2.push(10);

        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}