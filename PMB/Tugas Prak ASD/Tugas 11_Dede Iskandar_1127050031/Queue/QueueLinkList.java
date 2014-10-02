class QueueLinkList
{
	private item front; // ref to first link on list
	private item rear; // ref to last link on list
	public QueueLinkList() // constructor
	{
		front = rear = null; // no items on list yet
	}
	public boolean isEmpty() // true if list is empty
	{
		return (front==null);
	}
	public void enqueue(int id)	//node baru selalu di top
	{ // make new link
		item newitem = new item(id);
		if (front == null)	// the first node created
		{
			front = rear = newitem; // first --> newLink
		}
		else	// the second node and the next node
		{
			rear.next = newitem;	//next dr top (awal) diarahkan ke node baru
			newitem.prev = rear;	//prev dr node baru diarahkan ke tail (awal)
			rear = newitem;		//top (baru) diarahkan ke node baru
			newitem.next = null;
		}
	}
	public item dequeue() // delete first item
	{ 	item temp = null;
		if (front == null)	// queue is empty
			System.out.println("Queue is empty");
		else if (front == rear)		// queue is only one data
		{
			temp = front;
			front = rear = null;
		}
		else	// queue has more than one data
		{
			temp = front; // save reference to link
			front = front.next; // delete it: first-->old next
			front.prev = null;
		}
		return temp;
	}
	public void display()
	{
		item current = front; // start from the first data
		if (current == null)
			System.out.println("The Queue is empty");
		else
			while(current != null) // until end of list,
			{
				current.displayLink(); // print data
				current = current.next; // move to next link
			}
		System.out.println("");
	}
} // end class LinkList
