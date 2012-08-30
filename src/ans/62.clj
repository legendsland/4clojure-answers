(ns ans.62
  (:use clojure.test))


(deftest .62
  (testing "[62] Re-implement Iterate (Easy, seq):
Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc."


   (def __

    (fn iter [f i]
      (lazy-seq
       (cons i (iter f (f i))))


    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all
    (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])

    (= (take 100 (__ inc 0)) (take 100 (range)))

    (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

   )


 ))

