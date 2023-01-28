import java.util.Arrays;

class Queue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    // Menambahkan elemen baru ke dalam queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue penuh!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println(item + " ditambahkan ke queue");
    }

    // Menghapus elemen dari depan queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Mengembalikan elemen di depan queue tanpa menghapusnya
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return -1;
        }
        return queue[front];
    }

    // Menampilkan isi queue
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }
        System.out.println("Isi queue:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    // Mengecek apakah queue kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Mengecek apakah queue penuh
    public boolean isFull() {
        return size == capacity;
    }
}

class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Menambahkan elemen ke queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Menampilkan isi queue
        queue.show();

        // Menghapus elemen dari depan queue
        int dequeuedItem = queue.dequeue();
        System.out.println(dequeuedItem + " dihapus dari queue");

        // Menampilkan elemen di depan queue tanpa menghapusnya
        int peekedItem = queue.peek();
        System.out.println("Elemen di depan queue: " + peekedItem);

        // Menampilkan isi queue setelah operasi
        queue.show();
    }
}
