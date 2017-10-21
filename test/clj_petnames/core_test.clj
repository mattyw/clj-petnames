(ns clj-petnames.core-test
  (:require [clojure.test :refer :all]
            [clj-petnames.core :refer :all]))


(deftest a-test
  (testing "simple seperator"
    (is (= (generate 2 1 "-" false nonrandom) "abnormally-ox"))
    (is (= (generate 2 1 ":" false nonrandom) "abnormally:ox"))))
