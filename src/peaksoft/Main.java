package peaksoft;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /**
         Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз. Метод натыйжаны жаңы set катары кайтарышы керек. Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
         Мисалы: [1, 2, 3} жана {0, 1, 2]
         Жооп: [0, 3]
         public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек
         */

        Set<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(3);
        integers.add(1);
        Set<Integer> integers1 = new HashSet<>();
        integers1.add(2);
        integers1.add(0);
        integers1.add(1);

        System.out.println(symmetricDifference(integers, integers1));

    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newInteger = new HashSet<Integer>(set1);
        newInteger.removeAll(set2);
        set2.removeAll(set1);
        newInteger.addAll(set2);
        return newInteger;
    }


}
