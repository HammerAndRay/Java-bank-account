/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MOHAMED RAHIM BARAKY W1387769 
 */
public class MoneySupermarket {

    private static boolean MainMenu = true;
    private static boolean SubMenu = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EasyAccess[] EasyAccess = new EasyAccess[8];
        PeerToPeer[] PeerToPeer = new PeerToPeer[5];
        ShortTermISA[] ShortTermISA = new ShortTermISA[3];
        MediumTermISA[] MediumTermISA = new MediumTermISA[3];
        LongTermISA[] LongTermISA = new LongTermISA[3];
        EasyAccess[0] = new EasyAccess("Scottish Widows Bank", " Direct Transfer Account 2", 1.70, 1000, "Instant", "Online,Telephone and Post", "Unlimited deposits and withdrawals", "When the 12 month introductory period ends, the Online Saver variable rate will apply, currently 0.10% gross/AER");
        EasyAccess[1] = new EasyAccess("AA", " Internet Extra (Issue 10)", 1.70, 50000, "Instant", "Online only", "Unlimited deposits and withdrawals", "When the 12 month introductory period ends, the Online Saver variable rate will apply, currently 0.10% gross/AER");
        EasyAccess[2] = new EasyAccess("BM Savings", " Online Reward (Issue 2)", 1.70, 50000, "Instant", "Online only", "Unlimited deposits and withdrawals", "When the 12 month introductory period ends, the Online Saver variable rate will apply, currently 0.10% gross/AER");
        EasyAccess[3] = new EasyAccess("Halifax", " Online Saver ", 1.60, 20000, "Instant", "Online only", "Unlimited deposits and withdrawals", "When the 12 month introductory period ends, the Online Saver variable rate will apply, currently 0.10% gross/AER");
        EasyAccess[4] = new EasyAccess("Barclays", " e-savings Reward", 1.26, 1, "Instant", "Online and Cash Point", "Unlimited deposits and withdrawals", "When the 12 month introductory period ends, the Online Saver variable rate will apply, currently 0.10% gross/AER");
        EasyAccess[5] = new EasyAccess("NatWest", " e-Savings", 1.00, 1, "Instant", "Online only", "Unlimited deposits and withdrawals", "When the 12 month introductory period ends, the Online Saver variable rate will apply, currently 0.10% gross/AER");
        EasyAccess[6] = new EasyAccess("Royal Bank of Scotland", " Direct Saver", 1.00, 1, "Instant", "Online only", "Unlimited deposits and withdrawals", "When the 12 month introductory period ends, the Online Saver variable rate will apply, currently 0.10% gross/AER");
        EasyAccess[7] = new EasyAccess("Barclays", " Bank Everyday Saver ", 0.60, 1, "Instant", "Online,Telephone, Branch and cash point", "Unlimited deposits and withdrawals", "When the 12 month introductory period ends, the Online Saver variable rate will apply, currently 0.10% gross/AER");
        PeerToPeer[0] = new PeerToPeer("Funding Circle", 8.80, 5.80, 20, "2 Day Notice", "Simple and easy online access ", "Your savings are not protected by the FSCS ");
        PeerToPeer[1] = new PeerToPeer("Rate Setter 5 Year Income", 5.70, 5.70, 20, "5 Years", "Simple and easy online access ", "Your savings are not protected by the FSCS ");
        PeerToPeer[2] = new PeerToPeer("Rate Setter 3 Year Income", 4.50, 4.50, 20, "3 Years", "Simple and easy online access ", "Your savings are not protected by the FSCS ");
        PeerToPeer[3] = new PeerToPeer("Rate Setter 1 Year Bond", 3.10, 3.10, 20, "1 Years", "Simple and easy online access ", "Your savings are not protected by the FSCS ");
        PeerToPeer[4] = new PeerToPeer("Rate Setter Monthly Access", 2.30, 2.30, 10, "30 days", "Simple and easy online access ", "Your savings are not protected by the FSCS ");
        ShortTermISA[0] = new ShortTermISA("Halifax", " ISA Saver Fixed", 2.05, "1 Year", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");
        ShortTermISA[1] = new ShortTermISA("Natwest", " Fixed Rate ISA Issue 74", 2.00, "22/04/2014", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");
        ShortTermISA[2] = new ShortTermISA("RBS", " Fixed Rate ISA issue 74", 2.00, "22/04/2014", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");
        MediumTermISA[0] = new MediumTermISA("Halifax", " ISA Saver Fixed", 2.50, "2 Year", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");
        MediumTermISA[1] = new MediumTermISA("Natwest", " Fixed Rate ISA Issue 75", 2.25, "22/04/2015", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");
        MediumTermISA[2] = new MediumTermISA("RBS", " Fixed Rate ISA Issue 75", 2.25, "22/04/2015", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");
        LongTermISA[0] = new LongTermISA("Halifax", " ISA Saver Fixed 5 year", 2.70, "5 Year", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");
        LongTermISA[1] = new LongTermISA("Halifax", " ISA Saver Fixed 4 Year", 2.65, "4 Year", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");
        LongTermISA[2] = new LongTermISA("Halifax", " ISA Saver Fixed 3 Year", 2.60, "3 Year", "Yes", "Online, Telephone and Branch", "Limited offer, may be withdrawn at anytime", "Early closure is allowed subject to the loss of 180 days tax-free interest");


        while (MainMenu) {

            while (SubMenu) {

                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Please select one of the options.");
                System.out.println("1: List Accounts in alphabetical Order.");
                System.out.println("---------------------------------------");
                System.out.println("2: Calculate Interest Given An Account.");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                int Selection = input.nextInt();
                if (Selection == 1) {
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println("Please select one of the options.");
                    System.out.println("1: List Easy Access Accounts in alphabetical Order.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("2: List Peer To Peer Accounts in alphabetical Order.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("3: List Short Term ISA Accounts in alphabetical Order.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("4: List Medium Short Term ISA Accounts in alphabetical Order.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("5: List Long Short Term ISA Accounts in alphabetical Order.");
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    int SubSelection = input.nextInt();
                    switch (SubSelection) {
                        case 1:
                            EasyAccessList(EasyAccess);
                            break;
                        case 2:
                            PeerToPeerList(PeerToPeer);
                            break;
                        case 3:
                            ShortTermISAList(ShortTermISA);
                            break;
                        case 4:
                            MediumTermISAList(MediumTermISA);
                            break;
                        case 5:
                            LongTermISAList(LongTermISA);
                            break;

                    }
                } else if (Selection == 2) {
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println("Please select one of the options.");
                    System.out.println("1: Calculate The Interest Of A Easy Access.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("2: Calculate The Interest Of A Peer To Peer Account.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("3: Calculate The Interest Of A Short Term ISA Account.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("4: Calculate The Interest Of A Medium Term ISA Account.");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("5: Calculate The Interest Of A Long Term ISA Account.");
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    int SubSelection2 = input.nextInt();
                    switch (SubSelection2) {
                        case 1:
                            EasyAccessInterest(EasyAccess);
                            break;
                        case 2:
                            PeerToPeerInterest(PeerToPeer);
                            break;
                        case 3:
                            ShortTermISAInterest(ShortTermISA);
                            break;
                        case 4:
                            MediumTermISAInterest(MediumTermISA);
                            break;
                        case 5:
                            LongTermISAInterest(LongTermISA);
                            break;
                    }

                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println("Continue With This Account\n1 ) Yes\n2 ) No");
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    if (input.nextInt() == 1) {
                        SubMenu = true;
                    } else {
                        SubMenu = false;
                    }
                }

                SubMenu = true;
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Would You Like To Continue With The Program\n1 ) Yes\n2 ) No");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                if (input.nextInt() == 1) {
                    MainMenu = true;
                } else {
                    System.exit(0);
                }
            }
        }}

    

    public static void EasyAccessList(EasyAccess[] EasyAccess) {
        System.out.println("---------------------------------------------------");
        System.out.println("Names of Easy Access service Providers and Products in alphabetical Order");
        System.out.println("---------------------------------------------------");
        String[] myStringArray1 = new String[EasyAccess.length];
        for (int i = 0; i < EasyAccess.length; i++) {
            myStringArray1[i] = EasyAccess[i].get_ServiceProvider() + EasyAccess[i].get_Account();
        }
        Arrays.sort(myStringArray1);
        for (int a = 0; a < EasyAccess.length; a++) {
            System.out.println(myStringArray1[a]);
        }
        /* YOU COULD ALSO USE THIS: (THIS WOULD BE THE ALGORITHM FOR SORTING)
          String[] myStringArray1 = new String[EasyAccess.length];
        for (int i = 0; i < EasyAccess.length; i++) {
            myStringArray1[i] = EasyAccess[i].get_ServiceProvider() + EasyAccess[i].get_Account();
        }
          for (int A = 0; A < myStringArray1.length; A++) {
            for (int B = 0; B <= myStringArray1.length - 2 - A; B++) {
                if (myStringArray1[B].compareTo(myStringArray1[B + 1]) > 0) {
                    temp = myStringArray1[B];
                    myStringArray1[B] = myStringArray1[B + 1];
                    myStringArray1[B + 1] = temp;
                }
            }
        }
        for (int a = 0; a < EasyAccess.length; a++) {
            System.out.println(myStringArray1[a]);
        }
         */
    }

    public static void PeerToPeerList(PeerToPeer[] PeerToPeer) {
        System.out.println("---------------------------------------------------");
        System.out.println("Names of Peer To Peer service Providers and Products in alphabetical Order");
        System.out.println("---------------------------------------------------");
        String[] myStringArray2 = new String[PeerToPeer.length];
        for (int i = 0; i < PeerToPeer.length; i++) {
            myStringArray2[i] = PeerToPeer[i].get_Product();
        }
        Arrays.sort(myStringArray2);
        for (int a = 0; a < PeerToPeer.length; a++) {
            System.out.println(myStringArray2[a]);
        }
        /* YOU COULD ALSO USE THIS: (THIS WOULD BE THE ALGORITHM FOR SORTING)
         String[] myStringArray2 = new String[PeerToPeer.length];
        for (int i = 0; i < PeerToPeer.length; i++) {
            myStringArray2[i] = PeerToPeer[i].get_ServiceProvider() + PeerToPeer[i].get_Account();
        }
         for (int A = 0; A < myStringArray2.length; A++) {
            for (int B = 0; B <= myStringArray2.length - 2 - A; B++) {
                if (myStringArray2[B].compareTo(myStringArray2[B + 1]) > 0) {
                    temp = myStringArray2[B];
                    myStringArray2[B] = myStringArray2[B + 1];
                    myStringArray2[B + 1] = temp;
                }
            }
        }
        for (int a = 0; a < PeerToPeer.length; a++) {
            System.out.println(myStringArray2[a]);
        }
         */
    }

    public static void ShortTermISAList(ShortTermISA[] ShortTermISA) {
        System.out.println("---------------------------------------------------");
        System.out.println("Names of Short Term ISA service Providers and Products in alphabetical Order");
        System.out.println("---------------------------------------------------");
        String[] myStringArray3 = new String[ShortTermISA.length];
        for (int i = 0; i < ShortTermISA.length; i++) {
            myStringArray3[i] = ShortTermISA[i].get_ServiceProvider() + ShortTermISA[i].get_Account();
        }
        Arrays.sort(myStringArray3);
        for (int a = 0; a < ShortTermISA.length; a++) {
            System.out.println(myStringArray3[a]);
        }
        /* YOU COULD ALSO USE THIS: (THIS WOULD BE THE ALGORITHM FOR SORTING)
          String[] myStringArray3 = new String[ShortTermISA.length];
        for (int i = 0; i < ShortTermISA.length; i++) {
            myStringArray3[i] = ShortTermISA[i].get_ServiceProvider() + ShortTermISA[i].get_Account();
        }
          for (int A = 0; A < myStringArray3.length; A++) {
            for (int B = 0; B <= myStringArray3.length - 2 - A; B++) {
                if (myStringArray3[B].compareTo(myStringArray3[B + 1]) > 0) {
                    temp = myStringArray3[B];
                    myStringArray3[B] = myStringArray3[B + 1];
                    myStringArray3[B + 1] = temp;
                }
            }
        }
        for (int a = 0; a < ShortTermISA.length; a++) {
            System.out.println(myStringArray3[a]);
        }
         */
    }

    public static void MediumTermISAList(MediumTermISA[] MediumTermISA) {
        System.out.println("---------------------------------------------------");
        System.out.println("Names of Medium Term ISA service Providers and Products in alphabetical Order");
        System.out.println("---------------------------------------------------");
        String[] myStringArray4 = new String[MediumTermISA.length];
        for (int i = 0; i < MediumTermISA.length; i++) {
            myStringArray4[i] = MediumTermISA[i].get_ServiceProvider() + MediumTermISA[i].get_Account();
        }
        Arrays.sort(myStringArray4);
        for (int a = 0; a < MediumTermISA.length; a++) {
            System.out.println(myStringArray4[a]);
        }
        /* YOU COULD ALSO USE THIS: (THIS WOULD BE THE ALGORITHM FOR SORTING)
          String[] myStringArray4 = new String[MediumTermISA.length];
        for (int i = 0; i < MediumTermISA.length; i++) {
            myStringArray4[i] = MediumTermISA[i].get_ServiceProvider() + MediumTermISA[i].get_Account();
        }
          for (int A = 0; A < myStringArray4.length; A++) {
            for (int B = 0; B <= myStringArray4.length - 2 - A; B++) {
                if (myStringArray4[B].compareTo(myStringArray4[B + 1]) > 0) {
                    temp = myStringArray4[B];
                    myStringArray4[B] = myStringArray4[B + 1];
                    myStringArray4[B + 1] = temp;
                }
            }
        }
        for (int a = 0; a < MediumTermISA.length; a++) {
            System.out.println(myStringArray4[a]);
        }
         */
    }

    public static void LongTermISAList(LongTermISA[] LongTermISA) {
        System.out.println("---------------------------------------------------");
        System.out.println("Names of Long Term ISA service Providers and Products in alphabetical Order");
        System.out.println("---------------------------------------------------");
        String[] myStringArray5 = new String[LongTermISA.length];
        for (int i = 0; i < LongTermISA.length; i++) {
            myStringArray5[i] = LongTermISA[i].get_ServiceProvider() + LongTermISA[i].get_Account();
        }
        Arrays.sort(myStringArray5);
        for (int a = 0; a < LongTermISA.length; a++) {
            System.out.println(myStringArray5[a]);
        }
        /* YOU COULD ALSO USE THIS: (THIS WOULD BE THE ALGORITHM FOR SORTING)
          String[] myStringArray5 = new String[LongTermISA.length];
        for (int i = 0; i < LongTermISA.length; i++) {
            myStringArray5[i] = LongTermISA[i].get_ServiceProvider() + LongTermISA[i].get_Account();
        }
          for (int A = 0; A < myStringArray5.length; A++) {
            for (int B = 0; B <= myStringArray5.length - 2 - A; B++) {
                if (myStringArray5[B].compareTo(myStringArray5[B + 1]) > 0) {
                    temp = myStringArray5[B];
                    myStringArray5[B] = myStringArray5[B + 1];
                    myStringArray5[B + 1] = temp;
                }
            }
        }
        for (int a = 0; a < LongTermISA.length; a++) {
            System.out.println(myStringArray5[a]);
        }
         */
    }

    public static void EasyAccessInterest(EasyAccess[] EasyAccess) {
        Scanner input = new Scanner(System.in);
        int AccountChoice;
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Select Account");
        for (int c = 0; c < EasyAccess.length; c++) {
            System.out.println((c + 1) + " ) " + EasyAccess[c].get_Account() + ": The Interest Rate For This Account is " + EasyAccess[c].get_Rate() + "%");
        }
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        AccountChoice = input.nextInt() - 1;
        double TotalMoney;
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter The Time You Wish to Calculate The Interest For In Years:");
        System.out.println("--------------------------------------------------------------");
        int years = input.nextInt();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Enter The Amount Of Money You Wish To Calculate The Interest For:");
        System.out.println("---------------------------------------------------------------");
        double Deposit = input.nextInt();
        double Interest = ((EasyAccess[AccountChoice].get_Rate()) / 100.00);
        TotalMoney = Deposit * ((Math.pow((1 + Interest), years)));
        int TotalMoneY = (int) TotalMoney;
        System.out.println("The New total with Interest After " + years + " Is £" + TotalMoneY);
    }

    public static void PeerToPeerInterest(PeerToPeer[] PeerToPeer) {
        Scanner input = new Scanner(System.in);
        int AccountChoice;
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Select Account");
        for (int c = 0; c < PeerToPeer.length; c++) {
            System.out.println((c + 1) + " ) " + PeerToPeer[c].get_Product() + ": The Interest Rate For This Account is " + PeerToPeer[c].get_AER() + "%");
        }
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        AccountChoice = input.nextInt() - 1;
        double TotalMoney;
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter The Time You Wish to Calculate The Interest For In Years:");
        System.out.println("--------------------------------------------------------------");
        int years = input.nextInt();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Enter The Amount Of Money You Wish To Calculate The Interest For:");
        System.out.println("---------------------------------------------------------------");
        double Deposit = input.nextInt();
        double Interest = ((PeerToPeer[AccountChoice].get_AER()) / 100.00);
        TotalMoney = Deposit * ((Math.pow((1 + Interest), years)));
        int TotalMoneY = (int) TotalMoney;
        System.out.println("The New total with Interest After " + years + " Is £" + TotalMoneY);
    }

    public static void ShortTermISAInterest(ShortTermISA[] ShortTermISA) {
        Scanner input = new Scanner(System.in);
        int AccountChoice;
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Select Account");
        for (int c = 0; c < ShortTermISA.length; c++) {
            System.out.println((c + 1) + " ) " + ShortTermISA[c].get_Account() + ": The Interest Rate For This Account is " + ShortTermISA[c].get_Rate() + "%");
        }
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        AccountChoice = input.nextInt() - 1;
        double TotalMoney;
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter The Time You Wish to Calculate The Interest For In Years:");
        System.out.println("--------------------------------------------------------------");
        int years = input.nextInt();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Enter The Amount Of Money You Wish To Calculate The Interest For:");
        System.out.println("---------------------------------------------------------------");
        double Deposit = input.nextInt();
        double Interest = ((ShortTermISA[AccountChoice].get_Rate()) / 100.00);
        TotalMoney = Deposit * ((Math.pow((1 + Interest), years)));
        int TotalMoneY = (int) TotalMoney;
        System.out.println("The New total with Interest After " + years + " Is £" + TotalMoneY);
    }

    public static void MediumTermISAInterest(MediumTermISA[] MediumTermISA) {
        Scanner input = new Scanner(System.in);
        int AccountChoice;
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Select Account");
        for (int c = 0; c < MediumTermISA.length; c++) {
            System.out.println((c + 1) + " ) " + MediumTermISA[c].get_Account() + ": The Interest Rate For This Account is " + MediumTermISA[c].get_Rate() + "%");
        }
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        AccountChoice = input.nextInt() - 1;
        double TotalMoney;
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter The Time You Wish to Calculate The Interest For In Years:");
        System.out.println("--------------------------------------------------------------");
        int years = input.nextInt();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Enter The Amount Of Money You Wish To Calculate The Interest For:");
        System.out.println("---------------------------------------------------------------");
        double Deposit = input.nextInt();
        double Interest = ((MediumTermISA[AccountChoice].get_Rate()) / 100.00);
        TotalMoney = Deposit * ((Math.pow((1 + Interest), years)));
        int TotalMoneY = (int) TotalMoney;
        System.out.println("The New total with Interest After " + years + " Is £" + TotalMoneY);

    }

    public static void LongTermISAInterest(LongTermISA[] LongTermISA) {
        Scanner input = new Scanner(System.in);
        int AccountChoice;
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Select Account");
        for (int c = 0; c < LongTermISA.length; c++) {
            System.out.println((c + 1) + " ) " + LongTermISA[c].get_Account() + ": The Interest Rate For This Account is " + LongTermISA[c].get_Rate() + "%");
        }
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        AccountChoice = input.nextInt() - 1;
        double TotalMoney;
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter The Time You Wish to Calculate The Interest For In Years:");
        System.out.println("--------------------------------------------------------------");
        int years = input.nextInt();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Enter The Amount Of Money You Wish To Calculate The Interest For:");
        System.out.println("---------------------------------------------------------------");
        double Deposit = input.nextInt();
        double Interest = ((LongTermISA[AccountChoice].get_Rate()) / 100.00);
        TotalMoney = Deposit * ((Math.pow((1 + Interest), years)));
        int TotalMoneY = (int) TotalMoney;
        System.out.println("The New total with Interest After " + years + " Is £" + TotalMoneY);


    }
}
