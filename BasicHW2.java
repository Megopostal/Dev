public class BasicHW2 {
    public static void main(String[] args) {
        System.out.println(findOddSumAndQuantity());
/*        System.out.println(checkTheNumber(7));
        System.out.println(checkTheNumber(8));*/
        System.out.println(checkTheNumber2(7));
        System.out.println(checkTheNumber2(8));
        System.out.println(findTheRoot(17));
        System.out.println(findBinary(120));
        System.out.println(getFactorial(6));
        System.out.println(sumOfNum(34));
        System.out.println(showReflectedNum(234));
    }

    /* 1. Найти сумму четных чисел и их количество в диапазоне от 1 до 99
2.	Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)
3.	Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)
4.	Вычислить факториал числа n. n! = 1*2*…*n-1*n;!
5.	Посчитать сумму цифр заданного числа
6.	Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.
    */

 //   * 1. Найти сумму четных чисел и их количество в диапазоне от 1 до 99
    public static String findOddSumAndQuantity() {
        int summary = 0;
        int quantity = 0;

        for (int i = 1; i < 100; i++) { // берем числа от 1 до 99 включительно
            if (i % 2 == 0) {  // если делится (по модулю) без остатка на 2 (если четное), выполняется условие в фигурных скобках, то есть сложение таких чисел между собой и подсчет их количества
                summary = summary + i;
                quantity++;
            }
        }
        String all = "The sum is " + summary + " " + "and quantity is " + quantity;
        return all;
        // подсомтрел часть решения в интернете.
    }

    //2.	Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)
/*    public static boolean checkTheNumber(int number) {
        boolean checker;
        if (number < 2) checker = false; // все числа меньше 2 не рассматриваем
        else checker = true; // остальные рассматриваем

        for (int i = 2; i <= number / i; i++) {
            if ((number % i) == 0) {
                checker = false;
                break;
            } else checker = true;
            if (checker)
                System.out.println(number + " - число является простым");
            else System.out.println(number + " - число не является простым");
        }
        return checker;
        // если можно это всё реально упростить, тогда как ???

    }*/

    public static boolean checkTheNumber2(int something) {
        for (int i = 2; i <= something / 2; i++) { // пока число деленное на 2 больше или равно 2, инкрементируем
            if (something % i == 0) { // если число делится по модулю без остатка, тогда непростое
                return false;
            }
        }
        return true; // иначе простое
    }

    // 3. Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)
    public static int findTheRoot(int number) {
        {
            int i = 1;
            while (i * i <= number) { // определяем умножение каких чисел ближе всего к данному числу
                i++;
            }
            return i - 1; // выводим с учетом погрешности
        }
    }

    // делал не сам (гугл в помощь) 3-е. Последовательный подбор или поиск не нашёл
    public static int findBinary(int f) {
        int h = f;
        while (h * h >= f) { // когда произведение чисел больше или равно данному числу
            h = h / 2;      // делим его на 2, и так до выполнения условия
        }
        while (h * h < f) { // когда произведение чисел меньше данного числа, инкрементируем число когда оно меньше
            h++;
        }
        return h -1; //погрешность
    }

    //      4.	Вычислить факториал числа n. n! = 1*2*…*n-1*n;!
    public static int getFactorial(int q) {
        int w = 1;
        if (q > 1) {
            for (int i = 2; i <= q; i++) { //пока число меньше или равно 2, увеличиваем в каждой иттерации
                w = w * i;
            }
        }
        return w;
    }
    // подсмотрел в интернете


    // 5.	Посчитать сумму цифр заданного числа
    public static int sumOfNum(int z) {
        int sum = 0;
        while (z != 0) {
            sum += (z % 10); // к сумме прибавляем остаток от деления по модулю на 10
            z /= 10; // делим на 10, чтобы добраться до десятков, сотен...
        }
        return sum;
    }
    // Уже делал, осталось :)

    // 6.	Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.

    public static int showReflectedNum(int mir) { //234
        int mirror = 0;
        while (mir != 0) { // создается цикл с выполнением условия, пока не закончатся цифры с которыми работаем
            mirror = mirror * 10 + (mir % 10); // вытаскиваем 1 цифру, начиная с последней
            mir = mir / 10; //выполняется пока не будет равно нулю
        }
        return mirror;
    }
    // тоже делал давненько
}



