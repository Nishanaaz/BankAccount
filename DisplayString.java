import java.lang.*;
class DisplayString{
	public static void main(String args[]){
			Reverse string=new Reverse("Nisha");
			System.out.println(string.run());
			
			Pallindrome string1=new Pallindrome("Jojo");
			System.out.println(string1.run());
	}
}


abstract class StringManipulation{
	private String name;
	StringManipulation(String name){
		this.name=name;
	}
	abstract String run();
	
	protected String getName(){
		return name;
		
	}
}

class Reverse extends StringManipulation{
	Reverse(String name){
		super(name);
	}
	String run(){
		String st="";
		for(int i=getName().length()-1;i>=0;i--){
			char c = getName().charAt(i) ;	
			st= st+c; 
		}
		return st ;
	}
}

class Pallindrome extends StringManipulation{
		Pallindrome(String name){
			super(name);
		}
		String run(){
			if (getName().equals(new StringBuilder(getName()).reverse().toString()))
				return getName()+" is a Pallindrome";
			else 
				return getName()+" is not a Pallindrome";
		}	
	}