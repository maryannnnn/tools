package GitarsApp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List inventory;

    public Inventory() {
        inventory = new LinkedList();
    }

    public void addlnstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }


    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List search(InstrumentSpec searchSpec) {
        List matchiongInstrument = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();

            if (instrument.getSpec().matches(searchSpec))
                matchiongInstrument.add(instrument);
        }
        return matchiongInstrument;
    }

}
