public class Program {
    
    // 2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
    public static boolean searchPalindrom(String firstStr, String secondStr) {
        return firstStr.equals(new StringBuilder(secondStr).reverse().toString());
    }

    // 3 *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    public static String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }

    // 4 Дано два числа, например 3 и 56, необходимо составить следующие строки:
    // 3 + 56 = 59
    // 3 – 56 = -53
    // 3 * 56 = 168
    // Используем метод StringBuilder.append().
    public static String compilerMathToStr(int num1, int num2, char sign) {
        StringBuilder mathTask = new StringBuilder();
        mathTask.append(num1).append(" ").append(sign).append(" ").append(num2).append(" = ");
        switch (sign) {
            case '+':
                mathTask.append(num1 + num2);
                break;
            case '-':
                mathTask.append(num1 - num2);
                break;
            case '*':
                mathTask.append(num1 * num2);
                break;
        }
        return mathTask.toString();
    }

    // 5 Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.insert(),
    // StringBuilder.deleteCharAt().
    public static String replacEqual(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.deleteCharAt(index).insert(index, "равно").toString();
    }
    

    // 6 *Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.replace().
    public static String nextReplacEquel(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.replace(index, index + 1, "equel").toString();
    }

        // 2
        System.out.println();
        if (searchPalindrom(str1, str2)) {
            System.out.println("2.\nВведенные вами строки являются вращением друг друга");
        } else
            System.out.println("2.\nВведенные вами строки НЕ являются вращением друг друга");

        // 3
        System.out.println();
        System.out.printf("3.\nПереворачиваем первую строку: %s\n", reverseStr(str1));
        System.out.printf("Переворачиваем вторую строку: %s\n", reverseStr(str2));

        // 4
        System.out.println();
        System.out.println("4.\nПримеры в виде строк:");
        int a = 3, b = 56;
        System.out.println(compilerMathToStr(a, b, '+'));
        System.out.println(compilerMathToStr(a, b, '-'));
        System.out.println(compilerMathToStr(a, b, '*'));

        // 5
        System.out.println();
        System.out.println("5-6.\nПримеры с заменой знака '=' на слово");
        System.out.println(replacEqual(compilerMathToStr(a, b, '+')));

        // 6
        System.out.println(nextReplacEquel(compilerMathToStr(a, b, '-')));
        System.out.println();
    }
