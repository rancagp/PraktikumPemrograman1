package latpertemuan5;

public class StrukturList {
			Node HEAD;
	    
	
	    //fungsi menambahkan data AddHead List
	    public void addHead(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            newNode.setNext(HEAD);
	            HEAD = newNode;
	        }
	    }
	    
	    //fungsi menambahkan data di depan
	    public void addTail(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            Node curNode = HEAD;
	            Node posNode = null;
	            while (curNode != null) {
	                posNode = curNode;
	                curNode = curNode.getNext();
	            }
	            posNode.setNext(newNode);
	        }
	    }

	    //fungsi menambahkan data di tengah
	    public void addMiddle(int data, int pos) {
	        Node newNode = new Node(data);
	        Node curNode = HEAD;
	        if (isEmpty()) {
	            HEAD = newNode;
	        } else {
	            Node posNode = null;
	            if (pos == 1) {
	                newNode.setNext(HEAD);
	                HEAD = newNode;
	            } else {
	                int i = 1;
	                while (curNode != null && i < pos) {
	                    posNode = curNode;
	                    curNode = curNode.getNext();
	                    i++;
	                }
	                posNode.setNext(newNode);
	                newNode.setNext(curNode);
	            }
	        }
	    }

	    // menampilkan isi linked list
	    public void displayElement() {
	        Node curNode = HEAD;

	        while(curNode != null) {
	            System.out.print(curNode.getdata()+ " ");
	            curNode = curNode.getNext();
	        }
	   }
	    
	    //cek apakah linked list kosong
	    public boolean isEmpty() {
	        return HEAD == null;
	    }
	    
	    public void dispose(Node Node) {
	    	
	    }
	
	    //Fungsi removeHead
		public void removeHead() {
			if (isEmpty()) {
				System.out.println("list kosong");
			}else {
				Node temp = HEAD;
				HEAD = HEAD.getNext();
				dispose (temp);
			}
		}
		
		//fungsi removeTail
		public void removeTail() {
			Node preNode = null, lastNode;
			
		        if (HEAD.getNext() == null) {
		            HEAD = null;
		        } else {
		        	lastNode = HEAD;
		            while (lastNode.getNext() != null) {
		                preNode = lastNode;
		                lastNode = lastNode.getNext();
		            }
		            preNode.setNext(null);
		            dispose(lastNode);
		        }
		    }
		

		// Fungsi removemid
		public void removeMid(int a) {
			Node preNode = new Node(0);
			Node tempNode;
			int i;
			boolean ketemu;

			if (isEmpty()) {
				System.out.println("Elemen list kosong");
			} else {
				ketemu = false;
				i = 1;
				tempNode = HEAD;
				while (tempNode.getNext() != null && !ketemu) {
					if (tempNode.getdata() == a) {
						ketemu = true;
					} else {
						preNode = tempNode;
						tempNode = tempNode.getNext();
						i++;
					}
				}

				if (ketemu == true) {
					if (i == 1) {
						HEAD = null;
					} else {
						preNode.setNext(tempNode.getNext());
					}
				}
			}
		}
	}



