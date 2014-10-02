class StackLinkListApp
{
	public static void main(String[] args)
	{
		System.out.println(" ");
		System.out.println("Nama	: Dede Iskandar");
		System.out.println("NIM		: 1127050031");
		System.out.println(" ");
		
		StackLinkList theStack = new StackLinkList(); // make new list
		System.out.println("Initializing Stack…");
		theStack.push(22); // insert four items
		theStack.push(44);
		theStack.push(66);
		theStack.push(88);
		System.out.println("Display Forward :");
		theStack.display(); // display list
		System.out.println("Delete Stack from Top…");
		while( !theStack.isEmpty() ) // until it’s empty,
		{
			item aLink = theStack.pop(); // delete link
			System.out.print("Deleted "); // display it
			aLink.displayLink();
			System.out.println("");
		}
		theStack.display(); // display list
	} // end main()
}