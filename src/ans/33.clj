(ns ans.33
  (:use clojure.test))


(deftest .33
  (testing "Replicate a Sequence [Easy, seqs]\n
Write a function which replicates each element of a sequence a variable number of times."



   (def __

      (fn [s n]
        (loop [s s x '()]
          (if (empty? s) (reverse x)
            (recur (rest s) 
              (loop [n n x x]
                (if (= n 0) x
                  (recur (dec n) (cons (first s) x)))))))
     )

   )


  (is (= (__ [1 2 3] 2) '(1 1 2 2 3 3)) )

  (is (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b)) )

  (is (= (__ [4 5 6] 1) '(4 5 6)) )

  (is (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])) )

  (is (= (__ [44 33] 2) [44 44 33 33]) )

))

