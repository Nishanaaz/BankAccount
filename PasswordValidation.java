import java.util.regex.*;

class PasswordValidation{
	public static void main(String[] args){
		EasyCheck str1=new EasyCheck("Hell2");
		System.out.println(str1.check());
		
		MediumCheck str2=new MediumCheck("Helloew");
		System.out.println(str2.check());
		
		StrongCheck str3=new StrongCheck("Helloew45@");
		System.out.println(str3.check());
	}
}

abstract class PasswordCheck{
	private String str;
	PasswordCheck(String str){
		this.str=str;
	}
	
	protected String getStr(){
		return str;
	}
	abstract boolean check();


	boolean isDigit(){
		char[] str = getStr().toCharArray();
		for(char i:str){
			if (Character.isDigit(i))   return true;

		}
		return false;
	}  
	

	boolean isCharacter(){
		boolean atleastOneAlpha = getStr().matches(".*[a-zA-Z]+.*");
		return atleastOneAlpha;
	}	
	
	boolean isLength8(){
		if((getStr().length())>=8)return true;
		else return false;
	}
	
	boolean isSpecial(){
		Pattern spe=Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		Matcher atleast= spe.matcher(getStr());

		boolean atleastOneAlpha=atleast.find();
			return atleastOneAlpha;
	}	
}


class EasyCheck extends PasswordCheck{
	EasyCheck(String str){
		super(str);
	}


	boolean check(){
		if (isDigit() && isCharacter())	return true;
		else 	return false;
	}

}


class MediumCheck extends PasswordCheck{
	MediumCheck(String str){
		super(str);
	}


	boolean check(){
		//System.out.println(isLength8());
		if (isLength8() && isDigit() && isCharacter()) return true;
		else return false;	
	}
	
}


class StrongCheck extends PasswordCheck{
	StrongCheck(String str){
		super(str);
	}
	
	boolean check(){
		if (isSpecial() && isLength8() && isDigit() && isCharacter()) return true;
		else return false;
	}
	
	
}