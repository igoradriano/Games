package graficos;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Spritesheet {

    public BufferedImage spritesheet;

    public Spritesheet(String path){
        try{
            spritesheet = ImageIO.read(getClass().getResource(path));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /*
    Metodo que ir� retornar a sprite, os par�metros s�o, a posi��o x e y, e o tamanho width e height
     */
    public BufferedImage getSprite(int x, int y, int width, int height){
        return spritesheet.getSubimage(x, y, width, height);
    }
}
