/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

/**
 *
 * @author w1387769
 */
public class EasyAccess extends SavingAccount {//""extends SavingAccount"" The class Easy Access is a sub Class of SavingAccount

    private String ServiceProvider; // instance variable for the Service Provider of the bank 
    private String Account;// instance variable for the Account name
    private String Notice;// instance variable for the notice time
    private String Access;// instance variable for the access type
    private double Rate;// instance variable for the intresrt rate
    private int Investment;// instance variable for for the least amount of money they can invest
    private String Advantage;// instance variable for the Advantages
    private String Disadvantage;// instance variable for the disadvantages

    public EasyAccess(String FinancialServiceProvider, String AccountName, double InterestRate, int MinimumInvestment, String notice, String access, String Advantages, String Disadvantages) // this is the form my accounts will take- here i set the parameaters
    {// constructor
        ServiceProvider = FinancialServiceProvider;
        Account = AccountName;
        Rate = InterestRate;
        Investment = MinimumInvestment;
        Notice = notice;
        Access = access;

    }

    public String get_ServiceProvider() {
        return ServiceProvider;
    }

    public String get_Account() {
        return Account;
    }

    public double get_Rate() {
        return Rate;
    }

    public double get_Investment() {
        return Investment;
    }

    public String get_Notice() {
        return Notice;
    }

    public String get_Access() {
        return Access;
    }
    public String get_Advantage() {
        return Advantage;
    }
    
    public String get_Disadvantage() {
        return Disadvantage;
    }
}
