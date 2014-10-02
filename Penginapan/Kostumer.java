class Kostumer{
	private String [][] dataKostumer ={
		{"44001","Agis Kiswari","08524513412"},
		{"44002","Deni Anton","08851324314"},
		{"44003","Amel Hasanah","08991234124"},
		{"44004","Andri Yanto","08785128656"}
	};

	public String getKostumer(String idKostumer, int kode){
		int indexSatu =-1;
		for (int i=0,i<dataKostumer.length,i++){
			if(idKostumer.equals(dataKostumer[i][0]))
				indexSatu=i;
				break;
			}
		return dataKostumer[indexSatu][kode];
	}

	public String getNama(){
		return getKostumer(idKostumer, 1);
	}

	public String getNoTelp(){
		return getKostumer(idKostumer,2);
	}
}