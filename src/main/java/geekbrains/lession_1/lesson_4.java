package geekbrains.lession_1;

import java.util.Random;
import java.util.Scanner;

public class lesson_4 { // Мне по работе немного помогал друг, так что считать полностью моей не стоит. Немного накосячил с проверками и некоторые места после уже с ним упростили.
    public static final int FIELD_SIZE = 5;  // размер игрового поля
    public static final int CELL_TO_WIN = 5;  // сколько ячеек нужно подряд заполнить, чтобы победить
    public static final char EMPTY_CELL = '.';  // заполнитель для пустой ячейки
    public static final char PLAYER_CELL = 'X';  // отображаемый символ, которым играет игрок
    public static final char II_CELL = 'O';  // отображаемый символ, которым играет ии

    public static Scanner input = new Scanner(System.in);
    public static char[][] gameField;  // игровое поле

    public static void initGameField() {
        gameField = new char[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                gameField[i][j] = EMPTY_CELL;
            }
        }
    }

    public static void printGameField() {
        for (int i = 0; i <= gameField.length; i++) {  // распечатываем координату X
            System.out.print(i == 0 ? "  " : i + " ");
        }
        System.out.println();
        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + " ");  // распечатываем координату Y
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellAvailable(int x, int y) {
        return x >= 0 && x < FIELD_SIZE && y >= 0 && y < FIELD_SIZE && gameField[y][x] == EMPTY_CELL;  // корректность координат по условию с возвращением true
    }

    public static void playerMove() {
        int x, y;
        do {
            System.out.printf("Введите координаты хода через пробел в формате X(= от 1 до %d) Y(= от 1 до %d):\n", FIELD_SIZE, FIELD_SIZE);
            x = Integer.valueOf(input.next()) - 1;
            y = Integer.valueOf(input.next()) - 1;
        } while (!isCellAvailable(x, y));
        gameField[y][x] = PLAYER_CELL;
    }

    public static void IIMove() {
        int x, y;
        do {
            x = new Random().nextInt(FIELD_SIZE);
            y = new Random().nextInt(FIELD_SIZE);
        } while (!isCellAvailable(x, y));
        System.out.println("ИИ походил в ячейку " + (x + 1) + " " + (y + 1));
        gameField[y][x] = II_CELL;
    }

    public static boolean isWin(char playerCell) {
        int horizontal, vertical;
        int diagMain, diagReverse;
        for (int i = 0; i < FIELD_SIZE; i++) {
            horizontal = 0;
            vertical = 0;
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (gameField[i][j] == playerCell) {  // проверяем горизонтальные линии
                    horizontal++;
                } else if (gameField[i][j] != playerCell && horizontal < CELL_TO_WIN) {
                    horizontal = 0;
                }
                if (gameField[j][i] == playerCell) {  // проверяем вертикальные линии
                    vertical++;
                }   else if (gameField[j][i] != playerCell && vertical < CELL_TO_WIN) {
                    vertical = 0;
                }
            }
            if (horizontal >= CELL_TO_WIN || vertical >= CELL_TO_WIN) {
                System.out.println("По горизонтали или вертикали " + horizontal + " " + vertical);
                return true;
            }
        }

        for (int j = 0; j < FIELD_SIZE; j++) {
            diagMain = 0;
            for (int i = 0; i < FIELD_SIZE; i++) {
                int k = j + i;
                if (k < FIELD_SIZE) {
                    if (gameField[i][k] == playerCell) {  // проверяем главную диагональ от центральной оси вправо
                        diagMain++;
                    } else if (gameField[i][k] != playerCell && diagMain < CELL_TO_WIN) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= CELL_TO_WIN) {
                    System.out.println("По главной диагонали от центральной оси вправо " + diagMain);
                    return true;
                }
            }
        }
        for (int j = 1; j < FIELD_SIZE; j++) {
            diagMain = 0;
            for (int i = 0; i < FIELD_SIZE; i++) {
                int k = j + i;
                if (k < FIELD_SIZE) {
                    if (gameField[k][i] == playerCell) {  // проверяем главную диагональ от центральной оси вниз
                        diagMain++;
                    } else if (gameField[k][i] != playerCell && diagMain < CELL_TO_WIN) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= CELL_TO_WIN) {
                    System.out.println("По главной диагонали от центральной оси вниз " + diagMain);
                    return true;
                }
            }
        }
        for (int j = 0; j < FIELD_SIZE; j++) {
            diagReverse = 0;
            for (int i = 0; i < FIELD_SIZE; i++) {
                int k = (FIELD_SIZE - 1) - i;
                int l = j + i;
                if (k >= 0 && l < FIELD_SIZE) {
                    if (gameField[l][k] == playerCell) {  // проверяем побочную диагональ от центральной оси вниз
                        diagReverse++;
                    } else if (gameField[l][k] != playerCell && diagReverse < CELL_TO_WIN) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= CELL_TO_WIN) {
                    System.out.println("По побочной диагонали от центральной оси вниз " + diagReverse);
                    return true;
                }
            }
        }
        for (int j = 1; j < FIELD_SIZE; j++) {
            diagReverse = 0;
            for (int i = 0; i < FIELD_SIZE; i++) {
                int k = (FIELD_SIZE - 1) - j - i;
                if (k >= 0) {
                    if (gameField[i][k] == playerCell) {  // проверяем побочную диагональ от центральной оси влево
                        diagReverse++;
                    } else if (gameField[i][k] != playerCell && diagReverse < CELL_TO_WIN) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= CELL_TO_WIN) {
                    System.out.println("По побочной диагонали от центральной оси влево " + diagReverse);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDraw() {  // метод проверяет вариант ничьей
        for (char[] aGameField : gameField) {
            for (int j = 0; j < gameField.length; j++) {
                if (aGameField[j] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initGameField();  // игровое поле
        System.out.printf("Цель игры - раздавить аппонента)\n", CELL_TO_WIN, (CELL_TO_WIN % 10 == 1 && CELL_TO_WIN % 100 != 11) ? "его" : "их", (CELL_TO_WIN % 10 == 1 && CELL_TO_WIN % 100 != 11) ? "а" : "ов");
        printGameField();  // выводим состояние начального поля в консоль

        switch (new Random().nextInt(2)) {
            case 0: {
                System.out.println("Ваш ход первый!");
                while (true) {
                    playerMove();
                    printGameField();
                    if (isWin(PLAYER_CELL)) {
                        System.out.println("Победил Игрок");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    IIMove();
                    printGameField();
                    if (isWin(II_CELL)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
                break;
            }
            case 1: {
                System.out.println("Первый ход за ИИ!");
                while (true) {
                    IIMove();
                    printGameField();
                    if (isWin(II_CELL)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    playerMove();
                    printGameField();
                    if (isWin(PLAYER_CELL)) {
                        System.out.println("Победил Игрок");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
            }
        }
    }
}
