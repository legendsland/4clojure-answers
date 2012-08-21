

(ns ans.28
  (:use clojure.test))


(deftest .28
  (testing "Flatten a Sequence: Write a function which flattens a sequence."

   ; 深度优先地检查每个元素的“值“，然后将它取出来放进新的seq里返回。
   ; 1. 需要判断是否是seq


   (def __

      (fn [s]
        (loop [a (first s) r (rest s)]
          (if 


      )

   )


   (is (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
   (is (= (__ ["a" ["b"] "c"]) '("a" "b" "c")))
   (is (= (__ '((((:a))))) '(:a)))





  ))

