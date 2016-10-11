/**
 * Created by Алина on 11.10.2016.
 */
public class Main {
   static Figure figure = new Figure();
   static Field field = new Field();
   static Player player = new Player();
    public static void main(String[] args) {

        field.initGameBoard(figure);

        do {
            System.out.print("Введите ваши координаты: 2 точки с учетом того что начало отсчета начинаетсья с нуля");
            int xCoord = player.getPlayerTurnCoordinateX();
            int yCoord = player.getPlayerTurnCoordinateO();
            field.setPlayerFigure(xCoord,yCoord,figure,player);
            field.showGameBoard();
        } while (false);
    }
}
