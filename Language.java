class Language{
	String name;
 	int numSpeaker;
	String regionSpoken;
	String wordOrder;
	Language(String name,int numSpeaker,String regionSpoken,String wordOrder){
		this.name=name;
		this.numSpeaker=numSpeaker;
		this.regionSpoken=regionSpoken;
		this.wordOrder=wordOrder;
	}
	public static void main(String args[]){
		Language spanish = new Language("Spanish", 55500000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");

		System.out.println(spanish.showResult());	
	}
	public String showResult(){
		return name+"is spoken by"+numSpeaker+"people mainly in"+regionSpoken+". The language follows the word order: "+wordOrder+".";
	}
}

/*class Spanish extends Language{
	String getInfo(){
		return toString();
	}
	String toString(){
		
	}
}*/
 