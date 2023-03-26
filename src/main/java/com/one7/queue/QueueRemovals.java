package com.one7.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Elements {
    int v;//value
    int p;//position

    public Elements(int p, int v) {
        this.v = v;
        this.p = p;
    }

    @Override
    public String toString() {
        return "Elements{" +
                "v=" + v +
                ", p=" + p +
                '}';
    }
}

public class QueueRemovals {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPositions(new int[]{1, 2, 2, 3, 4, 5}, 5)));
    }

    static int[] findPositions(int[] arr, int x) {
        // Write your code here
        int[] res = new int[x];
        Queue<Elements> q = new LinkedList<>();
        int pass = 0;
        for (int g = 0; g < arr.length; g++) {
            q.add(new Elements(g + 1, arr[g]));
        }
        System.out.println("Queued ===" + q);

        for (int a = 0; a < x; a++) {
            //System.out.println("Queued ===" + q);
            //Step 1
            //Pop x elements from the front of queue (or, if it contains fewer than x elements, pop all of them)
            List<Elements> popped = new LinkedList<>();
            for (int i = 0; i < x && !q.isEmpty(); i++) {
                popped.add(q.poll());
            }
            System.out.println("Popped ===" + popped);

            //Step 2
            //Of the elements that were popped, find the one with the largest value (if there are multiple such elements,
            // take the one which had been popped the earliest), and remove it

            int max = 0;
            int maxId = Integer.MAX_VALUE;
            for (Elements z : popped) {
                if (z.v == max) {
                    maxId = Math.min(z.p, maxId);
                } else if (z.v > max) {
                    max = z.v;
                    maxId = z.p;
                }
            }
            res[pass++] = maxId;
            //Step 3
            //For each one of the remaining elements that were popped (in the order they had been popped),
            // decrement its value by 1 if it's positive (otherwise, if its value is 0, then it's left unchanged),
            // and then add it back to the queue
            System.out.println(Arrays.toString(res));
            for (Elements s : popped) {
                if (s.p != maxId) {
                    Elements next = new Elements(s.p, (s.v == 0) ? s.v : s.v - 1);
                    q.add(next);
                }
            }

        }
        return res;
    }
}
