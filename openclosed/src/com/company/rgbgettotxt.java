package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class rgbgettotxt {
    public static void startmethod( String readfile, String modifyer){
        if (modifyer != ""){
            for (int xxx= 0; xxx<7;xxx++){
                startmethodsecond(xxx,readfile,modifyer);
            }
        }
    }
    public static void startmethodsecond(int constant,String readfile, String modifyer){
        switch (constant){
            case 1:  // get reference above door
                String exportstring = modifyer + "reference";
                secondmethod(exportstring,readfile, 567,  700, 116,  121);
                break;
            case 2:  // check neightboors door, check top is mostly browm
                String exportstring1 = modifyer + "checkdoor";
                secondmethod( exportstring1,readfile, 616,  668, 143,  277);
                break;
            case 3:  // check whitewall  might use to tell if night or day
                String exportstring2 = modifyer + "whitewall";
                secondmethod(exportstring2,readfile, 575,  595, 173,  193);
                break;
            case 4: // check mat
                String exportstring3= modifyer + "mat";
                secondmethod(exportstring3, readfile,548,  654, 396,  426);
                break;
            case 5: //refernce inside floor
                String expotstring4 = modifyer + "insidefloor";
                secondmethod(expotstring4,readfile,529,  646, 427,  449);
                break;
            case 6: // reference outside floor
                String exportstring5 = modifyer + "outsidefloor";
                secondmethod(exportstring5,readfile,551,  652, 377,  392);
            case 7: // entire door
                String exportstring6 = modifyer + "entiredoor";
                secondmethod(exportstring6,readfile,554,  661, 156,  436);
        }
    }
    private static void secondmethod(String exportfilestring,String readfile,int xstart, int xend,int ystart, int yend) {
        exportfilestring= "C:\\Users\\justi\\Documents\\Project saves\\openclosed\\"+ exportfilestring + ".txt";
        File exportfile = new File(exportfilestring);
        FileWriter writer = null;
        try {
            writer = new FileWriter(exportfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Reading the image
        File file= new File(readfile);
        if (file.exists()){
            BufferedImage img = null;
            try {
                img = ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int y = ystart; y < yend ;y++) {
                int test = 1+1;
                for (int x = xstart; x < xend; x++) {
                    //Retrieving contents of a pixel
                    int pixel = img.getRGB(x,y);
                    //Creating a Color object from pixel value
                    Color color = new Color(pixel, true);
                    //Retrieving the R G B values
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    try {
                        writer.append("Vertical: " + y + " Horizontal: " +x+"\n");
                        writer.append("                             R" +red+":");
                        writer.append("G" +green+":");
                        writer.append("B" +blue+"");
                        writer.append("\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Done!");
        }
    }
}
