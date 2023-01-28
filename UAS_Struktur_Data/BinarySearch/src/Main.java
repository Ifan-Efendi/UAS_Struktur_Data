class BinarySearch {
    public static int search(String[] arr, int l, int r, String key) {
        if (r >= l) {
            int mid = (l + r) / 2;
            if (mid % 2 == 0) {
                if (arr[mid].equals(key)) {
                    return mid;
                }
                if (arr[mid].compareTo(key) > 0) {
                    return search(arr, l, mid - 2, key);
                }
                return search(arr, mid + 2, r, key);
            } else {
                return search(arr, l, r, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "cherry", "date", "elderberry", "fig", "grape" };
        String key = "cherry";
        int result = search(arr, 0, arr.length - 1, key);
        if (result == -1) {
            System.out.println("Kata tidak ditemukan dalam array");
        } else {
            System.out.println("Kata ditemukan pada indeks " + result);
        }
    }
}
