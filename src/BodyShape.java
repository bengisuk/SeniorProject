
public class BodyShape {
	public BodyShape armut;
	public Apple elma;
	public BodyShape dikdortgen;
	public BodyShape kumSaati;
	public BodyShape havuc;
	
	public float gogus;
	public float bel;
	public float kalca;
	
	
	public BodyShape(float gogus, float bel, float kalca) {
		this.gogus = gogus;
		this.bel=bel;
		this.kalca=kalca;		
	}
		public String sayDikdortgen(float gogus, float bel, float kalca) {
		if((bel / kalca > 0.8 && bel / kalca <= 1) && (gogus / kalca <= 1.05 && gogus / kalca >= 0.95) ){
			System.out.println("dikdörtgensin");
		  }
		 return "you are dikdortgen";
		}
		
		public boolean sayElma(float gogus, float bel, float kalca) {
			if( bel / kalca > 1  && bel/gogus > 1){
			System.out.println("elmasın");
				return true;
			  }
				return false;
			}
		


}
