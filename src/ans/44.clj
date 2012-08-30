(ns ans.44
  (:use clojure.test))


(deftest .44
  (testing "[44] Rotate Sequence (Medium, seqs):
Write a function which can rotate a sequence in either direction."



   (def __


    ; 如果不用concat，需要自己实现 concat
    (fn [n s]
      (println (> n 0))
      (let [n (mod n (count s))]
       (if (= n 0) s
        (if (> n 0)
         (loop [s s i 0 y '()]
            (println y " -- " s)
            (if (= i n) (concat s (reverse y))
             (recur (rest s) (inc i) (conj y (first s)))))
         (loop [t s i 0 y '()]
            (println y " ** " t " " i)
            (if (= i (+ n (count s))) (concat (reverse y) t)
             (recur (rest t) (inc i) (conj y (first t))))))))
    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))

    (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))

    (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))

    (= (__ 1 '(:a :b :c)) '(:b :c :a))

    (= (__ -4 '(:a :b :c)) '(:c :a :b))

    )


 ))

