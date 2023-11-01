import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Random;


class Bank{
	public static void main(String[] args) throws ParseException{
		Account ca=new CurrentAccount("C12323",1000,25000);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Customer c1=new Customer("Nisha",sdf.parse("15-10-2023"),"A2432",ca);

		Account sa=new SavingsAccount("C23424",500,4.5f);
		Customer c2=new Customer("Ankit",sdf.parse("27-08-2003"),"A2443",sa);
		sa.deposite(5000);
		sa.printTransaction();
		//System.out.println("Balance of Savings account: "+sa.getBalance());
		sa.withdraw(3000);
		sa.printTransaction();
		SavingsAccount ssa=(SavingsAccount) sa;   //TypeCasting
		//System.out.println("Balance of Savings account: "+ssa.getBalance());
		double closingBalance=ssa.getBalance()+ssa.endOfDayInterest();
		System.out.println("Closing Balance: "+closingBalance);      
		
	}	
}

class Customer{
	private String name;
	private Date dob;
	private String aadharNumber;
	private Account account;
		
	Customer(String name,Date dob,String aadharNumber,Account account){
		this.name=name;
		this.dob=dob;
		this.aadharNumber=aadharNumber;
		this.account=account;
	}
}


abstract class Account{
	private String accountNumber;
	private double balance;
	private ArrayList<Transaction>transactions;

	Account(String accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.transactions=new ArrayList<Transaction>();
		
	}
	
	protected double getBalance(){
		return balance;
	}
	
	protected void setBalance(double balance){
		this.balance=balance;
	}
	
	protected boolean deposite(double amount){
		balance+=amount;
		Transaction t=createTransaction(Transaction.CREDIT,amount);
		return true;
	}

	protected boolean withdraw(double amount){
		if (amount<=balance){
		balance-=amount;
		Transaction t=createTransaction(Transaction.DEBIT,amount);
		return true;
		}else return false;
	}

	Transaction createTransaction(String type,double amount){
		Transaction t=new Transaction(type,amount);
		transactions.add(t);
		return t;
	}


	protected void printTransaction(){
		for(int i=0;i<transactions.size();i++){
			System.out.println(transactions.get(i));
		}System.out.println("Balance: "+balance);
	}
}

class CurrentAccount extends Account{
	private long overdraftLimit;
	

	CurrentAccount(String accountNumber,double balance,long overdraftLimit){
		super(accountNumber,balance);
		this.overdraftLimit=overdraftLimit;
	}

	//@override
	protected boolean deposite(double amount){
		return false;
	}


	//@override
	protected boolean withdraw(double amount){
		
		if (amount<=(getBalance()+overdraftLimit)){
			setBalance(getBalance()-amount);
			Transaction t=createTransaction(Transaction.DEBIT,amount);
			return true;
		}else return false;
	}
	
}

class SavingsAccount extends Account {
	double interestRate;
	SavingsAccount(String accountNumber,double balance,double interestRate){
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	double endOfDayInterest(){
		double x=getBalance()*(interestRate/36500);
		//System.out.println(interestRate);
		//System.out.println(x);
		return getBalance()*(interestRate/36500);
	}
}

class Transaction{
	private String transactionId;
	private Date date;
	private String type;
	private double amount;
	public static final String DEBIT="debit";       //good practice 
	public static final String CREDIT="credit";     //easily make change

	Transaction(String type, double amount){
		Random random = new Random();
		this.transactionId="T"+random.nextInt();
		this.date=new Date();
		this.type=type;
		this.amount=amount;
	}

	//@override
	public String toString(){
		StringBuilder sb=new StringBuilder("Transaction id : "+transactionId);
		sb.append("Date : "+date);
		sb.append(" type : "+type);
		sb.append(" amount : "+amount);
		return sb.toString();
	}
	
}