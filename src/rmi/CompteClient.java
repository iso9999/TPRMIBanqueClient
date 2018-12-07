package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CompteClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Compte cp = (Compte)Naming.lookup("rmi://localhost:1099/BK");
		
		System.out.println(cp.LireSolde());
		cp.Crediter(1000);
		System.out.println(cp.LireSolde());
		cp.Crediter(10);
		System.out.println(cp.LireSolde());
		cp.Debiter(2000);
		System.out.println(cp.LireSolde());
	}
}
