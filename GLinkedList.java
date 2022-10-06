/**
 * Generic linked list
 * @author Jonathan Moreira Alsina
 * @version 10/06/2022
 * 
 */
public class GLinkedList<T> {
	private LinearNode<T> head; //node to represent the head of the list
	private LinearNode<T> tail; //node to represent the tail (end) of the list
	private int length;//variable to keep track of the number of elements in the list

	/**
	 * Default constructor with properties of a linked list
	 */
	public GLinkedList(){
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 *Checks the size of the linked list
	 * @return int length
	 */ 
	public int size(){
		return length;
	} 
	
	/**
	 *Checks if the linked list is empty
	 *@return true if empty
	 */
	public boolean isEmpty(){
		if (head==null) { return true;}
		else return false;

	}//end isEmpty
	
	
	/**
	 * Gets the front node
	 * @return head node
	 */
	public LinearNode<T> getFront(){
		return head;
	}//end getList
	
	/**
	 *Adds a node to the linked list
	 *@param newEntry of the generic type linear node
	 */
	public void addNode(LinearNode<T> newEntry){
		if (isEmpty() ) {
			head = newEntry;
			tail=head;
			return;
		}
		tail.setNextNode(newEntry);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
	}//end addNode
	
	/**
	 *Removes an specific element of the linked list
	 *@return T type element inside a node
	 */
	public T remove( T targetElement) throws EmptyCollectionException, ElementNotFoundException{
		if(isEmpty()) 
			throw new EmptyCollectionException("LinkedList");

		boolean found= false;
		LinearNode<T> previous=null;
		LinearNode<T> current= head;
	
		while( current !=null && !found){
			if(targetElement.equals(current.getData()))
				found=true;
			else{
				previous=current;
				current= current.getNextNode();
			}
			
			if(!found)
				throw new ElementNotFoundException("LinkedList");
			
			if(size()==1)
				head=tail=null;
			else if(current.equals(head))
				head=current.getNextNode();
				else if(current.equals(tail)){
					tail=previous;
					tail.setNextNode(null);
				}
					else
						previous.setNextNode(current.getNextNode());
			
			length--;
			
			
		}
		return current.getData();
	}
	
	/**
	 * Removes the first item of the linked list
	 * @return data inside head
	 */
	public T remove() {
		T front= getFront().getData();
		head.setData(null);
		head=head.getNextNode();
		
		if (head == null)
		      tail = null;
		
		length--;
		return front;
		

	}
	
	/**
	 * Clears the linked list 
	 */
	public void clear() {
		head=null;
		length=0;
		
	}
	
	/**
	 * Allows to print a node
	 * @return data inside head
	 */
	public String toString()
	{
	    if (head == null)
	    {
	        return "[]";
	    }
	    else
	    {
	        String result = "[" + head.getData();
	        LinearNode<T> current = head.getNextNode();
	        while (current != null)
	        {
	            result += ", " +current.getData() ;
	            current = current.getNextNode();
	        }
	        result += "]";
	        return result;
	    }
	}
}