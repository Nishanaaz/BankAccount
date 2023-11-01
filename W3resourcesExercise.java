import java.lang.Math;
import java.util.ArrayList;
/* Question 1. 
Write a Java program to create a class called "Person" with a name and age attribute. 
Create two instances of the "Person" class, set their attributes using the constructor, 
and print their name and age.*/

class W3resourcesExercise{
	public static void main(String args[]){
		/*Person Girl=new Person("Nisha",24);
		Girl.display();

		Dog dog1=new Dog("Bruzo","Pitbull");
		dog1.display();
		dog1.setName("Niami");
		dog1.setBreed("Libra");
		dog1.display();

		Rectangle r1=new Rectangle(2,4);
		System.out.println("Area of a rectangle is: "+r1.calculateArea());
		System.out.println("Perimter of a rectangle is: "+r1.calculatePerimeter());

		Circle c1=new Circle(2.5);
		System.out.println("Area of a rectangle is: "+c1.calculateArea());
		System.out.println("Perimter of a rectangle is: "+c1.calculatePerimeter());
		*/

		//Book Collection:
		Book book1=new Book("13 reasons why?","James Bond",12345);
		Book book2=new Book("Half Girl Friend","William Secspear",232342);
		Book.addBook(book1);
		Book.addBook(book2);
		//System.out.println(Book.bookCollection);
		for (Book i:Book.bookCollection) {
    			System.out.println(i.title+ " by " + i.author + " ISBN: " + i.ISBN);
		}
		Book.removeBook(book1);
		//System.out.println(Book.bookCollection);
	}
}


class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display(){
		System.out.println("My name is "+name+" "+". I am "+ age+" years old .");
	}

}



/*Question 2.
2. Write a Java program to create a class called "Dog" with a name and breed attribute. 
Create two instances of the "Dog" class, set their attributes using the constructor and
 modify the attributes using the setter methods and print the updated values.*/

class Dog{
	String name;
	String breed;
	Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	
	/*String getName(){
		return this.name;
	}

	String getBreed(){
		return this.breed;
	}*/
	
	void setName(String name)
	{
		this.name=name;
	}

	void setBreed(String breed)
	{
		this.breed=breed;
	}
	
	void display(){
		System.out.println("My dog name is "+name+" "+". His breed is "+ breed);
	}
}


//Question 3. 
///Write a Java program to create a class called "Rectangle" with width and height attributes. 
//Calculate the area and perimeter of the rectangle.

class Rectangle{
	int height;
	int width;
	
	Rectangle(int height,int width){
		this.height=height;
		this.width=width;
	}
	
	int calculateArea(){
		return height*width;
	}

	int calculatePerimeter(){
		return 2*(height+width);
	}
}



//Question 4. 
/*Write a Java program to create a class called "Circle" with a radius attribute. 
You can access and modify this attribute. Calculate the area and circumference of the circle.*/

class Circle{
	double radius;
	Circle (double radius){
		this.radius=radius;
	}
	
	double calculateArea(){
		return Math.PI*radius*radius;
	}

	double calculatePerimeter(){
		return 2*Math.PI*radius;
	}
}


//Question 5.
/*Write a Java program to create a class called "Book" with attributes for title, author, 
and ISBN, and methods to add and remove books from a collection.*/

class Book{
	String title;
	String author;
	int ISBN;
	static ArrayList<Book>bookCollection=new ArrayList<Book>();
	Book(String title,String author,int ISBN){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}

	static void removeBook(Book book){
		bookCollection.remove(book);
	}
	
	static void addBook(Book book){
		bookCollection.add(book);
	}
}


