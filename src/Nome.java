public class Nome {
    public static void main(String[] args) {
        char[][] arrG = letraG();
        escrever(arrG);

        char[][] arrU = letraU();
        escrever(arrU);

        char[][] arrS = letraS();
        escrever(arrS);

        char[][] arrT = letraT();
        escrever(arrT);

        char[][] arrA = letraA();
        escrever(arrA);

        char[][] arrV = letraV();
        escrever(arrV);

        char[][] arrO = letraO();
        escrever(arrO);
    }

    public static char[][] letraA() {
        char[][] arr = {
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {' ', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
    public static char[][] letraG() {
        char[][] arr = {
                {'G', 'G', 'G', 'G', 'G'},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', 'G', 'G', 'G'},
                {'G', ' ', ' ', ' ', 'G'},
                {'G', 'G', 'G', 'G', 'G'},
                {' ', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
    public static char[][] letraO() {
        char[][] arr = {
                {'O', 'O', 'O', 'O', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {' ', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
    public static char[][] letraS() {
        char[][] arr = {
                {' ', 'S', 'S', 'S', 'S'},
                {'S', ' ', ' ', ' ', ' '},
                {' ', 'S', 'S', 'S', ' '},
                {' ', ' ', ' ', ' ', 'S'},
                {'S', 'S', 'S', 'S', ' '},
                {' ', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
    public static char[][] letraT() {
        char[][] arr = {
                {'T', 'T', 'T', 'T', 'T'},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
    public static char[][] letraU() {
        char[][] arr = {
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', 'U', 'U', 'U', 'U'},
                {' ', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
    public static char[][] letraV() {
        char[][] arr = {
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {' ', 'V', ' ', 'V', ' '},
                {' ', ' ', 'V', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
