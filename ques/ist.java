public class ist {
    static int binary(int arr[], int n, int x) {

        int high = n - 1;
        int low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                low = mid++;
            } else {
                high = mid--;
            }
        }
        return -1;

    }

    static int linear(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
