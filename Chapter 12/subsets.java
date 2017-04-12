public void subsets(List<String> list) {
    helper(0, list, new ArrayList<String>());
}
private void helper(int index, List<String> list, List<String> result) {
    if (index >= list.size()) System.out.println(result);
    else {
        if (!result.contains(list.get(index))) {
            result.add(list.get(index));
            helper(index + 1, list, result);
            result.remove(list.get(index));
        }
        helper(index + 1, list, result);
    }
}