class Linklist
{
	private Node head, tail;
	public Linklist()
	{
		head=null;
	}
	
	public void tambahdepan(int d)
	{
		Node baru=new Node(d);
		if(head==null)
		{
			head=baru;
			tail=baru;
		}
		else
		{
			baru.next=head;
			head=baru;
		}
	}
	
	public void tambahbelakang(int d)
	{
		Node baru=new Node(d);
		if(head==null)
		{
			head=baru;
			tail=baru;
		}
		else
		{
			tail.next=baru;
			tail=baru;
		}
	}
	
	public Node hapusdepan()
	{
		if(head!=null)
		{
			Node temp=head;
			head=head.next;
			temp.next=null;
			return temp;
		}
		else
		{
			System.out.println("List kosong");
			return null;
		}
	}
	
	public void displayList()
	{
		if(head!=null)
		{
			Node bantu=head;
			while(bantu!=null)
			{
				System.out.print(bantu.data+" ");
				bantu=bantu.next;
			}
			System.out.println("");
		}
		else
		{
			System.out.println("List kosong");
		}
	}
}
			