/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.Lab5;
import java.io.*; 
import java.net.*;
import java.util.ArrayList;
/**
 *
 * @author sarah.vieda
 */
public class Cliente extends Thread{
  private static URL url;
  private static int n;
  private static ArrayList<Thread> listhread;
  
  public Cliente(URL url){
      this.url=url;
  }
  
  public static void main(String[] args) throws Exception { 
      URL url = new URL(args[0]); 
      n = Integer.parseInt(args[1]);
      listhread=new ArrayList<Thread>();
      for(int i=0;i<n;i++){
          listhread.add(new Cliente(url));
      }
      int cont=0;
      for (Thread t:listhread){
          t.start();
          cont++;
      }
      System.out.println("Numero de solicitudes ejecutadas "+cont);
        
    }
  
  @Override
  public void run(){
      try{
          BufferedReader reader = new BufferedReader(
          new InputStreamReader(url.openStream()));
          String inputLine = null; 
          while ((inputLine = reader.readLine()) != null) { 
            System.out.println(inputLine); 
          } 
       } catch (IOException x) { 
               System.err.println(x); 
       } 
  }
}
    

