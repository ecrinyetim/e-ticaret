public class App {
    public static void main(String[] args) throws Exception {

        ElectronicProducts e1 = new ElectronicProducts("Telefon", 15000, 25);
        e1.sepeteEkle();
        e1.sepeteEkle();
        System.out.println(e1.getStok());
        e1.OnlineOdeme();
        e1.standartKargo();
        System.out.println(e1.hesapGoster());
    }
}
