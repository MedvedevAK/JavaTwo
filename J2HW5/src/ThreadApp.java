public class ThreadApp {
    static final int SIZE = 10000000;

    public static void main(String[] args) {
        System.out.println("Время работы в шесть потоках      : "+ new ThreadsControl(SIZE,6).goWork() +" мс");
        System.out.println("Время работы в пять потоках       : "+ new ThreadsControl(SIZE,5).goWork() +" мс");
        System.out.println("Время работы в четыре потока      : "+ new ThreadsControl(SIZE,4).goWork() +" мс");
        System.out.println("Время работы в три потока         : "+ new ThreadsControl(SIZE,3).goWork() +" мс");
        System.out.println("Время работы в два потока         : "+ new ThreadsControl(SIZE,2).goWork() +" мс");
        System.out.println("Время работы в один поток         : "+ new ThreadsControl(SIZE,1).goWork() +" мс");
    }
    public static void go(int number){
        float[] arr = new float[SIZE];

        if (number == 1) {
            for (int i = 0; i < SIZE; i++) {
                arr[i] = 1;
            }
            long a = System.currentTimeMillis();
            for (int i = 0; i < SIZE; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            long b = System.currentTimeMillis();
            System.out.println(b - a + " мс");
        }
    }
}