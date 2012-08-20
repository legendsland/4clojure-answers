(ns ans.158
  (:use clojure.test))

(deftest .158
  (testing "搞了一下午...shit"

  (def __

   (fn [f]
    (fn [& xs]
      (loop [g f s xs]
        (if (empty? (rest s)) (g (first s))
          (recur (g (first s)) (rest s))))))

  )

  (is (= 10 ((__ (fn [a]
              (fn [b]
               (fn [c]
                (fn [d]
                 (+ a b c d))))))
         1 2 3 4)))

  (is (= 24 ((__ (fn [a]
              (fn [b]
               (fn [c]
                (fn [d]
                 (* a b c d))))))
         1 2 3 4)))


  (is (= 25 ((__ (fn [a]
               (fn [b]
                 (* a b))))
         5 5)))
  )
)


