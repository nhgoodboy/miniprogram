package others;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageTest {

    @Test
    public void test() throws IOException {
//        Thumbnails.of(new File("E:/test.png"))
//                .size(200, 200)
//                .toFile(new File("./test-copy.png"));

        BufferedImage originalImage = ImageIO.read(new File("E:/test.png"));

        BufferedImage thumbnail = Thumbnails.of(originalImage)
                .height(2000)
                .asBufferedImage();
//        BufferedImage newImage = Thumbnails.of(originalImage)
//                .sourceRegion(Positions.CENTER,200,200).size(200, 200)
//                .asBufferedImage();
        File file = new File("src/main/resources/images/test-copy.png");
        if (null != file) {
            ImageIO.write(thumbnail, "png", file);
        }
    }

    @Test
    public void test2() throws IOException {
        String imagePath = "src/main/resources/images/test-copy7.png";
        BufferedImage image = ImageIO.read(new File(imagePath));
        Thumbnails.Builder<BufferedImage> builder;

        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        if ((float)400 / 300 != (float)imageWidth / imageHeight) {
            if (imageWidth > imageHeight) {
                image = Thumbnails.of(imagePath).height(300).asBufferedImage();
            } else {
                image = Thumbnails.of(imagePath).width(400).asBufferedImage();
            }
            builder = Thumbnails.of(image).sourceRegion(Positions.CENTER, 400, 300).size(400, 300);
        } else {
            builder = Thumbnails.of(image).size(400, 300);
        }
        builder.outputFormat("png").toFile("src/main/resources/images/test-copy8");
    }
}
