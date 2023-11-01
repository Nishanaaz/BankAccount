import java.util.Arrays;

class ScooterFactory{
	public static void main(String args[]){
		SuperSplendor s=new SuperSplendor("HERO");
		System.out.println(s.getname());
		//System.out.println(Arrays.toString(s.getEngineDetails()));
		s.toString(s.getEngineDetails());


		String[] scooters={"SuperSplendor","Activa"};
		ArrayList<Scooter>builtscooters=new 
	}



	//Trying to make a scooterFactory so that it can have multiple elements and we don't to change;
	public static Scooter builtScooters(String scooterType){
		switch(scooterType){
			case "SuperSplendor": return new SuperSplendor("Hero");
			case "Activa": return new Activa("Activa");
			default:return new Activa("Activa");
			}
	}

}

abstract class Scooter{
	abstract String getname();
	abstract String[] getEngineDetails();
	void toString(String[] ed){
		for(int i=0;i<ed.length;i++){
			System.out.println(ed[i]);
		}
	}
}

class SuperSplendor extends Scooter{
	String name;
	SuperSplendor(String name){
		this.name=name;
	}
	String getname(){
		return name;
	}
	String[] getEngineDetails(){
		String[] ed = {"Year:2022","Make: Hero"};
		return ed;
		//return toString(ed);
	}
}

class Activa extends Scooter{
	String name;
	Activa(String name){
		this.name=name;
	}
	String getname(){
		return name;
	}
	String[] getEngineDetails(){
		String[] ed={"Year:2018","Make: Honda"};
		return ed;
	}
}