public class ThreadFormula extends Thread {
        int number_thread;
        Array array;

        public ThreadFormula(int number_thread, Array array) {
            this.number_thread = number_thread;
            this.array = array;
        }

        @Override
        public void run(){
            for (int i = number_thread; i < array.getSizeArray(); i = i + array.getCountThread()) {
                float formula = (float)(array.getElement(i) * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                array.setElement(i,formula);
            }
        }
    }
