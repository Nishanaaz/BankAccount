//1)Create a class name with firstName and LastName as properties;
//Override toString method to display full name,which is a combination of first name and last name
// create another class with main method which will create a name Object and then invoke to print the name;

/*2) Create a factorial class which will accept 2 parameters start number and count 
Create run method which will return result array
Create another class with main method which will create a factorial Object and then invoke run to print the name.
Example-> 2 and 3 input output:-[2,6,24]
class Factorial{
Factorial f=new Factorial(2,3)*/

/*3) Create a calculator which will calculate min and max of an input array.
Create another class with main method which will create a calculato object and then invoke calculate method to
print min and max numbers in the array.*/



//Problem 1---
class FirstNameLastName{
	public static void main(String args[]){
		FullName example=new FullName("Nisha","Khatoon");
		System.out.println(example.toString());
		

		int[] arr={4,1,2,3,4,5};
		calculateMinMax example1=new calculateMinMax();
		System.out.println(example1.findMin(arr));
		System.out.println(example1.findMax(arr));
			
		//calculateMinMax example2=new calculateMinMax({3,4,6,8);
		//System.out.println(example2.findMax());

		calculateFactorial facArray=new calculateFactorial(1,3);
		facArray.factorialArray();
		//System.out.println(facArray.factorialArray());
	}	
}

class FullName{

	String firstName;
	String lastName;


	//Constructor:---
	public FullName(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public String toString(){
		return  ("My Name is "+firstName+" "+lastName);
	}
}


//Problem 3---

class calculateMinMax{
	//int array[];
	//public calculateMinMax(int[] arr){
		//this.array=arr;
	//}
	
	public int findMin(int[] array){
		int Min=array[0];
		for (int i=0;i<array.length;i++){
			if (Min>array[i]){
				Min=array[i];
				
			}
		}
		return Min;
	}
	public int findMax(int[] array){
		int Max=array[0];
		for (int i=0;i<array.length;i++){
			if (Max<array[i]){
				Max=array[i];
				
			}
		}
		return Max;
	}
}

//Problem 3

class calculateFactorial{
	int number;
	int count;
	public calculateFactorial(int number,int count){
		this.number=number;
		this.count=count;
	}


	//Function to calculate factorial
	public void factorialArray(){
		int[] array=new int[count];
		for(int i=0;i<count;i++){
			
			int num=1;
			for (int j=1;j<=number;j++){
				num*=j;
			}
			array[i]=num;
			number=number+1;
		}toString(array);
	}


		
	//Function to show the array
	public void toString(int[] arr){
		String arr1="";
		for (int i=0;i<arr.length;i++){
			arr1+=arr[i]+" ";
			}
			System.out.println(arr1);
			//return arr1;
		}
}
