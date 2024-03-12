package latpertemuan5;

public class Node {
	 private int data;
	    private Node next;

	    public Node(int data) {
	        this.data = data;
	    }

	    // Setter dan Getter
	    public void setNext(Node next) {
	        this.next = next;
	    }

	    public int getdata() {
	        return data;
	    }

	    public Node getNext() {
	        return next;
	    }
}