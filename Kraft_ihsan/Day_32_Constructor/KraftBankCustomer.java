package Day_32_Constructor;

import java.util.Random;

public class KraftBankCustomer {

    //1-customerId, customerFullName, isSms ilk tanımlama esnasında zorunlu olacak
    //2-ilk tanımlama esnasında customerAccount tanımlanmayacak default 0 gelmesi gerekli.
    //3-İlk tanımlama sonrası customerToken; customerId +customerFullName’in ilk iki
    //harfi+1000-9999 rasında random bir sayı ile otomatik oluşturulacak.
    //4-customerAccount para(money) miktarı girilerek hesaptaki para arttırılması için class
    //içerisinde addMoney adında bir metot yazılacak

    public int customerId;
    public String customerFullName;
    public boolean isSms;
    public int customerAccount;
    public String customerToken;

    public KraftBankCustomer(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;

        Random random=new Random();
        this.customerToken=customerId+customerFullName.substring(0,2).toUpperCase()+(random.nextInt(8999)+1000);
    }

    public void addMoney(int money){
        this.customerAccount+=money;
    }
}
