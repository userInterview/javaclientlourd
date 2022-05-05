package RMI;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("deprecation")
public class Main {
	

	//static Registry registry ;
	
	
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			String ip = "localhost" ;		
			ChatServer objChatServer = new ChatServer();
			Naming.rebind("rmi://" + ip + "/chat", objChatServer);
			System.out.println("rmi://" + ip + "/chat");
			System.out.println("[System] Chat Server is ready.");
			
		} catch (Exception e) {
			System.out.println("Echec de démarrage du serveur de chat: " + e);
		}
	}
}