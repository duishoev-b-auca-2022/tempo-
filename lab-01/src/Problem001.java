public class Problem001 {
    //Field Data
    final static int WIDTH =20;
    final static int HEIGHT = 20;
    final static char EMPTY_CELL = '.';
    static char[][] field;

    //Turtle Data
    final static char TURTLE = 'T';
    static int turtleX, turtleY;
    static int dx, dy;
    static boolean isPenDown;
    final static char TURTLE_PATH = '*';

    // Field Methods
    public static void initField(){
        field = new char[HEIGHT][WIDTH];
        for (int y = 0; y < HEIGHT; ++y){
            for (int x = 0; x < WIDTH; ++x){
                field[y][x] = EMPTY_CELL;
            }
        }
    }
    public static void printField(){
        for (int y = 0; y < HEIGHT; ++y){
            for (int x = 0; x < WIDTH; ++x){
                if(x== turtleX && y == turtleY){
                    System.out.print(TURTLE);
                } else {
                    System.out.print(field[y][x]);
                }
            }
            System.out.println();
        }
    }

    // Turtle Methods
    public static void initTurtle(){
        turtleX = 0;
        turtleY = 0;
        dx = 1;
        dy = 0;
        isPenDown = false;
    }
    public static void putPenUp(){
        isPenDown = false;
    }
    public static void putPenDown(){
        isPenDown = true;
    }
    public static void turnRight(){
        int temp  = dx;
        dx = dy;
        dy = temp;
        dx = -dx;
    }
    public static void turnLeft(){
        int temp  = dx;
        dx = dy;
        dy = temp;
        dy = -dy;
    }
    public static void move(int steps){
        for (int i = 0; i < steps; ++i){
            int nextX = turtleX + dx;
            int nextY = turtleY + dy;
            if(nextX < 0 || nextY < 0 || nextX >= WIDTH || nextY >= HEIGHT){
                break;
            }
            if(isPenDown){
                field[turtleY][turtleX] = TURTLE_PATH;
            }
            turtleX = nextX;
            turtleY = nextY;
        }
    }



    //Main Method
    public static void main(String[] args){
        initField();
        initTurtle();
        putPenDown();
        move(5);
        turnRight();
        move(5);
        putPenUp();
        move(3);
        turnLeft();
        printField();
    }
}