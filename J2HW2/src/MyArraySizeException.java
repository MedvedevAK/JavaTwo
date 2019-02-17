class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int row, int col){
        super("Массив должен иметь размеры - 4х4, заданный размер массива - " + row + "x" + col);
    }
}