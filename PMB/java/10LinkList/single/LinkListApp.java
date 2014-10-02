class LinkListApp{
	public static void main (String[]args){
		LinkList List = new LinkList();
		List.tambahDepan(22);
		List.tambahDepan(44);
		List.tambahBelakang(66);
		List.tambahBelakang(88);
		List.tampilList();
		Node hapus;
		hapus = List.hapusDepan();
		if(hapus!=null)
			System.out.println(hapus.data+" terhapus");
			List.tampilList();
	}//end main
}//end class LinkListApp