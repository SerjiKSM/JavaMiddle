package net.ukr.ksm;

public class Rectangle extends Figure{

	public int height;
	public int width;
		
	/**
	 * @param height
	 * @param width
	 */
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	

	public void draw(char dash, char pipe, char space){
		char[][] rectangle = new char[height][width];
		
		for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == (height - 1)) {
                    rectangle[i][j]= dash;
                } else if (j == 0 || j == (width - 1)) {
                    rectangle[i][j] = pipe;
                } else {
                    rectangle[i][j]= space;
                }
            }
        }
 
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }		
		
	}



	@Override
	public double square() {
		// TODO Auto-generated method stub
		return height * width;
	}
	
}
