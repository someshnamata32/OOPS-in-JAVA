class MaxFinder {

    int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    float findMax(float a, float b) {
        return (a > b) ? a : b;
    }

    int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}

public class Ass4_pr7 {
    public static void main(String[] args) {

        MaxFinder m = new MaxFinder();

        int x = 10, y = 20;
        System.out.println(m.findMax(x, y));

        float a = 5.6f, b = 3.2f;
        System.out.println(m.findMax(a, b));

        int[] arr = {4, 9, 2, 7};
        System.out.println(m.findMax(arr));
    }
}
