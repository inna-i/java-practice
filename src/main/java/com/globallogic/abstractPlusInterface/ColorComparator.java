package com.globallogic.abstractPlusInterface;

import java.util.Comparator;

public class ColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape obj1 = (Shape) o1;
        Shape obj2 = (Shape) o2;

        return obj1.getShapeColor().compareTo(obj2.getShapeColor());
    }
}
