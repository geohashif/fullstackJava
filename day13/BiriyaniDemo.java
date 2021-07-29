package hit.day13;

public class BiriyaniDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vessel vessel = new Vessel();
		Stove stove = new Stove();
		Utensils utensils = new Utensils();
		
		Biriyani.setup(stove,vessel,utensils);
		
		Rice basmathiRice = new Rice();
		Water bisleri = new Water();
		Mutton sheep = new Mutton();
		Ingredients bigBasket = new Ingredients();
		Biriyani myBiriyani = new Biriyani(basmathiRice,bisleri,sheep,bigBasket);
		myBiriyani.makeBiriyani();
		System.out.println("...........");
		
		Rice sambaRice = new Rice();
		Water aquafina = new Water();
		Mutton chicken = new Mutton();
		Ingredients grocery = new Ingredients();
		Biriyani mySisterBiriyani = new Biriyani(sambaRice,aquafina,chicken,grocery);
		mySisterBiriyani.makeBiriyani();
		
	}
}

	class Stove{}
	class Vessel{}
	class Utensils{}
	class Rice{}
	class Mutton{}
	class Water{}
	class Ingredients{}
	class Biriyani{
		//infrastructural requirements
		static Stove stove;
		static Vessel vessel;
		static Utensils untensils;
		
		public static void setup(Stove stove,Vessel vessel,Utensils utensils) {
			Biriyani.stove=stove;
			Biriyani.vessel=vessel;
			Biriyani.untensils=utensils;
		}
		//instance variables
		Rice rice;
		Water water;
		Mutton mutton;
		Ingredients ingredients;
		public Biriyani(Rice rice,Water water,Mutton mutton,Ingredients ingredients) {
			this.rice=rice;
			this.water=water;
			this.mutton=mutton;
			this.ingredients=ingredients;
		}
		
		public void makeBiriyani() {
			System.out.println("I use....:"+Biriyani.stove);
			System.out.println("I use....:"+Biriyani.untensils);
			System.out.println("I use....:"+Biriyani.vessel);
			
			System.out.println("The Biriyani is made up of ..."+rice+":"+mutton+":"+water+":"+ingredients);
			
			System.out.println("Biriyani ready..........");
		}
	}
