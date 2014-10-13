(ns koans.01-equalities
  (:require [koan-engine.core :refer :all]))

(meditations
  "We shall contemplate truth by testing reality, via equality"
  (= true true) ;seems about right, especially since this isn't js

  "To understand reality, we must compare our expectations against reality"
  (= 2 (+ 1 1)) ;passing an expression to equals

  "You can test equality of many things"
  (= (+ 3 4) 7 (+ 2 5)) ;multiple arguments to equals

  "Some things may appear different, but be the same"
  (= true (= 2 2/1)) ;dividing by integer yields integer

  "You cannot generally float to heavens of integers"
  (= false (= 2 2.0)) ;float is not equal to integer

  "But a looser equality is also possible"
  (= true (== 2.0 2)) ;different levels of equality

  "Something is not equal to nothing"
  (= true (not (= 1 nil))) ;not reverses things

  "Strings, and keywords, and symbols: oh my!"
  (= false (= "foo" :foo 'foo)) ;keywords and symbols, must investigate

  "Make a keyword with your keyboard"
  (= :foo (keyword 'foo))

  "Symbolism is all around us"
  (= 'foo (symbol 'foo))

  "When things cannot be equal, they must be different"
  (not= :fill-in-the-blank :foo))
