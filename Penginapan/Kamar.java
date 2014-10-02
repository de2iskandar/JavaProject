class Kamar{
	private String [][] dataKamar={
		{"1101","Suite Room Single","120000","4","0.1"},
		{"1201","Royal Suite Room Single","289000","5","0.15"},
		{"2101","Suite Room Double","220000","4","0.1"},
		{"2201","Royal Suite Room Double","450000","3","0.1"},
		{"3101","President Suite Room","690000","2","0.05"}
	};

	public String getKamar(String noKamar, int kode){
		int indexSatu =-1;
		for (int i=0,i<dataKamar.length,i++){
			if(noKamar.equals(dataKamar[i][0]))
				indexSatu=i;
				break;
			}
		return dataKamar[indexSatu][kode];
	}
}
