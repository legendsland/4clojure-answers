(ns ans.40
  (:use clojure.test))


(deftest .40
  (testing "[40] Interpose a Seq(Easy, seqs):
Write a function which separates the items of a sequence by an arbitrary value."



   (def __

      (fn [c s]
        (loop [s s x '()]
          (if (= 1 (count s)) (reverse (cons (first s) x))
            (recur (rest s) (cons c (cons (first s) x)))))
     )

   )


   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= (__ 0 [1 2 3]) [1 0 2 0 3])

    (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")

    (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

   )


 ))

