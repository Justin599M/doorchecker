package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class imageprocesser {
String confidence;
BufferedImage targetimage;
ArrayList<Integer> case1R;
ArrayList<Integer> case2R;
ArrayList<Integer> case3R;
ArrayList<Integer> case4R;
ArrayList<Integer> case5R;
ArrayList<Integer> case6R;
ArrayList<Integer> case1G;
ArrayList<Integer> case2G;
ArrayList<Integer> case3G;
ArrayList<Integer> case4G;
ArrayList<Integer> case5G;
ArrayList<Integer> case6G;
ArrayList<Integer> case1B;
ArrayList<Integer> case2B;
ArrayList<Integer> case3B;
ArrayList<Integer> case4B;
ArrayList<Integer> case5B;
ArrayList<Integer> case6B;
int righttoleftstop;
int case1avgR;
int case1avgG;
int case1avgB;
int case2avgR;
int case2avgG;
int case2avgB;
int case3avgR;
int case3avgG;
int case3avgB;
int case4avgR;
int case4avgG;
int case4avgB;
int case5avgR;
int case5avgG;
int case5avgB;
int case6avgR;
int case6avgG;
int case6avgB;
String matrefstring;
    private int getaverage(ArrayList<Integer> input){
        int lenght = input.size();
        int total = 0;
        int curint;
            for (int index =0; index<lenght;index++){
                curint = input.get(index);
                total = total + curint;
            }
        int returnint = total/lenght;
            return  returnint;
        }
    private void getaverages(){
        case1avgR = getaverage(case1R);
        case1avgG = getaverage(case1G);
        case1avgB = getaverage(case1B);
        case2avgR = getaverage(case2R);
        case2avgG = getaverage(case2G);
        case2avgB = getaverage(case2B);
        case3avgR = getaverage(case3R);
        case3avgG = getaverage(case3G);
        case3avgB = getaverage(case3B);
        case4avgR = getaverage(case4R);
        case4avgG = getaverage(case4G);
        case4avgB = getaverage(case4B);
        case5avgR = getaverage(case5R);
        case5avgG = getaverage(case5G);
        case5avgB = getaverage(case5B);
        case6avgR = getaverage(case6R);
        case6avgG = getaverage(case6G);
        case6avgB = getaverage(case6B);
    }
    private void exportmethod(boolean tf,String modifyer){
        if (modifyer != ""){
            String exportstring = "C:\\Users\\justi\\Documents\\Project saves\\openclosed\\"+ modifyer + "referenceprocesser.txt";
            File exportfile = new File(exportstring);
            try {
                FileWriter exportwriter = new FileWriter(exportfile,true);
                exportwriter.write("AboveDoor R:" +  case1avgR +"\n");
                exportwriter.write("AboveDoor G:" +  case1avgG+ "\n");
                exportwriter.write("AboveDoor B:" +  case1avgB+ "\n\n");
                exportwriter.write("Neighboors door R:" +  case2avgR +"\n");
                exportwriter.write("Neighboors door G:" +  case2avgG+ "\n");
                exportwriter.write("Neighboors door B:" +  case2avgB+ "\n\n");
                exportwriter.write("Whitewall R:" +  case3avgR +"\n");
                exportwriter.write("Whitewall G:" +  case3avgG+ "\n");
                exportwriter.write("Whitewall B:" +  case3avgB+ "\n\n");
                exportwriter.write("Mat R:" +  case4avgR +"\n");
                exportwriter.write("Mat G:" +  case4avgG+ "\n");
                exportwriter.write("Mat B:" +  case4avgB+ "\n\n");
                exportwriter.write("Door shadow R:" +  case5avgR +"\n");
                exportwriter.write("Door shadow G:" +  case5avgG+ "\n");
                exportwriter.write("Door shadow B:" +  case5avgB+ "\n\n");
                exportwriter.write("Inside floor R:" +  case6avgR +"\n");
                exportwriter.write("Inside floor G:" +  case6avgG+ "\n");
                exportwriter.write("Inside floor  B:" +  case6avgB+ "\n\n");
                exportwriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("Not exporting!");
        }

        }
    private void initalize(){
        case1R = new ArrayList<Integer>();
        case2R = new ArrayList<Integer>();
        case3R = new ArrayList<Integer>();
        case4R = new ArrayList<Integer>();
        case5R = new ArrayList<Integer>();
        case6R = new ArrayList<Integer>();
        case1R = new ArrayList<Integer>();
        case1G = new ArrayList<Integer>();
        case2G = new ArrayList<Integer>();
        case3G = new ArrayList<Integer>();
        case4G = new ArrayList<Integer>();
        case5G = new ArrayList<Integer>();
        case6G = new ArrayList<Integer>();
        case1B = new ArrayList<Integer>();
        case2B = new ArrayList<Integer>();
        case3B = new ArrayList<Integer>();
        case4B = new ArrayList<Integer>();
        case5B = new ArrayList<Integer>();
        case6B = new ArrayList<Integer>();
    }
    public void startmethod(String readfile,String modifyer) {
            initalize();
            lefttoright righttoleft = new lefttoright();
            righttoleftstop = righttoleft.publicstart(readfile, modifyer);
            File targetfile = new File(readfile);
            if (targetfile.exists()){
                try {
                    targetimage =  ImageIO.read(targetfile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            case1method(readfile, 548,  705, 200,  212);// get reference above door  use
            case2method(readfile, 612,  666, 226,  247);// check neightboors door, check top is mostly brown
            case3method(readfile, 565,  588, 272,  292);// check whitewall  might use to tell if night or day
            case4method(readfile,568,  671, 497,  512);// check mat
            case5method(readfile,705,  710, 443,  570);//door shadow
            case6method(readfile,562,  672, 528,  545);// reference inside floor
            getaverages();
            exportmethod(true,modifyer);
            matrefstring = matref();
                System.out.println("right to left: " +righttoleftstop);
            }else {
                System.out.println("File not found!");
            }
            decsion();
    }
    private void case1method( String processfilestring,int startx,int endx,int starty, int endy){
        File processfile = new File(processfilestring);
        for (int x = startx; x < endx; x++) {
            for (int y = starty; y < endy; y++) {
            int pixel = targetimage.getRGB(x, y);
                Color color = new Color(pixel, true);
                case1R.add(color.getRed());
                case1G.add(color.getGreen());
                case1B.add(color.getBlue());
            }
        }
    }
    private void case2method( String processfilestring,int startx,int endx,int starty, int endy){
        File processfile = new File(processfilestring);
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
            int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case2R.add(color.getRed());
                case2G.add(color.getGreen());
                case2B.add(color.getBlue());
            }
        }
    }
    private void case3method( String processfilestring,int startx,int endx,int starty, int endy){
        File processfile = new File(processfilestring);
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
            int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case3R.add(color.getRed());
                case3G.add(color.getGreen());
                case3B.add(color.getBlue());
            }
        }
    }
    private void case4method( String processfilestring,int startx,int endx,int starty, int endy){
        File processfile = new File(processfilestring);
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
            int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case4R.add(color.getRed());
                case4G.add(color.getGreen());
                case4B.add(color.getBlue());
            }
        }
    }
    private void case5method( String processfilestring,int startx,int endx,int starty, int endy){
        File processfile = new File(processfilestring);
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
            int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case5R.add(color.getRed());
                case5G.add(color.getGreen());
                case5B.add(color.getBlue());
            }
        }
    }
    private void case6method( String processfilestring,int startx,int endx,int starty, int endy){
        File processfile = new File(processfilestring);
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
            int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case6R.add(color.getRed());
                case6G.add(color.getGreen());
                case6B.add(color.getBlue());
            }
        }
    }
    private String matref(){
        // if mat is lower than door <--
        int sensitvity = 20;
        int op1 = case6avgR - sensitvity;
        if (op1 > case4avgR){
            return "open20"; // reads open
        }else {
            return "closed20"; // reads closed
        }

    }
    private void decsion(){
        //use whitewall to detect if person is in doorway
        if (righttoleftstop == 12 && matrefstring == "closed20"){
            confidence = "high";
            System.out.println("closed, high confidence");
        }
        if (righttoleftstop == 12 && matrefstring == "open20"){
            confidence = "low";
            System.out.println("closed, low confidence");
        }
        if (righttoleftstop != 12 && matrefstring == "open20"){
            confidence = "high";
            System.out.println("open,high confidence");
        }
        if (righttoleftstop != 12 && matrefstring == "closed20"){
            confidence = "low";
            System.out.println("closed, low confidence");
        }
    }
}
