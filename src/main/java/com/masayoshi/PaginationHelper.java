package com.masayoshi;

import java.util.Arrays;
import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    private final List<I> collection;
    private final int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }


    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (this.itemCount() <= itemsPerPage) return 1;
        else return (this.itemCount() % itemsPerPage != 0)
                ? this.itemCount() / itemsPerPage + 1
                : this.itemCount() / itemsPerPage;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        pageIndex +=1;
        if (pageIndex > this.pageCount()) return -1;
        else return pageIndex != this.pageCount()
                ? itemsPerPage
                : this.itemCount() - (pageIndex - 1) * itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex > collection.size() - 1) return -1;
        else return itemIndex % itemsPerPage + 1;
    }

    public static void main(String[] args) {
//        PaginationHelper<Integer> pageHelper = new PaginationHelper<>(
//                Arrays.asList(1, 2, 3, 4, 5, 6, 7), 4
//        );
        PaginationHelper<Integer> pageHelper = new PaginationHelper<>(
                Arrays.asList(), 4
        );
        System.out.println(pageHelper.itemCount());
        System.out.println(pageHelper.pageCount());
        System.out.println(pageHelper.pageItemCount(2));
        System.out.println(pageHelper.pageIndex(7));
    }

}