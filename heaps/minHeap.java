package heaps;

import java.util.ArrayList;

public class minHeap {
    private ArrayList<Integer> heap;
    public minHeap(){
        this.heap = new ArrayList<>();
    }
    public void add(int data){
        this.heap.add(data);
        upHeapify(this.heap.size()-1);
    }

    private void upHeapify(int child){
        int parent = (child-1)/2;
        if(this.heap.get(parent) > this.heap.get(child)){
            swap(parent, child);
            upHeapify(parent);
        }
    }
    private void swap(int i, int j){
        int temp = this.heap.get(i);
        this.heap.set(i, this.heap.get(j));
        this.heap.set(j, temp);

    }
    public void print(){
        for(int i = 0; i<heap.size(); i++){
            System.out.println(this.heap.get(i));
        }
    }
    
    
}
