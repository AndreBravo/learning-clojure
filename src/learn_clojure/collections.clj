(ns learn-clojure.collections
  (:use clojure.pprint))

; Vectors

; Vectors are an indexed, sequential data structure. Vectors are represented with [ ]
(def vectors [1 2 3])

; Use the 'get' function to retrieve an element by at an index
; It will return 1
(pprint (get vectors 0))

; Return 'nil' when we are calling a invalid index
(pprint (get vectors 3))

; All Collections can be counted by 'count' function
(pprint (count vectors))

; Another way to create a vector is calling the function 'vector'
; It will return  [1 2 3]
(pprint (vector 1 2 3))


; Immutability
; Clojure collections share important properties of simple values like strings and numbers,
; such as immutability and equality comparison by value.

; By modifying the previous vector will return a new vector with the old and the new values
; It will return a new vector with [1 2 3 4 5 6]
(pprint (conj vectors 4 5 6))
; It will return the original vector with [1 2 3]
(pprint vectors)

; Lists
; List are a sequential linked lists that add new elements at the head of the list, instead of at the tail like vectors

;Lists are evaluated by invoking the first element as a function, we must quote a list to prevent evaluation
(def cars '(:hrv :onyx :civic))

; List are no indexed so they must be walked using first and rest functions
; It will return :hrv
(pprint (first cars))
; It will return (:onyx :civic)
(pprint (rest cars))

;  List also can be used as a stack with 'peek' and 'pop' functions
; It will return :hrv
(pprint peek cars)
; It will return :civic
(pprint pop cars)