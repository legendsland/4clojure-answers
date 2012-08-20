
(ns ans.145
  (:use clojure.test))


(deftest .145

  (def __

    (fn [a o b & args]
      (if (empty? args) (o a b)
        (recur (o a b) (first args) (fnext args) (rest (rest args)))))

  )

  (is (= 7  (__ 2 + 5)))

  (is (= 42 (__ 38 + 48 - 2 / 2)))

  (is (= 8  (__ 10 / 2 - 1 * 2)))

  (is (= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9)))


)

