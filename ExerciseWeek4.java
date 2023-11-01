import java.util.*;
class ExerciseWeek4{
	public static void main(String args[]){
		count();
		animalCollection();
		System.out.println(findColour());
		sortNumbers();
	}





//Problem1
	public static void count(){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++){
			if (arr[i]%2==0){
				System.out.println(arr[i]);
			}
		}
	}



//Problem 2
	public static void animalCollection(){
		//Declaring an arraylist
		ArrayList<String> arr1=new ArrayList<>();
		arr1.add("Cat");
		arr1.add("Elephant");
		arr1.add("Horse");
		arr1.add("Dog");
	
		/*for(int i=0;i<arr1.size();i++){
			System.out.println(arr1.get(i));
		}*/
		String showArray=arr1.toString();
		System.out.println(showArray);
		System.out.println(arr1.size());
	}


//Problem 3


	public static boolean findColour(){
		ArrayList<String> arr2=new ArrayList<>();
		arr2.add("Red");
		arr2.add("White");
		arr2.add("Blue");
		arr2.add("Green");
		return arr2.contains("Green");
		
	}



//Problem 4
	public static void sortNumbers(){
		ArrayList<Integer> arr3=new ArrayList<>();
		arr3.add(4);
		arr3.add(3);
		arr3.add(9);
		Collections.sort(arr3);
		String showArray=arr3.toString();
		System.out.println(showArray);
	}

//ExerciseWeek5 
//Problem 1
	
	public static 


}