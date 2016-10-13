/**
 * Created by Алина on 11.10.2016.
 */
public class Field {

    public static final int SIZE = 3;
    private char[][] cells = new char[SIZE][SIZE];

    void initGameBoard(Figure figure) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = figure.defaultFigure;
            }
        }
    }

    void showGameBoard() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }

    void setRandomPoint(Point point) {
        point.getTwoRandomCoordinates();
        //TODO мы имеем переменную типа Point хранящуюю в себе 2 координаты как их поместить в массив и вывести на экран?
    }
}




