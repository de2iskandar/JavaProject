class LinkList{
	private Node head, tail;
	//----------------------------------------------
	public LinkList(){	//konstruktor
		head = null;	//inisialisasi
	}
	//----------------------------------------------
	public void tambahDepan(int d){	//tambah Kiri
		Node nodeBaru = new Node(d);
		if (head==null){
			head = nodeBaru;
			tail = nodeBaru;
		}
		else{
			nodeBaru.next = head;
			head = nodeBaru;
		}
	}
	//--------------------------------------------
	public void tambahBelakang(int d){	//tambah Kanan
		Node nodeBaru = new Node(d);
		if(head==null){
			head = nodeBaru;
			tail = nodeBaru;
		}
		else{
			tail.next = nodeBaru;
			tail = nodeBaru;
		}
	}
	//--------------------------------------------
	public Node hapusDepan(){	//hapus kiri
		if (head!=null){
			Node temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
		else{
			System.out.println("List Kosong");
			return null;
		}
	}
	//--------------------------------------------
	public Node hapusBelakang(){
		if(head!=null){
			Node bantu, temp;
			if(head.next==null){
				temp = head;
				head = tail = null;
			}
			else{
				bantu = head;
				while(bantu.next!=tail){
					bantu = bantu.next;
				}
				temp = tail;
				tail = bantu;
				tail.next = null;
			}
			return temp;
		}
		else{
			System.out.println("List Kosong");
			return null;
		}
	}
	//--------------------------------------------
	public void tampilList(){
		if(head!=null){
			Node bantu = head;
			System.out.println("Data Dalam List = ");
			while(bantu!=null){
				System.out.print(bantu.data + " ");
				bantu = bantu.next;
			}
			System.out.println();
		}
		else{
			System.out.println("List Kosong");
		}
	}
}//end class LinkList