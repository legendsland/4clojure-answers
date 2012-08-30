(ns ans.53
  (:use clojure.test))


(deftest .53
  (testing "[53] Longest Increasing Sub-Seq (Hard, seqs):
Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases)."


   (def __

    (fn [s]
      (loop [s s x '() y '()]
       (print x " --- " y "**\n")
        (if (empty? s) (reverse (if (or (> (count x) 1) (> (count y) 1)) (if (> (count x) (count y)) x y) '()))
          (if (empty? x)
           (recur (rest s) (cons (first s) x) y)
           (if (= (first s) (inc (first x)))
             (recur (rest s) (cons (first s) x) y)
             (if (empty? y) 
              (recur (rest s) (list (first s)) x)
              (recur (rest s) (list (first s)) (if (> (count x) (count y)) x y)))))))
   )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])

    (= (__ [5 6 1 3 2 7]) [5 6])

    (= (__ [2 3 3 4 5]) [3 4 5])

    (= (__ [7 6 5 4]) [])

    )


 ))

