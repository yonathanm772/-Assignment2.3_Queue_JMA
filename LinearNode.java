/**
 *Represents a generic linear node
 *@author Jonathan Moreira Alsina
 *@version 10/6/2022
 */
public class LinearNode<T>{
	private T data;
	private LinearNode<T> nextNode;

	/**
	 *Default constructor with attributes representing a node 
	 */
	public LinearNode(){
		setNextNode(null);
		data=null;
	}
	
	/**
	 *Default constructor with attributes representing a node 
	 *@param T type data, next of the generic type of a linear node
	 *
	 */
	public LinearNode(T data, LinearNode<T> next){
		this.data=data;
		nextNode=next;
		
	}
	
	/**
	 *Sets an element inside a node
	 *@param data of T type
	 */
	public void setData(T data) {
		this.data=data;
	}
	
	/**
	 *Gets the element inside a node
	 *@return data of T type
	 */
	public T getData() {  
		return this.data;
	}
	
	/**
	 *Get a node
	 *@return a linear node of T type
	 */
	public LinearNode<T> getNode() {
	return this;
	}
	
	/**
	 *Changes an element inside a node
	 *@param newEntry of the generic type linear node
	 */
	public void setNextNode(LinearNode<T> newEntry){
		this.nextNode=newEntry;
	}
	
	/**
	 *Get the following node to the current one
	 *@return Linear node of T type
	 */
	public LinearNode<T> getNextNode() {
			return nextNode;
	}
	
	/**
	 *Allows us to print the element inside the node
	 *@return String 
	 */
	public String toString() {
		String str="";
		str=("[" + getData() + "]\n");
		return str;
				
	}
}
