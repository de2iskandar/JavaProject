class item	//atau node/simpul
{
	public int data; // data item
	public item next; // next node link in list
	public item prev; // previous node link in list
	public item(int id) // constructor
	{
		data = id; // initialize data
	} // set to null)

	public void displayLink() // display ourself
	{
		System.out.print("{" + data + "} ");
	}
} // end class Link
