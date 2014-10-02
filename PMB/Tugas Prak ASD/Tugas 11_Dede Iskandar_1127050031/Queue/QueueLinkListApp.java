class QueueLinkListApp
{
	public static void main(String[] args)
	{
		System.out.println(" ");
		System.out.println("Nama	: Dede Iskandar");
		System.out.println(" NIM	: 1127050031 ");
		System.out.println(" ");
		
		QueueLinkList theQueue = new QueueLinkList(); // make new list
		System.out.println("Inserting queue's items...");
		theQueue.enqueue(22); // insert four items
		theQueue.display(); // display list
		theQueue.enqueue(44);
		theQueue.display(); // display list
		theQueue.enqueue(66);
		theQueue.display(); // display list
		theQueue.enqueue(88);
		theQueue.display(); // display list
		System.out.println("Display Queue :");	
		theQueue.display(); // display list
		System.out.println("Delete Queue from Front...");	
		while( !theQueue.isEmpty() ) // until it's empty,
		{
			item aLink = theQueue.dequeue(); // delete link
			System.out.println("Deleted "); // display it
			aLink.displayLink();
			System.out.println("");
			theQueue.display(); // display list
			System.out.println("");
		}
	} // end main()
} // end class LinkListApp
