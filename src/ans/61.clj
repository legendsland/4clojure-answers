(ns ans.61
  (:use clojure.test))


(deftest .61
  (testing "[61] Map Construction (Meduim, seq):
Write a function which takes a vector of keys and a vector of values and constructs a map from them."


   (def __

    (fn [k v]
      (loop [k k v v m {}]
        (if (or (empty? k) (empty? v)) m
         (recur (rest k) (rest v) (assoc m (first k) (first v)))))


    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all
    (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})

    (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})

    (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})

   )


 ))

