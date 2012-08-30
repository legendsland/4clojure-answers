(ns ans.41
  (:use clojure.test))


(deftest .41
  (testing "[41] Drop Every Nth Item (Easy, seqs):
Write a function which drops every Nth item from a sequence."



   (def __

      (fn [s n]
        (loop [i 0 s s x []]
          (if (empty? s) x
            (recur (inc i) (rest s)
              (if (= 0 (rem (inc i) n)) x
               (conj x (first s))))))
      )

   )


   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

      (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

      (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])

      (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
    )


 ))

