(ns ans.55
  (:use clojure.test))


(deftest .55
  (testing "[55] Count Occurrences (Meduim, seqs):
Write a function which returns a map containing the number of occurences of each distinct item in a sequence."



   (def __

    (fn [s]
      (loop [s s m {}]
        (if (empty? s) m
          (recur (rest s)
            (if (contains? m (first s)) (update-in m [(first s)] inc)
              (assoc m (first s) 1)))))

    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})

    (= (__ [:b :a :b :a :b]) {:a 2, :b 3})

    (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
   )


 ))

