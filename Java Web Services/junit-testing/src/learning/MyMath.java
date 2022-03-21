package learning;

public class MyMath {
    public int sum(int[] numbers) {
        int s = 0;
        for (int n: numbers) {
            s += n;
        }
        return s;
    }
}
