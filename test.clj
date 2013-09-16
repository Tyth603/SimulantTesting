;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(defn print
  [input]
  println input)

(print "Hello World")

(range 10)

(distinct [:a :b :a :c :a :d])

5
"Hi"
[1 2 3 ]
(+ 1 2 3 )
(if true "yes" "no")
(println "hello")

(+ 1
   (* 2 3 )
   (/ 10 2))

(let [width     10
      height    20
      thickness 2]
  (println "Hello from inside the 'let'.")
  (* width
     height
     thickness))

(let [x 2
      x (* x x)
      x (+ x 1)]
  x)
