   class SmartphoneAdapter implements PowerOutlet {
       private final Charger charger;

       public SmartphoneAdapter(Charger charger) {
           this.charger = charger;
       }

       @Override
       public void plugIn() {
           charger.chargePhone();
       }
   }