(ns exercise2)

(defn only-greater-than-five
  "Verifica que el parámetro sea mayor a cinco."
  [list]
   (filter (fn [x] (> x 5)) list))