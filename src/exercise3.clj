(ns exercise3)

(defn fibonacci
  "Sucesion de fibonacci"
  [number]
     (cond 
        (= number 0) 0
        (= number 1) 1
        :else (+ (fibonacci (dec number)) (fibonacci (- number 2)))))