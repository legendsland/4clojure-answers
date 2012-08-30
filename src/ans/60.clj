(ns ans.60
  (:use clojure.test))


(deftest .60
  (testing "[60] Sequence Reductions (Meduim, seq):
Write a function which behaves like reduce, but returns each intermediate value of the reduction. Your function must accept either two or three arguments, and the return sequence must be lazy."



   (def __

    (fn reduci
     ([f s]
      (reduci f (f (first s)) (rest s)))

      ([f ff s]
       (cons ff
        ((fn reduci-2 [f ff s]
         (if (empty? s) []
          (cons (f ff (first s)) (lazy-seq (reduci-2 f (f ff (first s)) (rest s))))))
        f ff s)))

       ;(loop [s s r []]
       ;(println r)
       ; (if (empty? s) r
       ;  (if (empty? r)
       ;    (recur s (conj r ff))
       ;    (recur (rest s) (conj r (f (last r) (first s))))))))

    )

   )


   (println "---> " (take 6  (__ * 2 [3 4 5])))

   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= (take 5 (__ + (range))) [0 1 3 6 10])

    (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])

    (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)

   )


 ))

