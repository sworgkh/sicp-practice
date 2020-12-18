(ns sicp.core
  (:gen-class))

(defn hello-world []
   "Hello World :)")
 (defn greet [name] (str "Hello, " name))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (hello-world))
  (println (greet "Jonny"))
  )

(-main)


