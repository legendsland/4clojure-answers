(ns ans.59
  (:use clojure.test))


(deftest .59
  (testing "[59] Juxtaposition (Meduim, higher-order-functions core-functions):
Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list."



   (def __

    (fn [& fs]
     (fn [& args]
      (loop [f fs x []]
       (if (empty? f) x
          (recur (rest f) (conj x (apply (first f) args))))))


    )

   )



   ; 为方便从4clojure直接copy，避免写重复的 (is ...)
   (defmacro all [& exprs]
      (cons 'do
       (loop [e exprs x '()]
        (if (empty? e) (reverse x)
          (recur (rest e) (cons (list 'is (first e)) x))))))


   (all

    (= [21 6 1] ((__ + max min) 2 3 5 1 6 4))

    (= ["HELLO" 5] ((__ #(.toUpperCase %) count) "hello"))

    (= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))

   )


 ))

