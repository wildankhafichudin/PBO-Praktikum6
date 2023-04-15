import Transportasi.Bicycle;
import Transportasi.Mobil;

public class TransportasiDemo {
    public static void main(String[] args) {
        System.out.println("=================================");
        Mobil objectMobil = new Mobil(4, 1);
        objectMobil.info();
        objectMobil.maju();
        objectMobil.mundur();
        objectMobil.belok();
        objectMobil.getJumlahRoda();
        objectMobil.getJumlahGear();

        System.out.println("=================================");
        Bicycle objectBicycle = new Bicycle(2, 3);
        objectBicycle.info();
        objectBicycle.maju();
        objectBicycle.mundur();
        objectBicycle.belok();
        objectBicycle.getJumlahRoda();
        objectBicycle.getJumlahGear();
        System.out.println("=================================");
    }
}