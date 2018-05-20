package dl.datastructures.singlelinkedlist;

public class SLLOperations {
	
	public SLLNode addNode(SLLNode head, SLLNode nodeToAdd) {
		SLLNode tempNode = head;
		
		if(tempNode == null)
			return nodeToAdd;
	
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		
		tempNode.next = nodeToAdd;
		return head;
	}
	
	public SLLNode addNodeAtPosition(SLLNode head, SLLNode nodeToAdd, int position) {
		
		SLLNode tempNode = head;
		if(position == 1 && head == null) {
			return nodeToAdd;
		}
		
		for(int i=1; i<position-1 ; i++) {
			tempNode = tempNode.next;
		}
		
		nodeToAdd.next = tempNode.next;
		tempNode.next = nodeToAdd;
		return head;
	}
	
	public SLLNode getNode(SLLNode head,int position) {
		return null;
	}
	
	public SLLNode deleteNode(SLLNode head,int position) {
		return null;
	}
	
	public void printList(SLLNode head) {
		
		while(head != null) {
			System.out.print(head.toString());
			 head = head.next;
		}
		System.out.println();
	}
	
	public int size(SLLNode head) {
		int size = 0;
		while(head != null) {
			size++;
			head = head.next;
		}
		return size;
	}

}