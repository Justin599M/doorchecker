package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class lefttoright {
BufferedImage targetimage;
ArrayList<Integer> case1R;
ArrayList<Integer> case2R;
ArrayList<Integer> case3R;
ArrayList<Integer> case4R;
ArrayList<Integer> case5R;
ArrayList<Integer> case6R;
ArrayList<Integer> case7R;
ArrayList<Integer> case8R;
ArrayList<Integer> case9R;
ArrayList<Integer> case10R;
ArrayList<Integer> case11R;
ArrayList<Integer> case12R;
ArrayList<Integer> case13R;
ArrayList<Integer> case1G;
ArrayList<Integer> case2G;
ArrayList<Integer> case3G;
ArrayList<Integer> case4G;
ArrayList<Integer> case5G;
ArrayList<Integer> case6G;
ArrayList<Integer> case7G;
ArrayList<Integer> case8G;
ArrayList<Integer> case9G;
ArrayList<Integer> case10G;
ArrayList<Integer> case11G;
ArrayList<Integer> case12G;
ArrayList<Integer> case13G;
ArrayList<Integer> case1B;
ArrayList<Integer> case2B;
ArrayList<Integer> case3B;
ArrayList<Integer> case4B;
ArrayList<Integer> case5B;
ArrayList<Integer> case6B;
ArrayList<Integer> case7B;
ArrayList<Integer> case8B;
ArrayList<Integer> case9B;
ArrayList<Integer> case10B;
ArrayList<Integer> case11B;
ArrayList<Integer> case12B;
ArrayList<Integer> case13B;
int result;
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
int case7avgR;
int case7avgG;
int case7avgB;
int case8avgR;
int case8avgG;
int case8avgB;
int case9avgR;
int case9avgG;
int case9avgB;
int case10avgR;
int case10avgG;
int case10avgB;
int case11avgR;
int case11avgG;
int case11avgB;
int case12avgR;
int case12avgG;
int case12avgB;
int case13avgR;
int case13avgG;
int case13avgB;
File processfile;
                                                                // TODO add check to see if R and G and B values are similar
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
        case7avgR = getaverage(case7R);
        case7avgG = getaverage(case7G);
        case7avgB = getaverage(case7B);
        case8avgR = getaverage(case8R);
        case8avgG = getaverage(case8G);
        case8avgB = getaverage(case8B);
        case9avgR = getaverage(case9R);
        case9avgG = getaverage(case9G);
        case9avgB = getaverage(case9B);
        case10avgR = getaverage(case10R);
        case10avgG = getaverage(case10G);
        case10avgB = getaverage(case10B);
        case11avgR = getaverage(case11R);
        case11avgG = getaverage(case11G);
        case11avgB = getaverage(case11B);
        case12avgR = getaverage(case12R);
        case12avgG = getaverage(case12G);
        case12avgB = getaverage(case12B);
        case13avgR = getaverage(case12R);
        case13avgG = getaverage(case12G);
        case13avgB = getaverage(case12B);
    }
    public void exportmethod(String modifyer){
            String exportstring = "C:\\Users\\justi\\Documents\\Project saves\\openclosed\\"+ modifyer + "lefttoright.txt";
            File exportfile = new File(exportstring);
            try {
                FileWriter exportwriter = new FileWriter(exportfile,false);
                exportwriter.write("case1 R:" +  case1avgR +"\n");
                exportwriter.write("case1 G:" +  case1avgG+ "\n");
                exportwriter.write("case1 B:" +  case1avgB+ "\n\n");
                exportwriter.write("case2 R:" +  case2avgR +"\n");
                exportwriter.write("case2 G:" +  case2avgG+ "\n");
                exportwriter.write("case2 B:" +  case2avgB+ "\n\n");
                exportwriter.write("case3 R:" +  case3avgR +"\n");
                exportwriter.write("case3 G:" +  case3avgG+ "\n");
                exportwriter.write("case3 B:" +  case3avgB+ "\n\n");
                exportwriter.write("case4 R:" +  case4avgR +"\n");
                exportwriter.write("case4 G:" +  case4avgG+ "\n");
                exportwriter.write("case4 B:" +  case4avgB+ "\n\n");
                exportwriter.write("case5 R:" +  case5avgR +"\n");
                exportwriter.write("case5 G:" +  case5avgG+ "\n");
                exportwriter.write("case5 B:" +  case5avgB+ "\n\n");
                exportwriter.write("case6R:" +  case6avgR +"\n");
                exportwriter.write("case6G:" +  case6avgG+ "\n");
                exportwriter.write("case6B:" +  case6avgB+ "\n\n");
                exportwriter.write("case7R:" +  case7avgR +"\n");
                exportwriter.write("case7G:" +  case7avgG+ "\n");
                exportwriter.write("case7B:" +  case7avgB+ "\n\n");
                exportwriter.write("case8R:" +  case8avgR +"\n");
                exportwriter.write("case8G:" +  case8avgG+ "\n");
                exportwriter.write("case8B:" +  case8avgB+ "\n\n");
                exportwriter.write("case9R:" +  case9avgR +"\n");
                exportwriter.write("case9G:" +  case9avgG+ "\n");
                exportwriter.write("case9B:" +  case9avgB+ "\n\n");
                exportwriter.write("case10R:" +  case10avgR +"\n");
                exportwriter.write("case10G:" +  case10avgG+ "\n");
                exportwriter.write("case10B:" +  case10avgB+ "\n\n");
                exportwriter.write("case11R:" +  case11avgR +"\n");
                exportwriter.write("case11G:" +  case11avgG+ "\n");
                exportwriter.write("case11B:" +  case11avgB+ "\n\n");
                exportwriter.write("case12R:" +  case12avgR +"\n");
                exportwriter.write("case12G:" +  case12avgG+ "\n");
                exportwriter.write("case12B:" +  case12avgB+ "\n\n");
                exportwriter.write("case13R:" +  case13avgR +"\n");
                exportwriter.write("case13G:" +  case13avgG+ "\n");
                exportwriter.write("case13B:" +  case13avgB+ "\n\n");
                exportwriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    private void initalize(String readfile){
        processfile = new File(readfile);
        case1R = new ArrayList<Integer>();
        case2R = new ArrayList<Integer>();
        case3R = new ArrayList<Integer>();
        case4R = new ArrayList<Integer>();
        case5R = new ArrayList<Integer>();
        case6R = new ArrayList<Integer>();
        case7R = new ArrayList<Integer>();
        case8R = new ArrayList<Integer>();
        case9R = new ArrayList<Integer>();
        case10R = new ArrayList<Integer>();
        case11R = new ArrayList<Integer>();
        case12R = new ArrayList<Integer>();
        case13R = new ArrayList<Integer>();
        case1R = new ArrayList<Integer>();
        case1G = new ArrayList<Integer>();
        case2G = new ArrayList<Integer>();
        case3G = new ArrayList<Integer>();
        case4G = new ArrayList<Integer>();
        case5G = new ArrayList<Integer>();
        case6G = new ArrayList<Integer>();
        case7G = new ArrayList<Integer>();
        case8G = new ArrayList<Integer>();
        case9G = new ArrayList<Integer>();
        case10G = new ArrayList<Integer>();
        case11G = new ArrayList<Integer>();
        case12G = new ArrayList<Integer>();
        case13G = new ArrayList<Integer>();
        case1B = new ArrayList<Integer>();
        case2B = new ArrayList<Integer>();
        case3B = new ArrayList<Integer>();
        case4B = new ArrayList<Integer>();
        case5B = new ArrayList<Integer>();
        case6B = new ArrayList<Integer>();
        case7B = new ArrayList<Integer>();
        case8B = new ArrayList<Integer>();
        case9B = new ArrayList<Integer>();
        case10B = new ArrayList<Integer>();
        case11B = new ArrayList<Integer>();
        case12B = new ArrayList<Integer>();
        case13B = new ArrayList<Integer>();
    }
    public int publicstart(String readfile, String modifyer){
        initalize(readfile);
        if (processfile.exists()){
            try {
                targetimage =  ImageIO.read(processfile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            case1method(); // far left
            case2method();
            case3method( 580,  590, 225,  515);
            case4method( 590,  600, 225,  515);
            case5method( 600,  610, 225,  515);
            case6method(610,  620, 225,  515);
            case7method(620,  630, 225,  515);
            case8method(630,  640, 225,  515);
            case9method(640,  650, 225,  515);
            case10method(650,  660, 225,  515);
            case11method(660,  680, 225,  515);
            case12method(670,  680, 225,  515);
            case13method(680,  690, 225,  515); //far right
            getaverages();
            result = righttoleftcheck();
            exportmethod(modifyer);
    }
        return result;
    }
    private void case1method(){

        for (int x = 560; x < 570; x++){
            for (int y = 225; y < 365; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case1R.add(color.getRed());
                case1G.add(color.getGreen());
                case1B.add(color.getBlue());
            }
        }
        for (int x = 560; x < 570; x++){
            for (int y = 405; y < 515; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case1R.add(color.getRed());
                case1G.add(color.getGreen());
                case1B.add(color.getBlue());
            }
        }
    }
    private void case2method(){

        for (int x = 570; x < 580; x++){
            for (int y = 225; y < 365; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case2R.add(color.getRed());
                case2G.add(color.getGreen());
                case2B.add(color.getBlue());
            }
        }
        for (int x = 570; x < 580; x++){
            for (int y = 405; y < 515; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case2R.add(color.getRed());
                case2G.add(color.getGreen());
                case2B.add(color.getBlue());
            }
        }
    }
    private void case3method(int startx,int endx,int starty, int endy){
        
        for (int x = startx; x < endx; x++) {
            for (int y = starty; y < endy; y++) {
                int pixel = targetimage.getRGB(x, y);
                Color color = new Color(pixel, true);
                case3R.add(color.getRed());
                case3G.add(color.getGreen());
                case3B.add(color.getBlue());
            }
        }
    }
    private void case4method(int startx,int endx,int starty, int endy){
        
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
    private void case5method(int startx,int endx,int starty, int endy){
        
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
    private void case6method(int startx,int endx,int starty, int endy){
        
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
    private void case7method(int startx,int endx,int starty, int endy){
        
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case7R.add(color.getRed());
                case7G.add(color.getGreen());
                case7B.add(color.getBlue());
            }
        }
    }
    private void case8method(int startx,int endx,int starty, int endy){
        
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case8R.add(color.getRed());
                case8G.add(color.getGreen());
                case8B.add(color.getBlue());
            }
        }
    }
    private void case9method(int startx,int endx,int starty, int endy){
        
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case9R.add(color.getRed());
                case9G.add(color.getGreen());
                case9B.add(color.getBlue());
            }
        }
    }
    private void case10method(int startx,int endx,int starty, int endy){
        
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case10R.add(color.getRed());
                case10G.add(color.getGreen());
                case10B.add(color.getBlue());
            }
        }
    }
    private void case11method(int startx,int endx,int starty, int endy){
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case11R.add(color.getRed());
                case11G.add(color.getGreen());
                case11B.add(color.getBlue());
            }
        }
    }
    private void case12method(int startx,int endx,int starty, int endy){
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case12R.add(color.getRed());
                case12G.add(color.getGreen());
                case12B.add(color.getBlue());
            }
        }
    }
    private void case13method(int startx,int endx,int starty, int endy){
        for (int x = startx; x < endx; x++){
            for (int y = starty; y < endy; y++){
                int pixel = targetimage.getRGB(x,y);
                Color color = new Color(pixel,true);
                case13R.add(color.getRed());
                case13G.add(color.getGreen());
                case13B.add(color.getBlue());
            }
        }
    }
    private int righttoleftcheck(){
        int ind;
        int forcount = 0;
        int sensitivity = 10;
        int sensitivityop = sensitivity*2 + 1;
        int op1 = case13avgR - sensitivity;
        int op2 = op1 + sensitivityop;

        for(ind = op1;ind < op2; ind++){
            if (ind == case12avgR){
                forcount = 1;
                op1 = op2;
            }
        }
        if (forcount == 1){
            op1 = case12avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case11avgR){
                    forcount = 2;
                    op1 = op2;
                }
            }
        }
        if (forcount == 2){
            op1 = case11avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case10avgR){
                    forcount = 3;
                    op1 = op2;
                }
            }
        }
        if (forcount == 3){
            op1 = case10avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case9avgR){
                    forcount = 4;
                    op1 = op2;
                }
            }
        }
        if (forcount == 4){
            op1 = case9avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case8avgR){
                    forcount = 5;
                    op1 = op2;
                }
            }
        }
        if (forcount == 5){
            op1 = case8avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case7avgR){
                    forcount = 6;
                    op1 = op2;
                }
            }
        }
        if (forcount == 6){
            op1 = case7avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case6avgR){
                    forcount = 7;
                    op1 = op2;
                }
            }
        }
        if (forcount == 7){
            op1 = case6avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case5avgR){
                    forcount = 8;
                    op1 = op2;
                }
            }
        }
        if (forcount == 8){
            op1 = case5avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case4avgR){
                    forcount = 9;
                    op1 = op2;
                }
            }
        }
        if (forcount == 9){
            op1 = case4avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case3avgR){
                    forcount = 10;
                    op1 = op2;
                }
            }
        }
        if (forcount == 10){
            op1 = case3avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case2avgR){
                    forcount = 11;
                    op1 = op2;
                }
            }
        }
        if (forcount == 11){
            op1 = case2avgR - sensitivity;
            op2 = op1 + sensitivityop;
            for (ind = op1;ind < op2; ind++){
                if (ind == case1avgR){
                    forcount = 12;
                    op1 = op2;
                }
            }
        }
        return forcount;
    }

}
