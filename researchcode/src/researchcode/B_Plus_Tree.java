package researchcode;

import java.util.ArrayList;
import java.util.List;

public class B_Plus_Tree {
    public static void main(String[] args) {
        BPlusTree<Integer, String> tree = new BPlusTree<>(3); // Create a B+ tree with a degree of 3 (m=3)
        tree.insert(1, "One");
        tree.insert(2, "Two");
        tree.insert(3, "Three");
        tree.insert(4, "Four");
        tree.insert(5, "Five");

        System.out.println(tree.search(2)); // Output: Two
        System.out.println(tree.search(5)); // Output: Five
        System.out.println(tree.search(6)); // Output: null
    }
}

class BPlusTree<Key extends Comparable<Key>, Value> {
    private Node root;
    private int degree;

    public BPlusTree(int degree) {
        this.root = new LeafNode();
        this.degree = degree;
    }

    public Value search(Key key) {
        return root.search(key);
    }

    public void insert(Key key, Value value) {
        root.insert(key, value);
    }

    // Define an abstract class "Node" for tree nodes
    private abstract class Node {
        List<Key> keys;

        Node() {
            keys = new ArrayList<>();
        }

        // Abstract method to search for a key in the node
        abstract Value search(Key key);

        // Abstract method to insert a key-value pair into the node
        abstract void insert(Key key, Value value);
    }

    // Define a class "LeafNode" that represents leaf nodes of the B+ tree
    private class LeafNode extends Node {
        List<Value> values;
        LeafNode next;

        LeafNode() {
            values = new ArrayList<>();
        }

        @Override
        Value search(Key key) {
            int index = keys.indexOf(key);
            if (index >= 0) {
                return values.get(index);
            }
            return null;
        }

        @Override
        void insert(Key key, Value value) {
            int index = 0;
            // Find the appropriate position to insert the key-value pair based on the key's order
            while (index < keys.size() && key.compareTo(keys.get(index)) > 0) {
                index++;
            }
            // Insert the key and value at the determined position
            keys.add(index, key);
            values.add(index, value);
        }
    }
}
