public class PowerOutletAdapter {
    public static void main(String[] args) {
        PowerOutlet laptopOutlet = new LaptopAdapter(new Laptop());
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(new Refrigerator());
        PowerOutlet phoneOutlet = new SmartphoneAdapter(new Charger());
 
        laptopOutlet.plugIn();
        fridgeOutlet.plugIn();
        phoneOutlet.plugIn();
    }
}
 