public class ThreadsControl {
    int size;
    int count_thread;

    public ThreadsControl(int size, int count_thread) {
        this.size = size;
        this.count_thread = count_thread;
    }

    public long goWork(){
        long begin_work_time = System.currentTimeMillis();
        ThreadFormula[] threads = new ThreadFormula[count_thread];
        Array array = new Array(size,count_thread);
        for (int i = 0; i < count_thread; i++) {
            threads[i] = new ThreadFormula(i,array);
        }
        for (int i = 0; i < count_thread; i++) {
            threads[i].start();
        }
        for (int i = 0; i < count_thread; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end_work_time = System.currentTimeMillis();
        return end_work_time - begin_work_time;
    }
}
