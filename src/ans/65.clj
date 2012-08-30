(ns ans.65
  (:use clojure.test))


(deftest .65
  (testing "[65] Black Box Testing (Medium, seq):
Clojure has many sequence types, which act in subtly different ways. The core functions typically convert them into a uniform "sequence" type and work with them that way, but it can be important to understand the behavioral and performance differences so that you know which kind is appropriate for your application.

Write a function which takes a collection and returns one of :map, :set, :list, or :vector - describing the type of collection it was given.
You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior."


    ; 正如上面所说，这些类型需要区分清楚

   (def __

    (fn [s]



    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= :map (__ {:a 1, :b 2}))

    (= :list (__ (range (rand-int 20))))

    (= :vector (__ [1 2 3 4 5 6]))

    (= :set (__ #{10 (rand-int 5)}))

    (= [:map :set :vector :list] (map __ [{} #{} [] ()]))

   )


 ))

