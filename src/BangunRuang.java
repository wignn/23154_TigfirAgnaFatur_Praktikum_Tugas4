public class BangunRuang {

    public void setBalok(double panjang, double lebar, double tinggi) {
        System.out.println("luas permukaan balok " +hitungLuasPermukaanBalok(panjang, lebar, tinggi ) + "m2");
        System.out.println("volume balok " + hitungVolumeBalok(panjang, lebar, tinggi) + "m3");
    }

    private double hitungVolumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    private double hitungLuasPermukaanBalok(double panjang, double lebar, double tinggi) {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }


    public void setKubus(double sisi) {
        System.out.println("volume kubus " + hitungVolumeKubus(sisi) + "m3");
        System.out.println("luas permukaan kubus " + hitungLuasPermukaanKubus(sisi) + "m2");
    }

    private double hitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    private double hitungLuasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;
    }
}
