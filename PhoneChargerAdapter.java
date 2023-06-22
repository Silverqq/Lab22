public class PhoneChargerAdapter implements Charger380 {
    private Charger220 charger220;
    public PhoneChargerAdapter(Charger220 chrgr) {
        charger220 = chrgr;
    }
    @Override
    public void charge380(){
        charger220.charge();
    }
}

