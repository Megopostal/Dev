/*      1.	Получить строковое название дня недели по номеру дня.
        2.	Найти расстояние между двумя точками в двумерном декартовом пространстве. Мас_методы с мал буквы
        3.	Вводим число (0-999), получаем строку с прописью числа.
        4.	Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число.
        5.	Для задания 1 расширить диапазон до 999 миллиардов.
        6.	Для задания 2 расширить диапазон до 999 миллиардов. */


public class BasicHW4 {
    public static void main(String[] args) {
        System.out.println(showTheNameByNumber(3));
        System.out.println(findTheDistance(1.5,0,3,4));
        System.out.println(convertNumberToUpperCase(1));
        System.out.println(convertNumberToUpperCase(11));
        System.out.println(convertNumberToUpperCase(19));
        System.out.println(convertNumberToUpperCase(20));
        System.out.println(convertNumberToUpperCase(99));
        System.out.println(convertNumberToUpperCase(123));
        System.out.println(convertNumberToUpperCase(234));
        System.out.println(convertNumberToUpperCase(355));
        System.out.println(convertNumberToUpperCase(456));
        System.out.println(convertNumberToUpperCase(567));
        System.out.println(convertNumberToUpperCase(678));
        System.out.println(convertNumberToUpperCase(789));
        System.out.println(convertNumberToUpperCase(890));
        System.out.println(convertNumberToUpperCase(999));
        System.out.println(convertNumberToUpperCase(100));
        System.out.println(convertNumberToUpperCase(700));
    }
//  1.	Получить строковое название дня недели по номеру дня.
    public static String showTheNameByNumber(int number) {
        String response;
        switch (number) // переключается в зависимости от введенного числа
        {
            case 1:
                response = "Понедельник";
                break;
            case 2:
                response = "Вторник";
                break;
            case 3:
                response = "Среда";
                break;
            case 4:
                response = "Четверг";
                break;
            case 5:
                response = "Пятница";
                break;
            case 6:
                response = "Суббота";
                break;
            case 7:
                response = "Воскресенье";
                break;
            default: throw new IndexOutOfBoundsException(); // если число не входит в интервал то ловим
        }
        return response;
    }

    // 2.	Найти расстояние между двумя точками в двумерном декартовом пространстве. Мас_методы с мал буквы
    public static double findTheDistance(double x1, double y1, double x2, double y2) {
        double distance = (double) Math.sqrt((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2-y1)); // чисто математика
        return distance;
    }

    //3.	Вводим число (0-999), получаем строку с прописью числа.
    public static String convertNumberToUpperCase(int number) {
        String[] BELOW_TWENTY = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] TENS = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] HUNDREDS = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        while (true) {
            if ( number < 0 || number > 1000 ) {
                System.out.println("Попробуй ещё раз...");
                continue;
            }

            if ( number < 20 )
                return BELOW_TWENTY[number];
            if (number >= 20 && number < 100 ) {
                int high = number / 10;
                int low = number % 10;
                String text = TENS[high];
                if ( low != 0 )
                    text = text + " " + BELOW_TWENTY[low];
                return text;
            }
            else if(number < 1000){
                int veryHigh = number / 100;
                int high = (number % 100) / 10;
                int low = number % 10;
                String text = HUNDREDS[veryHigh];
                if ( high == 1 ) {
                    text = text + " " + (number % 100);
                }
                else {
                    if(high != 0)
                        text = text + " " + TENS[high];
                    if(low != 0)
                        text = text + " " + BELOW_TWENTY[low];
                }
                return text;
            }
            else if (number == 100) {
                return (TENS[0]); }
        }
    }

    //4.	Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число.
/*    public static String convertUpperCaseToNumber(int number) {
    }*/
}
