(ns ans.43
  (:use clojure.test))


(deftest .43
  (testing "[43] Reverse Interleave (Medium, seqs):
Write a function which reverses the interleave process into x number of subsequences."



   (def __


      ; 太复杂？？

      (fn [s n]
       (letfn [(f [s]
                  (reduce #(loop [s %1 t %2 x '()]
                              (if (empty? s) (reverse x)
                                (recur (rest s) (rest t) (cons (reverse (conj (if (seq? (first s)) (reverse (first s)) (list (first s)) ) (first t))) x))))
                    s))
               (g [s n]
                  (loop [s s i 0  y '() x '()]
                    (if (empty? s) (reverse (cons (reverse y) x))
                      (if (= i n)
                        (recur (rest s) 1 (list (first s)) (cons (reverse y) x))
                        (recur (rest s) (inc i) (cons (first s) y) x)))))]
          (f (g s n)))
    )

   )

   (println (
    (fn [s]
      (reduce #(loop [s %1 t %2 x '()]
                  (if (empty? s) (reverse x)
                    (recur (rest s) (rest t) (cons (reverse (conj (if (seq? (first s)) (reverse (first s)) (list (first s)) ) (first t))) x))))
        s))
      '((1 2) (3 4) (5 6))
   ))


   ; group sequence into n units
   (println (
    (fn [s n]
      (loop [s s i 0  y '() x '()]
        (if (empty? s) (reverse (cons (reverse y) x))
          (if (= i n)
            (recur (rest s) 1 (list (first s)) (cons (reverse y) x))
            (recur (rest s) (inc i) (cons (first s) y) x)))))
    '(1 2 3 4 5 6) 2))

   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))

    (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))

    (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))

    )


 ))

