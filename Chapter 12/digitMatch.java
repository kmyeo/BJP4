int digitMatch (int a, int b) {
    if (a < 0 || b < 0) throw new IllegalArgumentException();
    if (a / 10 == 0 || b / 10 == 0) {
        return (a % 10 == b % 10) ? 1 : 0;
    }
    if (a % 10 == b % 10) 
        return 1 + digitMatch(a / 10, b / 10);
    return digitMatch(a / 10, b / 10);
}