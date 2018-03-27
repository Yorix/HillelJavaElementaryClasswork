package lesson17.inner;

public class List {
    private static int MAX = 100;
    private String[] arr = new String[MAX];
    private int counter = 0;

    public void add(String value) {
        if (counter >= MAX) return;
        arr[counter++] = value;
    }

    public Iterator getIterator() {
        return new Iterator();
    }

    public class Iterator implements InterIterator {
        private int i = 0;

        @Override
        public void next() {
            i++;
        }

        @Override
        public String current() {
            return arr[i];
        }

        @Override
        public boolean end() {
            return i == MAX;
        }
    }

    public static void main(String[] args) {
        List list = new List();
        list.add("AS");
        list.add("ADS");
        list.add("ADS");
        list.add("ASD");
        list.add("Big ASD");

        InterIterator interIterator = list.getIterator();

        while (!interIterator.end()) {
            System.out.println(interIterator.current());
            interIterator.next();
        }

        List.Iterator myIterator = new List().new Iterator();
    }
}
