package com.example.bank;

import java.io.File;

public class App {
    static void RecursivePrint(File[] arr, int index, int level)
    {
    	updateFile update =new updateFile();
    	
        // terminate condition
        if (index == arr.length)
            return;
  
        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");
  
        // for files
        if (arr[index].isFile()) {
            System.out.println(arr[index].getAbsolutePath());
        	String filePath = arr[index].getAbsolutePath();
        	update.fileUpdate(filePath);
        	
        }
        // for sub-directories
        else if(arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getAbsolutePath()
                               + "]");
           
  
            // recursion for sub-directories
            RecursivePrint(arr[index].listFiles(), 0,level + 1);
        }
  
        // recursion for main directory
        RecursivePrint(arr, ++index, level);
    }
  
    // Driver Method
    public static void main(String[] args)
    {
        // Provide full path for directory(change
        // accordingly)
        String maindirpath
            = "\\\\LT14-DBR1-IND\\Desktop";
  
        // File object
        File maindir = new File(maindirpath);
  
        if (maindir.exists() && maindir.isDirectory()) {
              
              // array for files and sub-directories
            // of directory pointed by maindir
            File arr[] = maindir.listFiles();
  
            System.out.println(
                "**********************************************");
            System.out.println(
                "Files from main directory : " + maindir);
            for(int t=0;t<arr.length;t++) {
            System.out.println(
                "**********************************************"+arr[t] );
            }
            // Calling recursive method
            //RecursivePrint(arr, 0, 0);
        }
    }
}