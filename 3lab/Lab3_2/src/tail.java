class node { // описание элемента
    public int value;
    public node next;
    node(int value, node next) { // конструктор
        this.value = value;
        this.next = next;
    }}
public class tail{ // главный класс
    public static void main(String[] args) {
// добавление элементов с перемещением головы (наращивание с головы)
        node head=null; // начальное значение ссылки на голову
        for (int i =9; i>=0; i--) {
            head=new node(i, head);
        }
// вывод элементов на экран
        node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}