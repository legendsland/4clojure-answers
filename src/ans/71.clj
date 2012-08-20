
(ns ans.71
  (:use clojure.test))


(deftest .71
  (testing 
   "The -> macro threads an expression x through a variable number of forms. First, x is inserted as the second item in the first form, making a list of it if it is not a list already. Then the first form is inserted as the second item in the second form, making a list of that form if necessary. This process continues for all the forms. Using -> can sometimes make your code more readable.
   使用 -> 又是可以让你的代么更可读"

  (def __

    count

    ; clojure 中计算 array 长度的既不是 size 也不是 length，而是 count
    ; 在这个例子中，还可以考虑使用 max，但是不行，因为 max 需要的是多个参数，而不是一个数组
  )


  (is (= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] reverse rest sort __)
   5))

  )
)


