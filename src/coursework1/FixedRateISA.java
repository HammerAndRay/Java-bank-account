/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

/**
 *
 * @author w1387769
 */
public class FixedRateISA extends SavingAccount {

    private String ServiceProvider;
    private String Account;
    private String Notice;
    private String Access;
    private String Transfer;
    private double Rate;
    private String Advantage;// instance variable for the Advantages
    private String Disadvantage;// instance variable for the disadvantages

    public FixedRateISA() {
    }

    public FixedRateISA(String FinancialServiceProvider, String AccountName, double InterestRate, String notice, String TransferIn, String access, String Advantages, String Disadvantages) // this is the form my accounts will take- here i set the parameaters
    {
        ServiceProvider = FinancialServiceProvider;
        Account = AccountName;
        Rate = InterestRate;
        Notice = notice;
        Transfer = TransferIn;
        Access = access;
        Advantage = Advantages;
        Disadvantage = Disadvantages;
        
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

    public String get_Transfer() {
        return Transfer;
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
