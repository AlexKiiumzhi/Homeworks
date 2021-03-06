package Main.Java;

import java.util.Objects;

public class ImmutableCar {

    private final Engine engine;
    private final String color;

    public ImmutableCar(Engine engine, String color) throws CloneNotSupportedException {
        super();
        this.engine = (Engine) engine.clone();
        this.color = color;
    }

    public Engine getEngine() throws CloneNotSupportedException {
        return (Engine) engine.clone();
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass() || obj == null) return false;
        ImmutableCar immutableCar = (ImmutableCar) obj;
        return Objects.equals(this.engine, immutableCar.engine) &&
                Objects.equals(this.color, immutableCar.color);
    }

    @Override
    public int hashCode() {
        return (int) (31 * ((engine == null)? 0 : engine.hashCode()) + ((color == null)? 0 : color.hashCode()));
    }



    @Override
    public String toString() {
        return getClass().getName() + "@engine" + engine
                + "@color" + color ;
    }
}
