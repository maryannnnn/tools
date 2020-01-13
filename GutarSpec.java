package GitarsApp;

import java.util.Objects;

public class GutarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood, topWood;
    private NumStrings numStrings;


    public GutarSpec(Builder builder, String model, Type type,
                  Wood backWood, Wood topWood, NumStrings numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public boolean matches(GutarSpec otherSpec) {
        if (builder != otherSpec.builder) return false;
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))) return false;
        if (type != otherSpec.type) return false;
        if (backWood != otherSpec.backWood) return false;
        if (topWood != otherSpec.topWood) return false;
        if (numStrings != otherSpec.numStrings) return false;
        return true;
    }

    public NumStrings getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(NumStrings numStrings) {
        this.numStrings = numStrings;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GutarSpec gutarSpec = (GutarSpec) o;
        return builder == gutarSpec.builder &&
                Objects.equals(model, gutarSpec.model) &&
                type == gutarSpec.type &&
                backWood == gutarSpec.backWood &&
                topWood == gutarSpec.topWood;
    }

    @Override
    public int hashCode() {

        return Objects.hash(builder, model, type, backWood, topWood);
    }
}
