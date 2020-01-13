package GitarsApp;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian Rosewood";
            case MAHOGANY:
                return "MAHOGANY";
            case MAPLE:
                return "MAPLE";
            case COCOBOLO:
                return "COCOBOLO";
            case CEDAR:
                return "CEDAR";
            case ADIRONDACK:
                return "ADIRONDACK";
            case ALDER:
                return "ALDER";
            case SITKA:
                return "SITKA";
        }
        return null;
    }
}
