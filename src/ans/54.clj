(ns ans.54
  (:use clojure.test))


(deftest .54
  (testing "[54] Partition a Sequence (Meduim, seqs):
Write a function which returns a sequence of lists of x items each. Lists of less than x items should not be returned."


  ; hard-way 参考43

   (def __

    (fn [n s]
      (loop [s s x '()]
       (println s)
       (let [f (get (split-at n s) 0) r (get (split-at n s) 1)]
        (if (< (count s) n) (reverse x)
          (recur r (cons f x)))))

    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))

    (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))

    (= (__ 3 (range 8)) '((0 1 2) (3 4 5)))

    )


 ))

