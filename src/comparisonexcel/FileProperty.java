/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparisonexcel;

import java.util.*;

/**
 *
 * @author Prabhat
 */
public class FileProperty {
    public String fileName;
    public String filePath;
    public float fileSize;
    public String fileExtension;
    public String fileRelativePath;
}

class FileData{
     public static String[] uiElement = new String[]{"File"};
     public static String[] imageFileExtension = new String[]{"png","jpeg","jpg","tif","gif"};
     public static String[] videoFileExtension = new String[]{"mp4", "m4a", "3gp","webm","flv"};
     public static String[] textFileExtension = new String[]{"txt","doc","pdf","tsv"};
     public static String[] mediaType = new String[]{"Image","Audio","Video","Text file"};
     public static String[] map = new String[]{"png,jpeg,jpg,tif,gif","mp4,m4a,3gp,webm,flv","txt,doc,pdf,tsv"};
}
