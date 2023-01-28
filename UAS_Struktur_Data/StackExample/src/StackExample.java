import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        // Memasukan Element
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Menampilkan Element pada stack
        System.out.println("Elements in the stack: " + stack);

        // Menghapus element pada stack
        int deletedElement = stack.pop();
        System.out.println("Deleted element: " + deletedElement);

        // Menampilkan element pada stack seteleh dihapus
        System.out.println("Elements in the stack after deletion: " + stack);
    }
}
