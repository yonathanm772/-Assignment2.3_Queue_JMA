
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> myQ = new Queue<String>();
		
		System.out.println("A costumer has arrived");
		myQ.enqueue(" Bill");
		myQ.printQ();
		
		System.out.println("A costumer has arrived");
		myQ.enqueue("Alice");
		myQ.printQ();
		
		System.out.println("A costumer has arrived");
		myQ.enqueue(" Bob");
		myQ.printQ();
	
		System.out.println("A costumer has been served");
		myQ.dequeue();
		myQ.printQ();
		
		System.out.println("A costumer has arrived");
		myQ.enqueue(" Jane");
		myQ.printQ();
		
		System.out.println("A costumer has arrived");
		myQ.enqueue(" Hamad");
		myQ.printQ();
		
		System.out.println("A costumer has been served");
		myQ.dequeue();
		myQ.printQ();
		
		System.out.println("A costumer has been served");
		myQ.dequeue();
		myQ.printQ();
		
		System.out.println("A costumer has arrived");
		myQ.enqueue(" Jim");
		myQ.printQ();
		
		System.out.println("A costumer has been served");
		myQ.dequeue();
		myQ.printQ();
		
		System.out.println("A costumer has been served");
		myQ.dequeue();
		myQ.printQ();
		
	}

}