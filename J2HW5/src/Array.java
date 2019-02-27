public class Array {
    private int size_array;
    private float[] array;
    private int count_thread;

    public Array(int size_array, int count_thread) {
        this.size_array = size_array;
        this.count_thread = count_thread;
        array = new float[size_array];

        for (int i = 0; i < size_array; i++) {
            array[i] = 1;
        }
    }

    public int getSizeArray() {
        return size_array;
    }

    public int getCountThread() {
        return count_thread;
    }

    public float getElement(int index){
        return array[index];
    }

    public void setElement(int index, float value){
        array[index] = value;
    }
}