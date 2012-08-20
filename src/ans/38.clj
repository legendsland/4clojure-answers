(ns ans.38
  (:use clojure.repl)
  (:use clojure.test))

(deftest .38
  (testing "Write a function which takes a variable number of parameters and returns the maximum value."
  (defn __

    ;(fn [x & xs] (reduce #(if (< %1 %2) %2 %1) x xs))
    [x & xs]
      ((fn __ [x xs]
        (println xs)
        (cond (empty? xs) x
        (> (first xs) x) (__ (first xs) (rest xs))
        :else (__ x (rest xs))))
      x xs)

  )

  (defn lazy-max [[x & xs]]
    (println x " "  xs)
     (cond (empty? xs) x
            (> (first xs) x) (recur xs)
            :else (recur (conj (rest xs) x))))


  ;(is (= (lazy-max (take 100 (iterate inc 1))) 100))

  (defn my-max [x & xs]
     (cond (empty? xs) x
            (> (first xs) x) (recur (first xs) (rest xs))
            :else (recur x (rest xs))))

  (defn my-max2
    [x & xs]
    ((fn __ [x xs]
      (cond
        (empty? xs) x
        (> x (__ (first xs) (rest xs))) x
        :else (__ (first xs) (rest xs))))
      x xs))

(declare good-enough? improve)
(def err 0.00000001)

(defn iter-sqrt [n guess]
  (if (good-enough? guess n)
    guess
    (iter-sqrt n (improve guess n))))


(defn improve [guess n]
  (/ (+ guess (/ n guess)) 2))


(defn good-enough? [guess n]
  (letfn [(abs [x] (if (< x 0) (- 0 x) x))]
    (< (abs (- (* guess guess) n)) err)))


(println (iter-sqrt 2 1.0))



(defn next-item [n]
  (fn [a]
    (/ (+ a (/ n a)) 2)))

;这是一个高阶函数，(next-item n) 返回计算 n 的平方根序列中下一项的函数，所以2的平方根序列可以表示为：
; 1.0  <-- 初始值
; ((next-item 2) 1.0)
; ((next-item 2) ((next-item 2) 1.0))
; ((next-item 2) ((next-item 2) ((next-item 2) 1.0)))
; ...


(defn lazy-sqrt [calc-next start]
  (lazy-seq
    (cons start
      (lazy-sqrt calc-next (calc-next start)))))


(defn good-enough? [seq-sqrt err]
  (let [f (first seq-sqrt) n (fnext seq-sqrt)]
    (letfn [(abs [x] (if (< x 0) (- 0 x) x))]
      (if (< (abs (- f n)) err)
        n
        (good-enough? (rest seq-sqrt) err)))))

(println (good-enough? (lazy-sqrt (next-item 2) 1.0) 0.00001))
;= 


  (defn sqrt
   [n guess]
   (letfn [(abs [a] (if (> a 0) a (- 0 a)))]
     (if (< n 0) (do (println "must >0") 0)
        (if (< (abs (- (* guess guess) n)) 0.00001)
          guess
          (recur n (/ (+ guess (/ n guess)) 2))
  ))))


  (defn next-sqrt [n]
    (fn [x]
      (/ (+ x (/ n x)) 2N)))

  (defn lazy-sqrt [next-val guess]
    (lazy-seq
     (cons guess
        (lazy-sqrt next-val (next-val guess)))))

  (defn within [e g]
    (letfn [(abs [x]
             (if (< x 0) (- 0 x) x))]
      (if (< (abs (- (first g) (fnext g))) e)
        (fnext g)
        (within e (rest g)))))

  (println (within 0.0000001 (lazy-sqrt (next-sqrt 2) 1.0)))
  ;(println (lazy-sqrt (next-sqrt 2) 1.0))

  ; 更进一步，如果需要找前10个符合条件的，怎么办？
  ; 这样就需要进一步的惰性计算了

  (defn within-2 [e g]
    (letfn [(abs [x]
             (if (< x 0) (- 0 x) x))]
      (if (< (abs (- (first g) (fnext g))) e)
       (lazy-seq
       (cons
         (fnext g)
         (within-2 e (rest g))))
       (within-2 e (rest g)))))

  (println (take 10 (within-2 0.0000000000000001 (lazy-sqrt (next-sqrt 2) 1.0))))

  (defn good-enough?
    [guesses]
    (letfn [(abs [x]
             (if (< x 0) (- 0 x) x))]
      (lazy-seq
      (if (< (abs(- (* (first guesses) (first guesses)) 2)) 0.0000001)
        (cons (first guesses)
          (good-enough? (rest guesses)))
        (good-enough? (rest guesses))))))

  ;(println (take 1 (good-enough? (lazy-sqrt 2 1.0))))
  ;(println (take 1 (  ( (good-enough? (lazy-sqrt 2 1.0)) 0.000001)   ) ))

  ;((good-enough? 2 0.0000001 1.0 ) lazy-sqrt))

  ;(println (take 1 (filter #(((good-enough? 0.000001) %) 2) (lazy-sqrt 2 1.0))))

  ;(println (take 1 (filter #(< ((fn [n] (if (< n 0) (- 0 n) n)) (- (* % %) 2)) 0.00000001) (lazy-sqrt 2 1.0))))
  ;(println (take 1 (drop-while #(> ((fn [n] (if (< n 0) (- 0 n) n)) (- (* % %) 2)) 0.00000001) (lazy-sqrt 2 1.0))))

  (is (= (sqrt -1 1) 0))
  (is (= (sqrt 2 1.0) 0))

  ; 简单递归参数问题 - 通过fn解决
  ; 转成尾递归
  ; 使用 recur TOC 参数问题
  ; 不用 recur 直接使用 sequence function
  ; 使用 lazy evaluation


  (is (= (my-max 1) 1))
  (is (= (my-max 1 2) 2))
  ; (is (= (my-max2 1 2) 2))
  (is (= (__ 1 2) 2))
  ;(is (= (__ 1 8 3 4) 8))
  ;(is (= (__ 30 20) 30))
  ;(is (= (__ 45 67 11) 67))
  ;(is (= (__ 45 67 11 2 45 123 12 9 214 0 221 2222 12) 2222))

))

