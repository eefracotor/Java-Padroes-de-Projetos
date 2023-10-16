package one.digitalinnovation.gof.prototype;


public abstract class Shape implements Cloneable {
    private String type;

    abstract void draw();

    abstract Double getArea();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
