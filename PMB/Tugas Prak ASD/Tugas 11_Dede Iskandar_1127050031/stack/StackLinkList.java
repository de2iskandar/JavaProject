class StackLinkList
{
	private item top; // ref to first link on list
	private item bottom; // ref to last link on list
	public StackLinkList() // constructor
	{
		top = bottom = null; // no items on list yet
	}
	public boolean isEmpty() // true if list is empty
	{
		return (top==null);
	}
	public void push(int id)	//node baru selalu di top
	{ // make new link	
		item newitem = new item(id);
		if (top == null)	// the first node created
		{
			top = bottom = newitem; // first –> newLink
		}
		else	// the second node and the next node
		{
			top.next = newitem;	//next dr top (awal) diarahkan ke node baru
			newitem.prev = top;	//prev dr node baru diarahkan ke tail (awal)
			top = newitem;	 //top (baru) diarahkan ke node baru
		}
	}
	public item pop() // delete first item
	{ 
		item temp = null;
		if (top == null)	// stack is empty
		System.out.println("Stack is empty");
		else if (top == bottom)	 // stack is only one data
		{
			temp = top;
			top = bottom = null;
		}
		else	// stack has more than one data
		{
			temp = top; // save reference to link
			top = top.prev; // delete it: first–>old next
			top.next = null;
		}
		return temp;
	}
	public void display()
	{
		item current = bottom; // start from the first data
		while(current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
} // end class LinkList