package class4_serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Vehicle implements Externalizable {
    private String mark;
    private String model;
    private int year;

    public Vehicle(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public Vehicle() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(mark);
        out.writeObject(model);
        out.writeInt(year);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        mark = (String) in.readObject();
        model = (String) in.readObject();
        year = in.readInt();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year  +
                '}';
    }
}
