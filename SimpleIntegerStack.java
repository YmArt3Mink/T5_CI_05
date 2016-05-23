import java.util.ArrayList;
import java.util.Iterator;

class SimpleIntegerStack implements Iterable<Integer> {
    private int maxStackSize;
    private ArrayList<Integer> stackArray;


    public SimpleIntegerStack() {
        this.maxStackSize = maxStackSize;
        this.stackArray = new ArrayList<>();
    }

    public void push(int element) {
        stackArray.add(element);
    }

    public int pop() {
        return stackArray.remove(0);
    }

    public int getTop() {
        return stackArray.get(0);
    }

    public boolean isEmpty() {
        return stackArray.size() <= 0;
    }
    public int getSize() {
        return stackArray.size();
    }

    public Iterator iterator() {
        return new Iterator<Integer>() {
            private int pos=0;

            public boolean hasNext() {
                return stackArray.size() > pos;
            }

            public Integer next() {
                return stackArray.get(pos++);
            }

            public void remove() {
                throw new UnsupportedOperationException("Cannot remove an element of stack!");
            }
        };
    }
}

