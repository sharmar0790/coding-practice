package com.one7.more;

import java.util.Optional;
import java.util.stream.IntStream;

public class StreamsExample {

    public static void main(String[] args) {
        int[] i = new int[]{1,2,1,3,3};
        int[] in = new int[]{0,2,1,2,2,0};
        Optional<Integer> collect = IntStream.range(0, in.length)
                .filter(x -> in[x] >= 2)
                .mapToObj(x -> in[x]).reduce(Integer::sum);

        System.out.println("Sum==="+collect.get());
    }
}
