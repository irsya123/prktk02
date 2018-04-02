package prktk02;
public class Jajargenjang {
    
    double alas;
    double tinggi;

    public Jajargenjang() {
        alas=25;
        tinggi=35;
    }
    
    
    void cetakinfo(){
        System.out.println("================");
        System.out.println("Alas :"+alas);
        System.out.println("Tinggi :"+tinggi);
        System.out.println("=================");
      
    }
    double hitungluas(){
        double luas;
        luas = alas*tinggi;
        return luas;
    }
    void cetakluas(){
       System.out.println("Luasnya adalah:"+hitungluas());
    }
}
