/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
//Ex 2.2 Balance is zero after running get balance after printing a ticket.
//Ex 2.3 Machine does not give refund if inserting too much money.
//Ex 2.3 Machine does not give an error if inserting too little money.
//Ex 2.5 Second machine has a different name.
//Ex 2.6 public class Student {} and public class LabClass {}
//Ex 2.7 Changing order of class declaration throws multiple errors and does not compile. Err messages are clear, compiler expects class id after "class".
//Ex 2.8 Removing public still compiles and all test cases run.
//Ex 2.9 TicketMachine-fields:price,balance,total,ticketNumber constructor-TicketMachine methods-getPrice,getTicketNumber,getBalance,insertMoney,calculateTotal,getTotal,incrementTicketNumber,printTicket
//Ex 2.10 The constructor only assigns values to the fields in the Superclass while creating a Subclass.
//Ex 2.11 1-int, 2-string, 3-string
//Ex 2.12 1-alive, 2-tutor, 3-game
//Ex 2.13 After re-ordering, the class diagram box has red lines, and the code wont compile, no matter the combination(aside from the correct one).
//Ex 2.14 Semicolon is necessary for declaration.
//Ex 2.15 Answer below
//Ex 2.16 The constructor belongs to the Student class
//Ex 2.17 This constructor has two parameters, a String and a Double.
//Ex 2.18 Book class's fields may include Strings, Integers, Doubles, and Floats. Can assume they would be titles, page numbers, catalog numbers, and prices.

public class TicketMachine
{
    // The price of a ticket from this machine.
    private Integer price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;
    // The number of tickets printed.
    private Integer ticketNumber;
    
    private Integer status;
    //Ex 2.15
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(Integer ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
        ticketNumber = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public Integer getPrice()
    {
        return price;
    }
    
    /**
     * Return ticketNumber.
     * (Increments on each print.)
     */
    public Integer getTicketNumber()
    {
        return ticketNumber;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public Integer getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(Integer amount)
    {
        balance = balance + amount;
        
    }
    
    public Integer calculateTotal(){
        total = balance + total;
        return total;
    }
    
    public Integer incrementTicketNumber(){
        ticketNumber++;
        return ticketNumber;
    }
    public Integer getTotal() {
        return total;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public String printTicket()
    {
        //Increment the number of tickets printed
        incrementTicketNumber();
        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
        
        return "Ticket price: " + price + " cents. " + "Your total is " + total + ".";
    }
}
