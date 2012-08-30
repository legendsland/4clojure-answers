(ns ans.31
  (:use clojure.test))


(deftest .31
  (testing "Pack a Sequence\n
Write a function which packs consecutive duplicates into sub-lists."

  ; 无穷无尽的 loop-recur ...

   (def __

      (fn [s]
        (loop [f (first s) r (rest s) y (list (first s))  x '()]
         (println "f: " f " r: " r " y: " y " x: " x)
          (if (empty? r) (reverse (cons y x))
            (if (= f (first r)) 
              (recur (first r) (rest r) (conj y (first r)) x)
              (recur (first r) (rest r) (list (first r)) (cons y x)  ))))

      )

   )


   (is (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))) )

   (is (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))) )

   (is (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))) )


))

