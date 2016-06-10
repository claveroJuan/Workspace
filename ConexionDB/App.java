package cl.curso.java.login_app;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

/**
 * Hello world!
 *
 */

public class App {

	public static void main(String[] args) throws IOException {
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(WebcamResolution.VGA.getSize());
		webcam.open();
		ImageIO.write(webcam.getImage(), "PNG", new File("C:/Users/JuanClavero/Desktop/BD/test.png"));
	}
}
