class MyArrayDataException extends NumberFormatException {
    int i,j;

    public MyArrayDataException(int i, int j) {
        super("Ошибка в ячейке " + j + "х" + i);
        this.i = i;
        this.j = j;
    }
}