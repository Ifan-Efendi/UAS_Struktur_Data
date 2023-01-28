import java.util.Scanner;

class LinearSearch {
    public static int search(String[] arr, String key) {
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Masukkan elemen dalam array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.print("Masukkan kata yang dicari: ");
        String key = sc.next();
        int result = search(arr, key);
        if (result == -1) {
            System.out.println("Kata tidak ditemukan dalam array");
        } else {
            System.out.println("Kata ditemukan pada indeks " + result);
        }
    }
}
