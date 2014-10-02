class LinkListApp{
	public static void main (String[] args){
		Linklist list=new Linklist();
		list.tambahdepan(22);
		list.tambahdepan(33);
		list.tambahbelakang(44);
		list.tambahbelakang(99);
		list.displayList();
		Node hapus;
		hapus=list.hapusdepan();
		if(hapus!=null){
			System.out.println(hapus.data+" terhapus.");
		}
	}
}