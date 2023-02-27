/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.model;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import co.edu.unbosque.view.Consola;

/**
 *
 * @author englinx
 */
public class Servidor {
    //initialize socket and input stream 
    private Socket socket=null; //This socket is for read client message
    private Socket socketR=null;//This socket is for send a message to client
    private ServerSocket server=null;
    private DataInputStream in=null;
    private DataOutputStream out=null;
    private int	port = 7000;
    private String addressClient;
    private Consola cons;
    private CandidatosDAO candao;
  
    
    public Servidor() {
		cons = new Consola();
    candao = new CandidatosDAO();	
	}
    
  
    public void stat(){
    
      
        String line = ""; 
        int aux1; 
        boolean aux2 = false;

        while (!line.equals("Over")) 
        { 
            try { 
            	this.server = new ServerSocket(this.port);
    			cons.imprimirString("Servidor abierto"); 
    	        cons.imprimirString("Esperando usuario ..."); 
    	        this.socket = server.accept(); 
    	        cons.imprimirString("Usuario  aceptado"); 
    	        // takes input from the client socket 
    	        this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream())); 
            	
            	line = in.readUTF(); 
            
            	
                //Print in server the client message
            	
        
            	
            	aux1=candao.buscadorCedu(Long.parseLong(line)); 
            	
            	if (aux1==-1 ) {
            	
            		 cons.imprimirString("No se encontro ningun candidato con esa cedula");
            		 aux2 = false;
				}else {
					cons.imprimirString( candao.mostrar(aux1)); 
					 aux2 = true;
				}
            
           
               
                
                //Send message to the client
                //Create a socket to send message to client
            	this.socketR=new Socket(this.socket.getInetAddress(), this.port+1);
            	//sends output to the socket to client
                this.out = new DataOutputStream(socketR.getOutputStream()); 
                
                if (aux2== false) {
					 this.out.writeUTF("No se encontro ningun candidato con esa cedula");	


				}else {
					
					 this.out.writeUTF(candao.mostrar(aux1));	
				}
               
                this.out.close();
                this.socketR.close();
                
                this.in.close();
                this.server.close();
            }catch (NumberFormatException e) {
            	try {
            		

            		this.socketR=new Socket(this.socket.getInetAddress(), this.port+1);
            		//sends output to the socket to client
            	    this.out = new DataOutputStream(socketR.getOutputStream()); 
            	    this.out.writeUTF("Error");
            	    
            	    
            	    this.out.close();
            	    this.socketR.close();
            	    this.in.close();
            	    System.out.println("CERRO SERVER"); 
            	    this.server.close();
            		} catch (Exception e2) {
            			// TODO: handle exception
            		}
            	}  catch(IOException i) {
            
                cons.imprimirString("Jueputa"); 
                
          
        } 
        cons.imprimirString("Closing connection"); 

        // close connection 
        try {
			socket.close();
			in.close(); 
		} catch (IOException e) {
	  
			e.printStackTrace();
		} 
    	
    }
  
    
    }}
    	
    
    

    

