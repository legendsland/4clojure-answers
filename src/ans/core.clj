(ns ans.core
  (:use clojure.repl)
  (:use clojure.test)
)


(defn -main
  "I don't do a whole lot."
  [& args]

  (load "ans/38")
  (load "ans/64")
  (load "ans/71")
  (load "ans/145")
  (load "ans/158")

  (run-tests 'ans.38)
  (run-tests 'ans.64)
  (run-tests 'ans.71)
  (run-tests 'ans.145)
  (run-tests 'ans.158)


  (println "== OK =="))



