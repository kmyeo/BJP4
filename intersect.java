public Map<String, Integer> intersect (Map<String, Integer> m1, Map<String, Integer> m2) {
    Iterator<Map.Entry<String, Integer>> itr = m1.entrySet().iterator();
    Map<String, Integer> result = new HashMap<>();
    while (itr.hasNext()) {
        Map.Entry<String, Integer> entry = itr.next();
        if (m2.containsKey(entry.getKey()) && m2.containsValue(entry.getValue()) )
                result.put(entry.getKey(), entry.getValue());
    }
    return result;
}