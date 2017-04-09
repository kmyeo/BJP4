int rarest (Map<String, Integer> map) {
    Map<Integer, Integer> m = new TreeMap<>();
    for (int i : map.values()) {
        if (!m.containsKey(i)) m.put(i, 1);
        else m.put(i, m.get(i) + 1);
    }
    int min;
    for (int i = 0;; i++) {
        if (m.containsValue(i)) {
            min = i;
            break;
        }
    }
    int age = 0;
    for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
        if (entry.getValue() == min) {
            age = entry.getKey();
            break;
        }
    }
    return age;
}
