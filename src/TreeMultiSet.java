public class TreeMultiSet extends MultiSet {

    private Tree tree;


    public TreeMultiSet() {
        this.tree = new Tree();
    }
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        tree.insert(item);
    }


    /**
     * Remove the given item from this multiset.
     *
     * @param item the item to remove
     */
    @Override
    public void remove(Integer item) {
        tree.deleteItem(item);
    }


    /**
     * Check if the given item exists in the multiset.
     *
     * @param item the item to check
     * @return true if the item exists, false otherwise
     */
    @Override
    public boolean contains(Integer item) {
        return tree.contains(item);
    }

    /**
     * Check if the multiset is empty.
     *
     * @return true if empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return tree.isEmpty();
    }

    /**
     * Get the count of the occurrences of the given item.
     *
     * @param item the item to count
     * @return the number of times the item appears in the multiset
     */
    @Override
    public int count(Integer item) {
        return tree.count(item);
    }

    @Override
    public int size() {
        return tree.size();
    }

}
