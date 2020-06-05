public class BasicHW {
    public static void main(String[] args) {
        int x = -2, y = 8;
        if (x >= 0 && y >= 0)
            System.out.println("Точка в верхней правой четверти");
        else if (x >= 0 && y <= 0)
            System.out.println("Точка в нижней правой четверти");
        else if (x <= 0 && y <= 0)
            System.out.println("Точка в нижней левой четверти");
        else
            System.out.println("Точка в верхней левой четверти");
    }

    public static int defineNumber(int a, int b, int result) {
        a = 3; b = 6;
        if (a % 2 == 0) result = a * b;
        else
            result = a + b;
        return result;
    }

    int num1 = 3, num2 = -4, num3 = 8;
    public static void OnlyPositiveNum (int num1, int num2, int num3) {
        int sum;
    if (num1 > 0 && num2 > 0)
       sum = num1 + num2;
    else if (num1 > 0 && num3 > 0)
        sum = num1 + num3;
    else if (num2 > 0 && num3 > 0)
        sum = num2 + num3;
    else {
        System.out.println("Error");
    }
    }

    public static void max(int a, int b, int c) {
        a =1; b=2; c=3;
        int max1 = (a*b*c)+3;
        int max2 =(a+b+c)+3;
        if (max1 < max2)
            System.out.println("The maximum is " + max2);
        else if (max1 == max2)
            System.out.println("There is no maximum");
        else
            System.out.println("The maximum is " + max1);
    }

    public void Mark(int m) {
        while (0 < m && m <= 19)
            System.out.println("Your mark is F");
        while (20 <= m && m <= 39)
            System.out.println("Your mark is E");
        while (40 <= m && m <= 59)
            System.out.println("Your mark is D");
        while (60 <= m && m <= 74)
            System.out.println("Your mark is C");
        while (75 <= m && m <= 89)
            System.out.println("Your mark is B");
        while (90 <= m && m <= 100)
            System.out.println("Your mark is A");
    }

    
}
