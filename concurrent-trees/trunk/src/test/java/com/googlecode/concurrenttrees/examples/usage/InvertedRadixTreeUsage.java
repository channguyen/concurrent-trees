package com.googlecode.concurrenttrees.examples.usage;

import com.googlecode.concurrenttrees.common.PrettyPrintUtil;
import com.googlecode.concurrenttrees.radix.node.concrete.DefaultCharArrayNodeFactory;
import com.googlecode.concurrenttrees.radix.node.util.PrettyPrintable;
import com.googlecode.concurrenttrees.radixinverted.ConcurrentInvertedRadixTree;
import com.googlecode.concurrenttrees.radixinverted.InvertedRadixTree;

/**
 * @author Niall Gallagher
 */
public class InvertedRadixTreeUsage {

    public static void main(String[] args) {
        InvertedRadixTree<Integer> tree = new ConcurrentInvertedRadixTree<Integer>(new DefaultCharArrayNodeFactory());

        tree.put("TEST", 1);
        tree.put("TOAST", 2);
        tree.put("TEAM", 3);

        System.out.println("Tree structure:");
        // PrettyPrintable is a non-public API for testing, prints semi-graphical representations of trees...
        PrettyPrintUtil.prettyPrint((PrettyPrintable)tree, System.out);

        System.out.println();
        System.out.println("Value for 'TEST' (exact match): " + tree.getValueForExactKey("TEST"));
        System.out.println("Value for 'TOAST' (exact match): " + tree.getValueForExactKey("TOAST"));
        System.out.println();
        System.out.println("Keys contained in 'MY TEAM LIKES TOAST': " + tree.getKeysContainedIn("MY TEAM LIKES TOAST"));
        System.out.println("Keys contained in 'MY TEAM LIKES TOASTERS': " + tree.getKeysContainedIn("MY TEAM LIKES TOASTERS"));
        System.out.println("Values for keys contained in 'MY TEAM LIKES TOAST': " + tree.getValuesForKeysContainedIn("MY TEAM LIKES TOAST"));
        System.out.println("Key-value pairs for keys contained in 'MY TEAM LIKES TOAST': " + tree.getKeyValuePairsForKeysContainedIn("MY TEAM LIKES TOAST"));
    }
}
