package com.bigdicegames.playndemos.math;

public class Vec2f {
    public float x,y;
    
    public Vec2f(float x, float y) {
	this.x = x;
	this.y = y;
    }

    public Vec2f add(Vec2f other) {
	return new Vec2f(x + other.x, y + other.y);
    }

    public String toString() {
	return "["+x+" "+y+"]";
    }
}