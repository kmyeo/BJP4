public Map<String, Integer> reverse (Map<Integer, String> map) {
    Map<String, Integer> result = new HashMap<>(map.size());
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        result.put(entry.getValue(), entry.getKey());
    }
    return result;
}