package GitarsApp;

public enum  InstrumentType {

    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;

    public String toString() {
        switch (this) {
            case GUITAR:
                return "Guitar";
            case BANJO:
                return "Banjo";
            case DOBRO:
                return "Dobro";
            case BASS:
                return "Bass";
            case FIDDLE:
                return "Fiddle";
            case MANDOLIN:
                return "Mandolin";
            default:
                return "Unspecified";
        }
    }

}
