public abstract class urunler {
    private String ad;
    private float fiyat;
    private int stok;
    private int sepet;
    private float hesap;

    public urunler(String ad, float fiyat, int stok) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.stok = stok;

    }

    public int getSepet() {
        return this.sepet;
    }

    public void setSepet(int sepet) {
        this.sepet = sepet;
    }

    public String getAd() {
        return this.ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public float getFiyat() {
        return this.fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public float hesapGoster() {

        hesap = getFiyat() * getSepet();
        return hesap;
    }

}

interface sepet {

    void sepeteEkle();

    void sepettenCikar();
}

interface kargo {
    void standartKargo();

    void expressKargo();

}

interface odeme {
    void OnlineOdeme();

    void KapidaOdeme();

}

class ElectronicProducts extends urunler implements sepet, odeme, kargo {

    public ElectronicProducts(String ad, float fiyat, int stok) {
        super(ad, fiyat, stok);

    }

    @Override
    public void sepeteEkle() {
        setSepet(getSepet() + 1);
        setStok(getStok() - 1);

    }

    @Override
    public void sepettenCikar() {
        setSepet(getSepet() - 1);
        setStok(getStok() + 1);
    }

    @Override
    public void standartKargo() {
        setFiyat(getFiyat() + 15);
    }

    @Override
    public void expressKargo() {
        setFiyat(getFiyat() + 25);
    }

    @Override
    public void OnlineOdeme() {
        setFiyat(getFiyat() - (getFiyat() * 15 / 100));

    }

    @Override
    public void KapidaOdeme() {
        setFiyat(getFiyat() + (getFiyat() * 15 / 100));
    }

}