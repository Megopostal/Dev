public class BasicHWremade {
    public static void main(String[] args) {
        System.out.println(getQuarterByCoordinates(0, 0));
        System.out.println(getQuarterByCoordinates(0, 1));
        System.out.println(getQuarterByCoordinates(0, -1));
        System.out.println(getQuarterByCoordinates(1, 0));
        System.out.println(getQuarterByCoordinates(-1, 0));
        System.out.println(getQuarterByCoordinates(1, 1));
        System.out.println(getQuarterByCoordinates(1, -1));
        System.out.println(getQuarterByCoordinates(-1, 1));
        System.out.println(getQuarterByCoordinates(-1, -1));
        System.out.println("");
        System.out.println(defineNumber(5, 5));
        System.out.println(defineNumber(4, 6));
        System.out.println(defineNumber(0, 3));
        System.out.println(defineNumber(-2, 4));
        System.out.println(defineNumber(-3, 8));
        System.out.println("");
        System.out.println(onlyPositiveNum(5, 9, -6));
        System.out.println(onlyPositiveNum(0, 10, -6));
        System.out.println(onlyPositiveNum(10, 0, -6));
        System.out.println(onlyPositiveNum(10, 10, 0));
        System.out.println(onlyPositiveNum(0, 0, 3));
        System.out.println(onlyPositiveNum(0, 2, 0));
        System.out.println(onlyPositiveNum(0, 0, 0));
        System.out.println(onlyPositiveNum(0, 0, -6));
        System.out.println(onlyPositiveNum(-4, -7, -6));
        System.out.println("");
        System.out.println(getMaxResult(1, 2, 3));
        System.out.println(getMaxResult(2, 2, 2));
        System.out.println(getMaxResult(1, 1, 1));
        System.out.println(getMaxResult(3, 0, 5));
        System.out.println("");
        System.out.println(defineTheMark(65));
        System.out.println(defineTheMark(89));
        System.out.println(defineTheMark(0));
        System.out.println(defineTheMark(101));
    }

    public static String getQuarterByCoordinates(int x, int y) {
        // 2.	Определить какой четверти принадлежит точка с координатами (х,у)
        String message = "";
        if (x == 0 && y == 0) {
            message = "Точка находится в начале координат (0;0)";
        }        // + 4 граничных случая для ситуаций когда точка лежит на оси Х or Y
        if (x == 0 && y > 0) {
            message = "Точка находится на оси Y, между I и II четвертью";
        } if(x == 0 && y < 0) {
            message = "Точка находится на оси Y, между III и IV четвертью";
        } if (x > 0 && y == 0) {
            message = "Точка находится на оси X, между I и IV четвертью";
        } if (x < 0 && y == 0) {
            message = "Точка находится на оси X, между II и III четвертью";
        }
        if (x == 0 && y == 0) {
            message = "Точка находится в начале координат (0;0)";
        }
        if (x > 0 && y > 0) {
            message = "Точка находится в I четверти";
        } else if (x < 0 && y < 0) {
            message = "Точка находится в III четверти";
        } else if (x > 0 && y < 0) {
            message = "Точка находится в IV четверти";
        } else if (x < 0 && y > 0) {
            message = "Точка находится в II четверти";
        }
        return message;
    }

    public static int defineNumber(int a, int b) {
        // 1.	Если а – четное посчитать а*б, иначе а+б
        int result = 0;

        if (a % 2 == 0) { // если делится (по модулю) без остатка на 2, выполняется условие в фигурных скобках
            result = a * b;
        } else {            // если не делится, выполняется альтернативное условие
            result = a + b;
        }

        return result; // возвращаем результат для вывода в консоль, через метод
    }

    public static int onlyPositiveNum(int num1, int num2, int num3) {
        // 3.	Найти суммы только положительных из трех чисел
        int result = 0;  // инициализация переменной для дальнейшего ее изменения


        if (num1 > 0) {
            result = result + num1;
        }
        if (num2 > 0) {
            result = result + num2;
        }
        if (num3 > 0) {
            result = result + num3;
        }
        if (num1 <= 0 ) {
            result = num2+ num3;
            // разработать граничные значения или частные случаи
        } if (num2 <= 0 ) {
            result = num1 + num3;
        } if (num3 <= 0 ) {
            result = num1 + num2;
        } if (num1 <= 0 && num2 <= 0 && num3 <= 0)
            result = 0;

        return result;
    }

    public static int getMaxResult(int a, int b, int c) { // 1, 2, 3
        // 4.	Посчитать выражение max(а*б*с, а+б+с)+3
        int ressult = 0;
        int multiply = (a * b * c); // 6
        int summa = (a + b + c); // 6

        if (multiply < summa) {
            ressult = multiply + 3;
        } else if (multiply == summa) {
            ressult = multiply + 3;
        } else {
            ressult = summa + 3;
        }

        return ressult;
    }

    public static String defineTheMark(int m) {
        /* 5.	Написать программу определения оценки студента по его рейтингу,
         на основе следующих правил */
        String mark = "";
        if (0 < m && m <= 19) {
            mark = "Your mark is F";
        } else if (20 <= m && m <= 39) {
            mark = "Your mark is E";
        }  else if (40 <= m && m <= 59) {
            mark = "Your mark is D";
        }  else if (60 <= m && m <= 74) {
            mark = "Your mark is C";
        }  else if (75 <= m && m <= 89) {
            mark = "Your mark is B";
        }  else if (90 <= m && m <= 100) {
            mark = "Your mark is A";
        } else { mark ="You're screwed!"; }
        return mark;
    }
}
