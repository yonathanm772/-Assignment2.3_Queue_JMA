/**
 * Implements a queue using a linked list
 * @author Jonathan Moreira Alsina
 * @version 10/6/2022
 * @
 */
public class Queue<T> implements QueueInterface<T> {
	
	private GLinkedList<T> queue;
	
	/**
	 * Instantiates a queue as a generic linked list.
	 */
	public Queue() {
		queue= new GLinkedList<T>();
	}
	
	/**
	 * Puts an item in the queue
	 * @param a new entry of T type
	 */
	public void enqueue( T newEntry) 
	{
		LinearNode<T> tempNode= new LinearNode<T>( newEntry, null);
		// TODO Auto-generated method stub
		queue.addNode(tempNode);
	}

	/**
	 * Removes an item from the queue
	 * @return T type item removed from the queue
	 */
	public T dequeue() {
		// TODO Auto-generated method stub
		return queue.remove();
	}

	/**
	 *Gets the item in the front of the queue
	 * @return Return the item of T type in the front of the queue
	 */
	public T getFront() {
		LinearNode<T> tempNode= queue.getFront();
		// TODO Auto-generated method stub
		return tempNode.getData();
	}

	/**
	 * Checks to see if the queue is empty
	 * @return true if empty
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return queue.isEmpty();
	}
	
	/**
	 * Clears the queue of any items in it
	 */
	@Override
	public void clear() {
		queue.clear();
	}
	
	/**
	 * Prints each item in the queue
	 */
	public void printQ (){
		LinearNode<T> tempNode= queue.getFront();
		
		if(queue.isEmpty())
			System.out.println(" The queue is empty.");
		
		else {
			System.out.println("Elements on the queue: ");
			System.out.println();
				for( int count=0; count< queue.size()+1;count++)
				{
					
					//while(tempNode.getData() != null)
					{
						if(tempNode.getData() == null) {
						
						}
						else
							System.out.print(tempNode.getData()+"\n-----------------\n ");
							tempNode = tempNode.getNextNode();
							
					}//while(tempNode.getNextNode()!= null);
			
							
				}
			System.out.println();
			}
				
	}
			
	
    
}
