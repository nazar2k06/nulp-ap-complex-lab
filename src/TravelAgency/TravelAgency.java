package TravelAgency;

import Main.Main;
import TravelAgency.TicketsManager.*;
import TravelAgency.TouristsManager.*;

public class TravelAgency {
	TicketsManager ticketsManager;
	TouristsManager touristsManager;

	TicketsManagerMenuCommand ticketsManagerMenuCommand;
	TouristsManagerMenuCommand touristsManagerMenuCommand;

	public TravelAgency() {
		ticketsManager = new TicketsManager();
		touristsManager = new TouristsManager();

		ticketsManagerMenuCommand = new TicketsManagerMenuCommand(ticketsManager);
		touristsManagerMenuCommand = new TouristsManagerMenuCommand(touristsManager);
	}

	public void menu() {
		while (true) {
			int menu_select = 0;

			System.out.println("\n --- Travel agency menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Tickets manager menu");
			System.out.println(" 2. Tourists manager menu");

			menu_select = Main.enterIntValue("Select an item:", 0, 2);
			System.out.println(" --- Travel agency menu --- ");

			switch (menu_select) {
				case 0:
					return;
				case 1:
					ticketsManagerMenuCommand.execute();
					break;
				case 2:
					touristsManagerMenuCommand.execute();
					break;
			}
		}
	}
}
