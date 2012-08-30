(ns ans.39
  (:use clojure.test))


(deftest .39
  (testing "[39] Interleave Two Seqs (Easy, seqs):
Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.\n"



   (def __

      (fn [s t]
        (loop [s s t t x '()]
         (if (or (empty? s) (empty? t)) (reverse x)
            (recur (rest s) (rest t) (cons (first t) (cons (first s) x)))))

     )

   )


   (is (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)) )

   (is (= (__ [1 2] [3 4 5 6]) '(1 3 2 4)) )

   (is (= (__ [1 2 3 4] [5]) [1 5]) )

   (is (= (__ [30 20] [25 15]) [30 25 20 15]))

 ))

