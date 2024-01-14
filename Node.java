public class Node {

    BlueRayDisk data;
    Node next;
    public Node(String t, String d, int y, double c) {
        this.data = new BlueRayDisk(t,d,y,c);
        next = null;
    }
}
