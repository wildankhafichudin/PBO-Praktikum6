package Transportasi;

public class Bicycle {

    private int jumlahRoda;
    private int jumlahGear;

    public void info() {
        System.out.println("Kelas Bicycle");
        System.out.println("Jumlah roda: " + this.jumlahRoda);
        System.out.println("Jumlah gear: " + this.jumlahGear);
    }

    public Bicycle(int roda, int gear) {
        this.jumlahRoda = roda;
        this.jumlahGear = gear;
        roda = 2;
        gear = 3;
    }
    
    public void maju() {
        System.out.println("Maju");
    }
    
    public void mundur() {
        System.out.println("Mundur");
    }
    
    public void belok() {
        System.out.println("Belok");
    }
    
    public int getJumlahRoda() {
        return jumlahRoda;
    }
    
    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
    
    public int getJumlahGear() {
        return jumlahGear;
    }
    
    public void setJumlahGear(int jumlahGear) {
        this.jumlahGear = jumlahGear;
    }
}