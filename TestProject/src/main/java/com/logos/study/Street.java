package com.logos.study;

public class Street {
	private int x;
	private int y;
	
	public Street(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Street [x=" + x + ", y=" + y + "]";
	}
	
	
}
