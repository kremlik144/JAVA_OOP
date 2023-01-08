/* 
    + 1.	Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
    boolean isGood (T item). Смысл этого интерфейса: ему дают элемент, он его
    одобряет или не одобряет.
    Создайте следующие детские классы:
    • IsEven — ему дают целое число, он одобряет его, если оно чётное
    • IsPositive — ему дают целое число, он одобряет его, если оно положительное
    • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
    • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет,
    что она начинается с того, что он запомнил
    
    - 2.	Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
    Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
    Продемонстрируйте, что это работает.
*/

public class Main {
    public static void main(String[] args) {
        // Раскомментировать строки парами по 3, для проверки функционала 

        // IsEvenIsGood task1 = new IsEvenIsGood();
        // System.out.println(task1.isGood(10));
        // System.out.println(task1.isGood(9));

        // IsPositiveIsGood task2 = new IsPositiveIsGood();
        // System.out.println(task2.isGood(-1));
        // System.out.println(task2.isGood(1));

        // BeginsWithAIsGood task3 = new BeginsWithAIsGood();
        // System.out.println(task3.isGood("Aaaaa"));
        // System.out.println(task3.isGood("asdf"));

        // BeginsWithIsGood task4 = new BeginsWithIsGood("Big Money");
        // System.out.println(task4.isGood("Big Money, Big Problems"));
        // System.out.println(task4.isGood("Big Problems - Big Money"));

    }
    
}
