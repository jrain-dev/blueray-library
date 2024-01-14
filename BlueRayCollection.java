public class BlueRayCollection {
    private Node head;
    private int count;
    public int getCount() { return count; }

    public BlueRayCollection(){
        head = null;
        count = 0;
    }

    public void add(String t, String d, int y, double c){
        if (head == null){
            head = new Node(t, d, y, c);
        }
        else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node(t, d, y, c);
        }
        count++;
    }

    public void show_all(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void remove(int index){
        int i = 0;
        Node current = head;
        if(index >= count || count < 0){
            System.out.println("Invalid input");
        }
        else{
            if (index == 0){
                head = head.next;
                //head.next = null;
            }
            count--;
        }
    }
}
