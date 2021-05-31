package com.onebill.corejava.assignments.day10;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RepeatingAnnotations1 {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Club {
			Games[] value() default {};
	}

	@Games("GTA")
	@Games("Valorant")
	@Games("Minecraft")
	@Games("FortNite")
	@Games("PUBG")
	public @interface Game {
		String value();
	}

	@Repeatable(value = Club.class)
	public @interface Games {
		String value();
	}

	public static void main(String[] args) {
		Games[] a = Club.class.getAnnotationsByType(Games.class);
//		System.out.println(a.length);
		Club game = (Club) Game.class.getAnnotation(Club.class);
		for (Games m : game.value())
			System.out.println(m.value());
	}

}
