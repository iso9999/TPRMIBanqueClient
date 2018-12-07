package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Compte extends Remote {
	public void Debiter(double c) throws RemoteException;
	public double LireSolde() throws RemoteException;
	public void Crediter(double c) throws RemoteException;
}
