package Interfaces;

public class CustomerManager {
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void Add(Customer customer) {
		System.out.println("m��teri eklendi" + customer.getFirstName());
		 
	
		Utils.runLoggers(loggers, customer.getFirstName());
		}

	public void Delete(Customer customer) {
		System.out.println("M��teri Silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		}

}
