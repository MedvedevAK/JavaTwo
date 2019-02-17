public class Main {
    static int sum = 0;

    public static void main(String[] args) {

        String[][] mass = new String[11][7];
        int count = 0;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = Integer.toString(count);
                count++;
            }
        }

        mass[1][2] = "error";
        mass[3][1] = "lay";

        try{
            arrSize(mass);
        } catch (MyArraySizeException e){
            System.out.println("Ошибка размерности");
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                try{
                    arrSum(mass, i, j);
                } catch (MyArrayDataException e){
                    System.out.println(" Веденне данные не верны, ячейка " + e.i + " " + e.j);
                }
            }
        }
        System.out.println("Сумма чисел в массиве " + sum);

    }

    static void arrSum(String[][] mass, int i, int j) throws MyArrayDataException {
        try {
            sum += Integer.parseInt(mass[i][j]);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i,j);
        }
    }

    static void arrSize(String[][] mass) throws MyArraySizeException {
        try{
            if(mass.length !=4){
                throw new MyArraySizeException(mass.length, mass[0].length);
            }
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }

        for (String[] strings : mass) {
            if(strings.length !=4){
                throw new MyArraySizeException(mass.length, strings.length);
            }
        }
    }
}
