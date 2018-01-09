import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture {
	public int[] pixels;
	private String loc;
	public final int SIZE;
	
	public Texture(String location, int size) {
		loc = location;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}
	
	private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Texture wood = new Texture("res/wood.jpg", 64);
	public static Texture brick = new Texture("res/redbrick.jpg", 64);
	public static Texture bluestone = new Texture("res/bluestone.jpg", 64);
	public static Texture stone = new Texture("res/greystone.jpg", 64);
	
	public static Texture Wolf3D_wood = new Texture("res/Wolf3D/wood.png", 64);
	public static Texture Wolf3D_brick = new Texture("res/Wolf3D/redbrick.png", 64);
	public static Texture Wolf3D_bluestone = new Texture("res/Wolf3D/bluestone.png", 64);
	public static Texture Wolf3D_stone = new Texture("res/Wolf3D/greystone.png", 64);
	
	public static Texture Wolf3D_colorstone = new Texture("res/Wolf3D/colorstone.png", 64);
	public static Texture Wolf3D_purplestone = new Texture("res/Wolf3D/purplestone.png", 64);
	public static Texture Wolf3D_mossy = new Texture("res/Wolf3D/mossy.png", 64);
	
}
