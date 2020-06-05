
/*
Одномерные массивы
        1.	Найти минимальный элемент массива
        2.	Найти максимальный элемент массива
        3.	Найти индекс минимального элемента массива
        4.	Найти индекс максимального элемента массива
        5.	Посчитать сумму элементов массива с нечетными индексами
        6.	Сделать реверс массива (массив в обратном направлении)
        7.	Посчитать количество нечетных элементов массива
        8.	Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
        9.	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
        10.	Отсортировать массив (Quick, Merge, Shell, Heap)
*/


import java.util.Arrays;

public class BasicHW3 {
    public static void main(String[] args) {
        System.out.println("findTheMinimum: " + findTheMinimum(new int[] {2, 4, 6, 1}));
        System.out.println("findTheMaximum: " + findTheMaximum(new int[] {2, 4, 6}));
        System.out.println("findTheIndexOfMinimum: " + findTheIndexOfMinimum(new int[] {2, 4, 6}));
        System.out.println("findTheIndexOfMaximum: " + findTheIndexOfMaximum(new int[] {2, 4, 6}));
        System.out.println("summaryOfOddArraysElements: " + summaryOfOddArraysElements(new int[] {1,2,3,4,5,6,7,8,9}));
        System.out.println("mirrorTheArray: " + Arrays.toString(mirrorTheArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println("countQuantityOfOddElements: " + countQuantityOfOddElements(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println("swapTheSecondHalf: " + Arrays.toString(swapTheSecondHalf(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println("sortByBubble: " + Arrays.toString(sortByBubble(new int[] {1, 2, 4, 15, 6, 11, 0, 9})));
        System.out.println("sortBySelect: " + Arrays.toString(sortBySelect(new int[] {1, 2, 4, 15, 6, 11, 0, 9})));
        System.out.println("sortByInsert: " + sortByInsert(new int[] {1, 2, 4, 15, 6, 11, 0, 9}));
    }
// 1.	Найти минимальный элемент массива
    public static int findTheMinimum(int [] array) {
    int minimum = array [0];
    for (int i =0; i < array.length; i++) {
        if (array[i] < array[0]) { //сравниваем с нулевым элементом
            minimum = array[i]; // если нулевой меньше то и есть минимумом
        }
    }
        return minimum; // иначе минимумом будет число наименьшее после прохождения иттерации
    }

//    2.	Найти максимальный элемент массива

    public static int findTheMaximum(int [] array) {
        int maximum = array [0];
        for (int i =0; i < array.length; i++) {
            if (array[i] > array[0]) { //сравниваем с нулевым элементом
                maximum = array[i]; // если нулевой больше то и есть максимумом
            }
        }
        return maximum; // иначе максимумом будет число наибольшее после прохождения иттерации
    }

//    3.	Найти индекс минимального элемента массива
    public static int findTheIndexOfMinimum(int [] array) {
        int minimum = array [0];
        int indexOfMinimum = 0;
        for (int i =0; i < array.length; i++) {
            if (array[i] < array[0]) {
                minimum = array[i];
                indexOfMinimum = i;//аналогично примерам выше, только возвращаем индекс
            }
        }
        return indexOfMinimum;
    }

//    4.	Найти индекс максимального элемента массива

    public static int findTheIndexOfMaximum(int [] array) {
        int maximum = array [0];
        int indexOfMaximum = 0;
        for (int i =0; i < array.length; i++) {
            if (array[i] > array[0]) {
                maximum = array[i];
                indexOfMaximum = i;
            }
        }
        return indexOfMaximum; //аналогично примерам выше, только возвращаем индекс
    }

//    5.	Посчитать сумму элементов массива с нечетными индексами

    public static int summaryOfOddArraysElements(int [] array) {
        int response = 0;
        for (int i = 1; i < array.length; i++) // иттерация длиною в массив
        {
            if (i % 2 == 0)
            {
                response += array[i]; //если число кратное то прибавляем
            }
        }
        return response; // если некратное то выдаем ответ
    }

//    6.	Сделать реверс массива (массив в обратном направлении)

    public static int [] mirrorTheArray(int [] array) {
        for (int left = 0, right = array.length - 1; left < right; left++, right--) { // меняем индексы местами
            int temp = array[left]; //буфер для замены границ
            array[left]  = array[right];
            array[right] = temp;
        }
        return array; // возвращаем
    }


//        7.	Посчитать количество нечетных элементов массива

    public static int countQuantityOfOddElements(int [] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) { // если кратно 2, тогда плюсуем
                count++;
            }
            else {
            }
        }
        return count; // если нечетное тогда ничего не делаем
    }


//        8.	Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2

    public static int[] swapTheSecondHalf(int [] array) {
        int mod = array.length % 2; //делим массив по модулю на 2. Результат = 1
        int half = array.length/2; //делим длину массива на 2. = 4
        for (int i = 0; i < half; i++) { // инкриментируем на велчину половины длины массива
            int temp = array[i]; // присваиваем значение, для буфера
            array[i] = array[half + i + mod]; // увеличиваем индексы начиная с половины длины массива
            array[half + i + mod] = temp; // окончательно меняем
        }
        return array;
    }

//            9.	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))

    public static int[] sortByBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] sortBySelect(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }

    public static String sortByInsert(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
        }
        return Arrays.toString(array);
    }

//            10.	Отсортировать массив (Quick, Merge, Shell, Heap)


        /*public static String sortByMerge(int[] array) {}
        public static String sortByShell(int[] array) {}
        public static String sortByHeap(int[] array) {}*/
}
