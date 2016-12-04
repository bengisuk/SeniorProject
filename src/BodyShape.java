
public class BodyShape {
	public BodyShape armut;
	public Apple elma;
	public BodyShape dikdortgen;
	public BodyShape kumSaati;
	public BodyShape havuc;
	
	public double gogus;
	public double bel;
	public double kalca;
	
	
	public BodyShape(double gogus, double bel, double kalca) {
		this.gogus = gogus;
		this.bel=bel;
		this.kalca=kalca;		
	}
	 public boolean sayKumsaati(double gogus, double bel, double kalca) {

		if((bel / kalca >= 0.6 && bel / kalca <= 0.8) && (gogus / kalca <= 1.05 && gogus / kalca >= 0.95) ){
		 return true;
	   }
		else return false;

		}

	//--------------------------------------

	 public boolean sayDikdotgen(double gogus, double bel, double kalca) {
		
		if(( bel / kalca <= 1 && bel / kalca > 0.8) && (gogus / kalca <= 1.05 && gogus / kalca >= 0.95) ){
			 return true;
		   }
			else return false;

			}

	//--------------------------------------


	 public boolean sayElma(double gogus, double bel, double kalca) {
		
		
		if( bel / kalca > 1  && bel/gogus > 1){
			 return true;
		   }
			else return false;

			}

	//--------------------------------------

	 public boolean sayHavuc(double gogus, double bel, double kalca) {
		if( gogus / kalca > 1 && bel / kalca > 1){
			 return true;
		   }
			else return false;
	}

	//-----------------------------------------

	 public boolean sayArmut(double gogus, double bel, double kalca) {

		if(kalca / gogus > 1 &&  kalca / bel > 1){
			 return true;
		   }
			else return false;

			}
		
		


}
