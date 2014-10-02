public class qurbanOOP {
	float berat, jml, qurban, mustahiq, temp; //atribut
	//method beratDaging
	public void beratDaging(float berat) {
		this.berat = berat;
	}
	//method jmlMustahiq
	public void jmlMustahiq(float jml) {
		this.jml = jml;
	}
	//method pengqurban
	public float pengqurban(){
		qurban = berat / 3;
		return qurban;
	}
	//method mustahiq
	public float mustahiq(){
		mustahiq = (berat*2)/jml;
		return mustahiq;
	}
}	