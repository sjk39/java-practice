public class SubAtomicParticles{
	
	public class Quark{
		public int charge;
		public int spin;
		public int realOrAntiparticle;
		
		//Sets constructor
		public Quark(int charge, int spin, int realorAntiparticle)
		{
		this.charge = charge;
		this.spin = spin;
		this.realOrAntiparticle = realorAntiparticle;
		}
		
		public Quark(){}
		
		public int getCharge() {
		return charge;
		}
		
		public void setCharge(int newValue){
		charge = newValue;	
		}
		
		public int getSpin() {
		return spin;
		}
		
		public void setSpin(int newValue){
		spin = newValue;
		}
		
		public int getRealorAntiparticle() {
		return realOrAntiparticle;
		}
		
		public void setRealorAntiparticle(int newValue){
		realOrAntiparticle = newValue;
		}
		
		
	}	
	
	
	//Inheriting Class
	public class upQuark extends Quark {
		public int colour;
		
		public upQuark(int colour, int charge, int spin, int realorAntiparticle) {
		super(charge, spin, realorAntiparticle);
		this.colour = colour;
		}	
		
		public void setColour(int newValue){
		colour = newValue;
		}
		
		public int getColour() {
		return colour;
		}
	}
	
	
	public static void main(String[] args) {
		
		try{	
		//Quark u = new Quark(2,2,2);
		
			Quark u = new SubAtomicParticles().new Quark();
			u.setCharge(1);
			int i = u.getCharge();
			System.out.println(i);

			upQuark p = new SubAtomicParticles().new upQuark(2,2,2,2);
			int j = p.getColour();
			System.out.println(j);
			}
		catch(Exception e)
		{
			System.out.println("Uh oh");	
		}
	}

}