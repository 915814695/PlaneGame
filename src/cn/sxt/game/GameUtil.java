package cn.sxt.game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;


public class GameUtil {
	private GameUtil() {
		
	}
	
	public static Image getImage(String path) {
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(GameUtil.class.getResource(path));
		}catch(IOException e){
			e.printStackTrace();
		}
		return bi;
	}
}
