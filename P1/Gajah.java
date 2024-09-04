public class Gajah {
    private String nama ;
    private int umur ;
    public static void main(String[] args) {
        
    }
    private void makan (){
        System.out.println("makan");
    }
    private void berlari (){
        System.out.println( this.nama +" berlari, umur "+ this.umur + " Tahun");
    }
    public Gajah (String nama, int umur){    
        this.nama = nama;
        this.umur = umur;
    }
}


