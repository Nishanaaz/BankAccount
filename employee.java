class Employee{
	public static Employee1 addEmployee(String name, String address, int salary, String jobTitle){
		Employee1 emp;
		switch(jobTitle){
			case "Manager":
			emp=new Manager(name,address, salary, jobTitle);
			break;
			
			case "Developer":
			emp=new Developer(name,address, salary, jobTitle);
			break;
			
			case "Programmer":
			emp=new Programmer(name,address, salary, jobTitle);
			break;
			
			default:
			emp=Employee(name,address, salary, jobTitle);
			return emp;
		}
	}
	
	public static void main(String[] args){
		ArrayList<Employee1> emps=new ArrayList<Employee1>();
		emps.add(addEmployee("Rahul", "Chhatterpur New Delhi", 40000, "Manager"));
		emps.add(addEmployee("Rahul1", "Chhatterpur1 New Delhi", 40000, "Programmer"));
		emps.add(addEmployee("Rahul2", "Chhatterpur1 New Delhi", 40000, "Developer"));
	}
	for(int i=0;i<emps.size();i++){
		System.out.println((emps.get(i)).getDetails());
	}
}

class Employee1 {
    String name;
    String address;
    int salary;
    String jobTitle;

    int calculateBonus(int salary) {
        return salary * 10 / 100;
    }

    String performanceReports() {
        return "He is doing Good";
    }

    String managingProjects() {
        return "Working on Employees Sheet";
    }

    Employee1(String name, String address, int salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    String getDetails(String name, String address, int salary, String jobTitle) {
        return ("Name: " + name + ",from  Address: " + address + ", Salary: " + salary + "is working as a JobTitle: " + jobTitle);
    }

    /*public static void main(String[] args) {
        Employee1 Rahul = new Manager("Rahul", "Chhatterpur New Delhi", 40000, "Manager");
        System.out.println(Rahul.jobTitle);
        System.out.println(Rahul.performanceReports());
        Rahul.getDetails(Rahul.name, Rahul.address, Rahul.salary, Rahul.jobTitle);
	Rahul.performanceReports();
	Rahul.managingProjects();
    }*/
}

class Manager extends Employee1 {
    Manager(String name, String address, int salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    int calculateBonus(int salary) {
        return salary * 10 / 100;
    }
}

class Developer extends Employee1 {
    Developer(String name, String address, int salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    int calculateBonus(int salary) {
        return salary * 20 / 100;
    }
}

class Programmer extends Employee1 {
    Programmer(String name, String address, int salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    int calculateBonus(int salary) {
        return salary * 15 / 100;
    }
}
