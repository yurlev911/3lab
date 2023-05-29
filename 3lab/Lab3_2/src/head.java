class Node { // описание элемента
    public int value;
    public node next;
    Node(int value, node next) { // конструктор
        this.value = value;
        this.next = next;
    }}
public class head { // главный класс
    public static void main(String[] args) {
// создание 1-го узла, который изначально является и головой, и хвостом списка
        node head=new node(0, null);
        node tail=head;
// добавление элементов с наращиванием хвоста
        for (int i = 0; i <9; i++) {
            tail.next=new node(i+1, null);
            tail=tail.next; // указатель на созданный элемент запоминается
        } // как указатель на новый хвост
// вывод элементов на экран
        node ref = head; // ref – рабочая переменная для текущего узла
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }}