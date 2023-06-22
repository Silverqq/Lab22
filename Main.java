public class Main {
    public static void main(String[] args) {
        Charger220 charger = new Charger220();
        PhoneChargerAdapter adapter = new PhoneChargerAdapter(charger);
        Voltage380 socket = new Voltage380(adapter);
        socket.charge();
    }
}
