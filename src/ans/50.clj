(ns ans.50
  (:use clojure.test))


(deftest .50
  (testing "[50] Split by Type (Medium, seqs):
Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases)."



   (def __

    ; 和43类是，但要更复杂，因为 s 是没有排序的
    ; 但是使用api会简单的多
    (fn [s]
      (vals (group-by #(cond (number? %) 1
                         (string? %) 2
                         (keyword? %) 3
                         (vector? %) 4
                         :else 5)
                  s))
    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})

    (= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})

    (= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})

    )


 ))

