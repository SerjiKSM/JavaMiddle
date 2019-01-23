package net.ukr.ksm;

import java.io.Serializable;

/**
 * @author Serhio
 *
 */
public class Rectangle implements Serializable{
	public static final String NAME = "Rectangle";
	
	 //protected int width;
	//public int width; 
	private int width; 
	private int height;
	
	
	public Rectangle() {
		width = 10;
		height = 5;
	}
	
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 *  Method Calculate the area
	 */
	public int square(){
		return height * width;
	}
	
	public static Rectangle combine(Rectangle r1, Rectangle r2){
		return new Rectangle(r1.width + r2.width, r1.height + r2.height);
	}
	
	
}
