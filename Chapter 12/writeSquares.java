void writeSquares(int n) {
    if (n < 1) throw new IllegalArgumentException();
    if (n == 1) System.out.print(1);
    else if (n % 2 == 0) {
        writeSquares(n - 1);
        System.out.print(", " + n * n);
    }
    else if (n % 2 == 1) {
        System.out.print(n * n + ", ");
        writeSquares(n - 1);
    }
}