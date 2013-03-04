package com.cfuller.gdxgame001;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "gdx-game-001";
		cfg.useGL20 = true;
		cfg.x = 0;
		cfg.y = 1080 - 270 - 74;
		cfg.width = 480;
		cfg.height = 270;
		cfg.resizable = false;
		new LwjglApplication(new GdxGame001(), cfg);
	}
}
