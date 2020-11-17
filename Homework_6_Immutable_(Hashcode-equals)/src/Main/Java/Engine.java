package Main.Java;

public class Engine implements Cloneable {

    private double CC;

    public Engine (double CC){
        super();
        this.CC = CC;
    }

    public double getCC() {
        return CC;
    }

    public void setCC(double CC) {
        this.CC = CC;
    }

    @Override
    public Object clone() {
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return getClass().getName() + "CC "  + CC;
    }
}
