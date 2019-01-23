package net.ukr.ksm;

import java.io.Serializable;

public class Human implements Serializable, Cloneable {

	private float height, weight;
	private String name;
	private static final long serialVersionUID = 1L;

	Human(float height, float weight, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return this.height;
	}

	public float getWeight() {
		return this.weight;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Human a = (Human) super.clone();
		a.height = (float) this.height;
		a.weight = (float) this.weight;
		a.name = (String) this.name;
		return a;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		if (super.equals(obj))
			return true;
		Human other = (Human) obj;
		if (this.getHeight() == other.getHeight()
				&& this.getName() == other.getName()
				&& this.getWeight() == other.getWeight()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int) (this.height * this.weight * this.name.length());
	}

}
