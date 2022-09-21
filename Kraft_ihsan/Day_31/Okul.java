package Day_31;

public class Okul {
   public String renk;
   public int kapasite;
   public int sinifAdedi;

public Okul(){

}

public Okul(String renk){

    this.renk=renk;
}

public Okul(String renk, int kapasite){
    this.renk=renk;
    this.kapasite=kapasite;
}

public Okul(String renk, int kapasite, int sinifAdedi) {
    this.renk=renk;
    this.kapasite=kapasite;
    this.sinifAdedi=sinifAdedi;
}
public void controlKapasite(){
    if (this.kapasite>500){
        System.err.println("Kapasite aşılmıştır.");
    } else {
        System.out.println("Kapasite aşılmasına " + (500 - this.kapasite) + " kişi kalmıştır.");
    }
}
}
