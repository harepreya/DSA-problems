import java.util.Arrays;
import java.util.NoSuchElementException;

public class PowerHeap {
    private final int powerExponent;
    private final int numChildren;
    private int size;
    private final int[] heapArray;

    public PowerHeap(int powerExponent, int capacity) {
        if (powerExponent < 0 || powerExponent > 10)
            throw new IllegalArgumentException("powerExponent must be between 0 and 10.");

        this.powerExponent = powerExponent;
        this.numChildren = (int) Math.pow(2, powerExponent);
        this.size = 0;
        this.heapArray = new int[capacity];
    }

    private int parent(int i) {
        return (i - 1) / numChildren;
    }

    private int child(int parentIndex, int k) {
        return parentIndex * numChildren + 1 + k;
    }

    public boolean isFull() {
        return size == heapArray.length;
    }

    public void insert(int value) {
        if (isFull()) {
            throw new NoSuchElementException("Heap is full.");
        }
        heapArray[size] = value;
        heapifyUp(size);
        size++;
    }

    private void heapifyUp(int index) {
        int temp = heapArray[index];
        while (index > 0 && temp > heapArray[parent(index)]) {
            heapArray[index] = heapArray[parent(index)];
            index = parent(index);
        }
        heapArray[index] = temp;
    }

    public int popMax() {
        if (size == 0)
            throw new NoSuchElementException("Heap is empty.");

        int max = heapArray[0];
        heapArray[0] = heapArray[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    private void heapifyDown(int index) {
        while (true) {
            int largest = index;

            for (int k = 0; k < numChildren; k++) {
                int childIndex = child(index, k);
                if (childIndex < size && heapArray[childIndex] > heapArray[largest]) {
                    largest = childIndex;
                }
            }

            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int tmp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(heapArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PowerHeap heap = new PowerHeap(2, 15); // 2^2 = 4 children per node

        heap.insert(10);
        heap.insert(30);
        heap.insert(20);
        heap.insert(50);
        heap.insert(40);

        heap.print(); // Should be in max-heap order

        System.out.println("Max item: " + heap.popMax());
        heap.print();
    }
}