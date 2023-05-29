public class Third {
    static class Node { // описание элемента
        public int value;
        public Node next;

        Node(int value, Node next) { // конструктор
            this.value = value;
            this.next = next;
        }
        public String toString() {
            return "Number{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }


    public static Node createHead(int n) {
        Node head = null;
        for (; n >= 1; n--) {
            head = new Node(n, head);
        }
        return head;
    }

    public static Node createTail(int n) {
        Node head = new Node(0, null);
        Node tail = head;
        for (int i = 1; i < n; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
        }
        return head;
    }

    public static Node AddFirst(Node head, Node newHead) {
        newHead.next = head;
        return newHead;
    }

    public static Node AddLast(Node head, Node newTail) {
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
        return head;
    }

    public static Node Insert(Node head, Node insrtElement, int index) {
        Node ref = head;
        int i = 1;
        while (i != index) {
            ref = ref.next;
            i++;
        }
        insrtElement.next = ref.next;
        ref.next = insrtElement;
        return head;
    }

    public static Node RemoveFirst(Node head) {
        head = head.next;
        return head;
    }

    public static Node RemoveLast(Node head) {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        return head;
    }

    public static Node Remove(Node head, int n) {
        Node ref = head;
        int i = 1;
        while (i != n) {
            ref = ref.next;
            i++;
        }
        ref.next = ref.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(0, null);
        Node node2 = new Node(1, null);
        Node node3 = new Node(2, null);
        node1.next = node2;
        node2.next = node3;
        System.out.println("node1");
        Node nodeOne = new Node(0, new Node(1, new Node(2, null)));
        System.out.println("nodeOne");
        Node head = createHead(3);
        System.out.println(head);
        head = createTail(3);
        System.out.println(head);
        head = AddFirst(head, new Node(-10, null));
        System.out.println(head);
        head = AddLast(head, new Node(5, null));
        System.out.println(head);
        head = Insert(head, new Node(-20, null), 3);
        System.out.println(head);
        head = RemoveFirst(head);
        System.out.println(head);
        head = RemoveLast(head);
        System.out.println(head);
        head = Remove(head, 2);
        System.out.println(head);
    }
}