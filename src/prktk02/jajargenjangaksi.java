package prktk02;
public class jajargenjangaksi {
    
    public static void main(String[] args) {
      
        Jajargenjang jg1 =new Jajargenjang();
        jg1.alas = 15;
        jg1.tinggi = 25;
        
        jg1.cetakinfo();
        System.out.println("Luas jajargenjang="+jg1.hitungluas());
    }
    
}
