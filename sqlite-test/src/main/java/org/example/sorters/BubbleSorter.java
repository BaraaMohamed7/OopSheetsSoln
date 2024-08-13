package org.example.sorters;
import org.example.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;


public class BubbleSorter implements Sorter {

    @Override
    public ArrayList<Product> sort(ArrayList<Product> list) {
        Product[] products = list.toArray(new Product[0]);
        int size = products.length;
        Product temp;
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size-i-1 ; j++) {
                if (products[j].getId() > products[j+1].getId()) {
                    temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }
        return Arrays.stream(products)
                .collect(Collectors.toCollection(ArrayList<Product>::new));
    }

    @Override
    public ArrayList<Product> sort(ArrayList<Product> list, Comparator<Product> comp) {
        Product[] products = list.toArray(new Product[0]);
        int size = products.length;

        Product temp;
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size-i-1 ; j++) {
                if (comp.compare(products[j], products[j + 1]) > 0) {
                    temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }
        return Arrays.stream(products)
                .collect(Collectors.toCollection(ArrayList<Product>::new));
    }


}
