package net.ukr.ksm;

public class Plants {
	protected String[] arColor = { "red", "green", "blue" };
	protected String[] arType = { "flower", "tree" };
	protected int size;
	protected String color;
	protected String type;

	Plants(int size, String color, String type) throws ColorExceptions,
			TypeExceptions, SizeExceptions {
		for (int i = 0; i < arColor.length; i++) {
			if (arColor[i].equalsIgnoreCase(color)) {
				break;
			} else if (i == arColor.length - 1) {
				throw new ColorExceptions("Invalid color of plants!!!");
			}
		}
		for (int i = 0; i < arType.length; i++) {
			if (arType[i].equalsIgnoreCase(type)) {
				break;
			} else if (i == arType.length - 1) {
				throw new TypeExceptions("Invalid type of plants!!!");
			}
		}
		if (size < 0) {
			throw new SizeExceptions("Invalid size of plants!!!");
		}
		this.size = size;
		this.color = color;
		this.type = type;
	}
}
