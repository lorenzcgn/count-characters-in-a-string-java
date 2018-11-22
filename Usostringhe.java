/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usostringhe;
import java.io.*;


public class Usostringhe {


    public static void main(String[] args) {
        
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader(input);
        String s="", smaiuscola="";
        try{
        s=tastiera.readLine();
        }catch (IOException e) {}
        
        smaiuscola=s.toUpperCase();
        System.out.println(smaiuscola );
        System.out.println(s.length());
        
        for (int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        
        System.out.println(s.substring(4));
        
        
    
}}
