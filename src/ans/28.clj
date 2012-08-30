

(ns ans.28
  (:use clojure.test))


(deftest .28
  (testing "Flatten a Sequence: Write a function which flattens a sequence."

   ; 深度优先地检查每个元素的“值“，然后将它取出来放进新的seq里返回。
   ; 1. 需要判断是否是seq


   (def __

      (fn [s]
       (letfn [(flatten? [s]
          (or (seq? s) (vector? s)))]
        (loop [f (first s) r (rest s) x '()]
          (println f "--" r "--" x)
          (if (and (not (flatten? f)) (empty? r)) (reverse (cons f x))
            (if (not (flatten? f))
              (recur (first r) (rest r) (cons f x))
              (recur (first f) (if (empty? (rest f)) r (cons (rest f) r)) x)))))
      )

   )

    ; 计算第一个
    (println
      ((fn [s]
        (loop [f (first s)]
          (if (seq? f)
            (recur (first f))
            f)))
        '((((1))))
      ))


   (is (= (__ '((1 2) 3 (4 (5 6)))) '(1 2 3 4 5 6)))
   (is (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
   (is (= (__ ["a" ["b"] "c"]) '("a" "b" "c")))
   (is (= (__ '((((:a))))) '(:a)))





  ))

