public void waysToClimb(int n) {
    if (n == 0) return;
    helper(n, new ArrayList<Integer>(), 0);
}
private void helper(int target, List<Integer> list, int sum)  {
    if (sum > target) return;
    if (sum == target) System.out.println(list);
    list.add(1);
    helper(target, list, sum + 1);
    list.remove(list.size() - 1);
    list.add(2);
    helper(target, list, sum + 2);
    list.remove(list.size() - 1);
}