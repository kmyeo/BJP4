public int maxOccurrences (List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : list) {
        if (!map.containsKey(n)) map.put(n, 1);
        else map.put(n, map.get(n) + 1);
    }
    int max = 0;
    for (int val : map.values())
        max = Math.max(max,val);
    return max;
}
