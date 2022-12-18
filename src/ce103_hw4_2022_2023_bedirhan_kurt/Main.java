package ce103_hw4_2022_2023_bedirhan_kurt;

public class Main {

	public static void main(String[] args) {
		String[] mainOptions = {"1. Option 1",
								"2. Option 2",
								"3. Option 3",
								"4. Exit",
		};
		String mainPrompt = "Enter an option (Default is 4): ";
		int mainChosen = MenuConstructor.printMenu(mainOptions, mainPrompt);
		switch (mainChosen) {
		case 1: optionOne(); break;
		case 2: optionTwo(); break;
		case 3: optionThree(); break;
		case 4: System.exit(0);
		}
	}
	
	private static void optionOne() {
		// First option is chosen.
	}
	
	private static void optionTwo() {
		// Second option is chosen.
	}
	
	private static void optionThree() {
		// Third option is chosen.
	}

}
