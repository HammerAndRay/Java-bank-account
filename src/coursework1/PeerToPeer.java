/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

/**
 *
 * @author w1387769
 */
public class PeerToPeer extends SavingAccount {

    private String Product;
    private String Notice;
    private double AER;
    private double Rate;
    private int Investment;
    private String Advantage;// instance variable for the Advantages
    private String Disadvantage;// instance variable for the disadvantages

    public PeerToPeer(String ProductName, double HeadlineRate, double ExpectedAER, int MinimumInvestment, String Term, String Advantages, String Disadvantages) {

        Product = ProductName;
        Rate = HeadlineRate;
        AER = ExpectedAER;
        Investment = MinimumInvestment;
        Notice = Term;
        Advantage = Advantages;
        Disadvantage = Disadvantages;

    }

    public String get_Product() {
        return Product;
    }

    public double get_Rate() {
        return Rate;
    }

    // @Override
    public double get_AER() {
        return AER;
    }

    public double get_Investment() {
        return Investment;
    }

    public String get_Notice() {
        return Notice;
    }

    public String get_Advantage() {
        return Advantage;
    }

    public String get_Disadvantage() {
        return Disadvantage;
    }
}
