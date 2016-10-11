import java.util.Scanner;

/**
 * Created by Алина on 11.10.2016.
 */
public class Player {

    public int getPlayerTurnCoordinateX(){
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int getUserCoordinateX = Integer.parseInt(userInput);
        return  getUserCoordinateX;
    }
    public int getPlayerTurnCoordinateO() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int getUserCoordinateX = Integer.parseInt(userInput);
        return getUserCoordinateX;
    }

    public int selectYourPreferenceFigure(){
        System.out.println("Выберете крестик или нолик");
        Scanner scanner = new Scanner(System.in);
        String choise = scanner.nextLine();
        int getPlayerChoice = Integer.parseInt(choise);
        return getPlayerChoice;
    }

    public void setFigure(Figure figure){
        if (selectYourPreferenceFigure() == 1) {
            char playerFigure = figure.figureX;
        }

        if (selectYourPreferenceFigure() == 2) {
            char playerFigure = figure.figureO;
        } else {
            System.out.println("Вы ввели недопустимые значения");
    }
}
}