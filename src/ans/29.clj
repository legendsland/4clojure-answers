(ns ans.29
  (:use clojure.test))


(deftest .29
  (testing "Get the Caps\n
Write a function which takes a string and returns a new string containing only the capital letters"

  ; 判断是大写字母的方法
  ; string 和 seq 的关系


   (def __

      (fn [s]
       (clojure.string/join (filter #(and (> (int %) 64) (< (int %) 91)) s))
      )

   )


   (is (= (__ "HeLlO, WoRlD!") "HLOWRD"))

   (is (empty? (__ "nothing")))

   (is (= (__ "$#A(*&987Zf") "AZ"))


))

