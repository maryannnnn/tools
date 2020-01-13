package GitarsApp;

public enum NumStrings {
    SIX, SEVEN, TWEKV;

    public String toString() {
        switch (this) {
            case SIX:
                return "SIX";
            case SEVEN:
                return "SEVEN";
            case TWEKV:
                return "TWEKV";
        }
        return null;
    }
}
