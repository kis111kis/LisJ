public class Task1 {
    public static int fact(int n) {
        if (n == 1)
            return n;
        return n * fact(n - 1);
    }

    public static void table() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }

    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
            return true;
        return false;
    }

    public static void quicksort(int[] array, int l, int r){
        int i = l, j = r;
        int x = array[(l+r)/2];
        while(i <= j){
            while(array[i] < x) i++;
            while(array[j] > x) j--;
            if(i<=j){
                int c = array[i];
                array[i] = array[j];
                array[j] = c;
                i++; j--;
            }
        }
        if(l < j)
            quicksort(array, l, j);
        if(i < r)
            quicksort(array, i, r);
    }

    public static int daysInYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(366);
        } else {
            System.out.println(365);
        }
        return 0;
    }


    public static int dayOfTheWeek(String n) {
        String[] s = new String[] {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        for(int i = 0; i < 7; i++){
            if(n.equals(s[i]))
                return i+1;
        }
        return 0;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i != array.length - 1)
                System.out.print(", ");
        }
        System.out.print("]\n");
    }

    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("[");
            for(int j = 0; j < array[i].length; j++){
                System.out.print(j);
                if(j != array[i].length - 1)
                    System.out.print(", ");
            }
            System.out.println("]");
        }
    }


    public static void main(String[] args) {
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2020));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        quicksort(array1D, 0, array1D.length-1);
        printArray(array1D);

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}






