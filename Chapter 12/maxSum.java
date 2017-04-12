public static int maxSum (List<Integer> L, int n) {
    return helpMax(L, n, 0, 0);
}
private static int helpMax (List<Integer> L, int max, int index, int sum) {
    if (index >= L.size()) return sum;
    if (sum + L.get(index) <= max) return Math.max(helpMax(L, max, index + 1, sum + L.get(index)), 
                                               helpMax(L, max, index + 1, sum));
    return helpMax(L, max, index + 1, sum);
}