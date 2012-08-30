(ns ans.32
  (:use clojure.test))


(deftest .32
  (testing "Duplicate a Sequence\n
Write a function which duplicates each element of a sequence."



   (def __

      (fn [s]
        (loop [f (first s) r (rest s) x '()]
          (if (empty? r) (reverse (cons f (cons f x)))
            (recur (first r) (rest r) (cons f (cons f x)))))
      )

   )

  (is (= (__ [1 2 3]) '(1 1 2 2 3 3)))

  (is (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))

  (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))

  (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))


))

