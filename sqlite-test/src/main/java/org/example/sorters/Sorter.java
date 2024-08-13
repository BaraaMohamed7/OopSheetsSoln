package org.example.sorters;

import org.example.models.Product;

import java.util.ArrayList;
import java.util.Comparator;

public interface Sorter {
    public ArrayList<Product> sort(ArrayList<Product> list);

    public ArrayList<Product> sort(ArrayList<Product> list, Comparator<Product> comp);

}
