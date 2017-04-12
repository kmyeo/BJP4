String repeat(String s, int n) {
    if (n < 0) throw new IllegalArgumentException();
    if (n == 0) return "";
    return s + repeat(s, n - 1);
}