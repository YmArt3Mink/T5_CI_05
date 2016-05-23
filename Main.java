public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Stack!");

        SimpleIntegerStack simpleStack = new SimpleIntegerStack();
        if (simpleStack.isEmpty()) {
            simpleStack.push(565);
            simpleStack.push(6);
            simpleStack.push(888);
        }

        for (int stackItem:  simpleStack) {
            System.out.println(stackItem);
        }

        System.out.println(String.format("Stack top = %d", simpleStack.getTop()));
        System.out.println(String.format("Stack size = %d", simpleStack.getSize()));

        while (!simpleStack.isEmpty()) {
            simpleStack.pop();
        }

        if (simpleStack.isEmpty()) {
            System.out.println("Stack is empty!");
        }
    }
}