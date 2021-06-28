package proj;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class HotelServer extends UnicastRemoteObject implements RoomManager {

	private static final long serialVersionUID = 1L;

	public HotelServer() throws RemoteException {
		super();
	}

	public static void main(String[] args) throws RemoteException {

		LocateRegistry.createRegistry(2335);
		HotelServer h = new HotelServer();
		Naming.rebind("//localhost:2335/room", h);
		System.out.println("\n Servidor Hotel pronto.");

	}

}
