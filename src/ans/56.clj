(ns ans.56
  (:use clojure.test))


(deftest .56
  (testing "[56] Find Distinct Items (Meduim, seqs):
Write a function which removes the duplicates from a sequence. Order of the items must be maintained."


  ; 是不是就是 55 的keys ??  但是应该有新的思路

   (def __

    (fn [s]
      (loop [s s st #{} x []]
        (if (empty? s) x
          (if (contains? st (first s))
            (recur (rest s) st x)
            (recur (rest s) (conj st (first s)) (conj x (first s))))))


    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all
    (= (__ [1 2 1 3 1 2 4]) [1 2 3 4])

    (= (__ [:a :a :b :b :c :c]) [:a :b :c])

    (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))

    (= (__ (range 50)) (range 50))

   )


 ))

