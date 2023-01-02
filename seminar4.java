//Написать приложение для ввода фио возраста и пола пользователей данные хранить в разных списках и выводить в таблице
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class seminar4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество пользователей");
        int n = in.nextInt();
        List<String> FIO = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<String> pol = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите ФИО");
            FIO.add(in.next());
            System.out.println("Введите возраст");
            age.add(in.nextInt());
            System.out.println("Введите пол");
            pol.add(in.next());
        }
//Добавить методы для сортировки пользователей по возрасту полу и первой букве фамилии.
        System.out.println("Введите 1 для сортировки по возрасту");
        System.out.println("Введите 2 для сортировки по полу");
        System.out.println("Введите 3 для сортировки по первой букве фамилии");
        int k = in.nextInt();
        if (k == 1) {
            age.stream().sorted().forEach(System.out::println);
        }
        if (k == 2) {
            pol.stream().sorted().forEach(System.out::println);
        }
        if (k == 3) {
            FIO.stream().sorted().forEach(System.out::println);
        }
    }
}

