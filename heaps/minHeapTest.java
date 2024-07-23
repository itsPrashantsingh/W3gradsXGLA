package heaps;

public class minHeapTest {
    public static void main(String[] args) {
        minHeap mh = new minHeap();
        mh.add(10);
        mh.add(12);
        mh.add(15);
        mh.add(3);
        mh.add(6);
        mh.add(1);

        mh.print();
    }
    
}
