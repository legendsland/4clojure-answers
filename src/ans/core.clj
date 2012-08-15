(ns ans.core
  (:use clojure.repl)
  (:use clojure.test))


;!!!!!!!!!!!!!!
(deftest .38
  (testing "Write a function which takes a variable number of parameters and returns the maximum value."
  (def __

    (fn [x & xs]
      (reduce #(if (< %1 %2) %2 %1) x xs))

  )

  (is (= (__ 1 8 3 4) 8))
  (is (= (__ 30 20) 30))
  (is (= (__ 45 67 11) 67))

  (testing-contexts-str)
))

(deftest .64
  (testing "Reduce takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds."

  (def __

    +

  )

  (is  (= 15 (reduce __ [1 2 3 4 5])))
  (is  (= 0 (reduce __ [])))
  (is  (= 6 (reduce __ 1 [2 3])))

))








(defn -main
  "I don't do a whole lot."
  [& args]

  (run-tests 'ans.core)
  (doc .38)
  (println "OK."))



