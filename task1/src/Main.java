// Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
// boolean isGood (T item);
// Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
// Создайте следующие детские классы:
// • IsEven — ему дают целое число, он одобряет его, если оно чётное
// • IsPositive — ему дают целое число, он одобряет его, если оно положительное
// • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
// • BeginsWith — в конструкторе запоминает строку.
// Ему дают строку, он проверяет, что она начинается с того, что он запомнил

// Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
// Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
// Продемонстрируйте, что это работает.

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        IsEven<Integer> isEven = new IsEven<>();
        System.out.println(isEven.isGood(2));

        IsPositive<Integer> isPositive = new IsPositive<>();
        System.out.println(isPositive.isGood(5));

        BeginsWitha<String, Character> beginsWitha = new BeginsWitha<String, Character>('А');
        System.out.println(beginsWitha.isGood("Армагедон"));

        BeginsWith<String> beginsWith = new BeginsWith<>("Арм");
        System.out.println(beginsWith.isGood("Армагедон"));

        List<Integer> lst = new ArrayList<>(); 
        lst.add(6); lst.add(2); lst.add(3); lst.add(-8);
        lst.add(7); lst.add(-9); lst.add(1); lst.add(10);

        Filter<Integer> f = new Filter<>();
        System.out.println(f.filter(lst));
    }
}