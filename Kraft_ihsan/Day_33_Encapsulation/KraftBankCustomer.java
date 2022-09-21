package Day_33_Encapsulation;

import java.util.Random;

public class KraftBankCustomer {







    //6- customerFullName’in değiştirilmesi için token zorunlu kılınacak,hatalı token girilirse uyarı verilece


    private int customerID;
    private String customerFullName;
    private boolean isSMS;
    private double customerAccount;
    private String customerToken;

    public KraftBankCustomer(int customerID, String customerFullName, boolean isSMS) {
        this.customerID = customerID;
        this.customerFullName = customerFullName;
        this.isSMS = isSMS;
       // Random random=new Random();
        this.customerToken=customerID+customerFullName.substring(0,2).toUpperCase()+12 ;//(random.nextInt(8999)+1000)
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public String getCustomerFullName() {
        return this.customerFullName;
    }
    public void setCustomerFullName(String customerToken, String customerFullName){
        if(customerToken.equals(this.customerToken)){
            this.customerFullName=customerFullName;
        }else{
            System.out.println("hatalı giriş yaptınız...");
        }
    }

    public boolean getIsSMS() {
        return this.isSMS;
    }

    public void setIsSMS(boolean isSMS) {
        this.isSMS = isSMS;
    }
    public double getCustomerAccount() {
        return this.customerAccount;
    }

    public String getCustomerToken() {
        return this.customerToken;
    }


    public void addMoney(double money){
        this.customerAccount+=money;

    }

}
