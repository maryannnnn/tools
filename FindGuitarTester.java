package GitarsApp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class FindGuitarTester {
    public static void main(String[] args) {
        // Инициализация каталога гитар

        Inventory inventory = new Inventory();
        initializelnventory(inventory);

        Map properties = new HashMap();
     //   properties.put("builder", Builder.GIBSON);
     //   properties.put("backWood", Wood.MAPLE);
     //   properties.put("model", "F-5G");
        properties.put("type", Type.ACOUSTIC);
     //   properties.put("topWood", Wood.MAPLE);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List matchingInstrument = inventory.search(clientSpec);

        if (!matchingInstrument.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingInstrument.iterator(); i.hasNext();) {
                Instrument instrument = (Instrument) i.next();
                InstrumentSpec spec =  instrument.getSpec();

                System.out.println(" We have a " + " with folloing properties:");
                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ) {
                    String properetyName = (String)j.next();
                    if (properetyName.equals("GUITAR"))
                        continue;;
                    System.out.println("    " + properetyName + ": " + spec.getProperty(properetyName));
                }
                System.out.println(" You can have this " +
                        spec.getProperty("instrumentType") + " for $" +
                        instrument.getPrice() + "\n-- ");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializelnventory(Inventory inventory) {
        Map properties = new HashMap();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);
        inventory.addlnstrument("3456", 3456, new InstrumentSpec(properties));

        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.SITKA);
        inventory.addlnstrument("345777", 7890, new InstrumentSpec(properties));

        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put ("builder", Builder.MARTIN);
        properties.put ("model", "D-18");
        properties.put ("topWood", Wood.MAHOGANY);
        properties . put ("backWood", Wood.ADIRONDACK);
        inventory.addlnstrument("122784", 5495.95, new InstrumentSpec(properties));

        properties.put("builder", Builder.FENDER);
        properties.put("model", "Stratocastor");
        properties.put("type", Type.ELECTRIC);
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood", Wood.ALDER);
        inventory.addlnstrument("V95693", 1499.95, new InstrumentSpec(properties));
        inventory.addlnstrument("V9512", 1549.95, new InstrumentSpec(properties));

        properties.put("instrumentType", InstrumentType.MANDOLIN);
        properties.put("type", Type.ACOUSTIC);
        properties.put("model", "F-5G");
        properties.put("backWood", Wood.MAPLE);
        properties.put("topWood", Wood.MAPLE);
        properties.remove("numStrings");
        inventory.addlnstrument("9019920", 5495.99, new InstrumentSpec(properties));

        properties.put("instrumentType", InstrumentType.BANJO);
        properties.put("model", "RB-3 Wreath");
        properties.remove("topWood");
        properties.put("numStrings", NumStrings.SEVEN);
        inventory.addlnstrument("8900231", 2945.95, new InstrumentSpec(properties));

        properties.put("instrumentType", InstrumentType.MANDOLIN);
        properties.put("type", Type.ACOUSTIC);
        properties.put("model", "F-5G");
        properties.put("backWood", Wood.MAPLE);
        properties.put("topWood", Wood.MAPLE);
        properties.remove("numStrings");
        inventory.addlnstrument("9019920", 5495.99, new InstrumentSpec(properties));
    }
}
