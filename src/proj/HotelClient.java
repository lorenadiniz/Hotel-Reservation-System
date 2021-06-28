package proj;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class HotelClient {
	public static void main(String[] args) {
		RoomManager roomManager;
		Scanner sc = new Scanner(System.in);

		Room room0 = new Room(0, 10, 55.00);
		Room room1 = new Room(1, 20, 75.00);
		Room room2 = new Room(2, 5, 80.00);
		Room room3 = new Room(3, 3, 150.00);
		Room room4 = new Room(4, 2, 230.00);

		int type = sc.nextInt();
		while (type >= 0 && type <= 4) {
			System.out.println(
					"======================= \n" + room0 + " rooms of type 0 are available for 55 Euros per night\r\n"
							+ room1 + " rooms of type 1 are available for 75 Euros per night\r\n" + room2
							+ " rooms of type 2 are available for 80 Euros per night\r\n" + room3
							+ " rooms of type 3 are available for 150 Euros per night\r\n" + room4
							+ " rooms of type 4 are available for 230 Euros per night");

		}

		roomManager = (RoomManager) Naming.lookup("rmi://localhost:2335/room");
		if (type == 0) {
			room0.getreserva();
			System.out.println("\n Quarto tipo 0 reservado, valor de 55 euros por noite!");

		} else if (type == 1) {
			room1.getreserva();
			System.out.println("\n Quarto tipo 1 reservado, valor de 75 euros por noite!");
		} else if (type == 2) {
			room1.getreserva();
			System.out.println("\n Quarto tipo 2 reservado, valor de 80 euros por noite!");
		} else if (type == 3) {
			room1.getreserva();
			System.out.println("\n Quarto tipo 3 reservado, valor de 150 euros por noite!");
		} else if (type == 4) {
			room1.getreserva();
			System.out.println("\n Quarto tipo 4 reservado, valor de 230 euros por noite!");
		}
	}

}
