public class Voltage380 {
    Charger380 charger;
    Voltage380(Charger380 charger){
        this.charger = charger;
    }
    public void charge() {
        charger.charge380();
    }
}
