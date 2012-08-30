(ns ans.63
  (:use clojure.test))


(deftest .63
  (testing "[63] Group a Sequence (Easy, seq):
Given a function f and a sequence s, write a function which returns a map. The keys should be the values of f applied to each item in s. The value at each key should be a vector of corresponding items in the order they appear in s."


   (def __

    (fn [f s]
     (loop [f f s s m {}]
      (if (empty? s) m
       (recur f (rest s) (if (get m (f (first s))) 
                          (assoc m (f (first s)) (conj (get m (f (first s))) (first s) ))
                          (assoc m (f (first s)) [(first s)])))))


    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all
    (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})

    (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
     {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})

    (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]])
     {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})

   )


 ))

