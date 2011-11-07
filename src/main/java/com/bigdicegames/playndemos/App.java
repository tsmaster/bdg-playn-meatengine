package com.bigdicegames.playndemos;

import com.bigdicegames.playndemos.math.Vec2f;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

	Vec2f xHat = new Vec2f(1.0f, 0.0f);
	Vec2f yHat = new Vec2f(0.0f, 1.0f);

	Vec2f outVec = xHat.add(yHat);
	System.out.println( "sum: " + outVec.toString());

    }
}
