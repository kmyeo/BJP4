boolean isReverse(String a, String b) {
    if (a.length() != b.length()) return false;
    int len = a.length();
    if (len <= 1) return a.equalsIgnoreCase(b);
    if (a.substring(0, 1).equalsIgnoreCase(b.substring(len - 1, len)))
        return isReverse(a.substring(1), b.substring(0, len - 1));
    return false;
}