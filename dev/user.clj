(ns user)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!!"))

; (defn fib
;   [n]
;   (+ (fib (- n 1))
;      (fib (- n 2))))

(defn fib
  [n]
  (case n
    0 0
    1 1
    (+ (fib (- n 1))
       (fib (- n 2)))))

(defn quadrat
  [n]
  (* n n))

; #_(defn fac
;     [n]
;     (apply * (range 1 (+ n 1))))
;
; (defn fac
;   [n]
;   (if (= n 0)
;     1
;     (* n (fac (- n 1)))))



; (defn quadrate
;   [n]
;   (map quadrat (range 1 (+ n 1))))
;
; (defn gerade-quadrate
;   [n]
;   (filter even? (quadrate n)))

(defn carl
  []
  (println (str (quadrat 4) ".09.2003")))
