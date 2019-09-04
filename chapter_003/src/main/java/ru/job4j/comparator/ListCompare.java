package ru.job4j.comparator;

import java.util.Comparator;


public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rst1 = 0;
        int l = left.length();
        int r = right.length();
        for (int i = 0; i < Math.min(l,r);i++ ) {
            char cl = left.charAt(i);
            char cr = right.charAt(i);
            rst1 = Character.compare(cl, cr);
            if (rst1 != 0) {
                break;
            }
        }
             if(rst1 == 0){
                rst1 = Integer.compare(l, r);
}
            return rst1;


   }
}