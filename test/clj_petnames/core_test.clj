(ns clj-petnames.core-test
  (:require [clojure.test :refer :all]
            [clj-petnames.core :refer :all]))


(deftest a-test
  (testing "simple seperator"
    (is (= (generate 2 0 "-" false nonrandom) "able-ox"))
    (is (= (generate 2 0 ":" false nonrandom) "able:ox"))))

(deftest words-test
  (testing "word counts"
    (is (= (generate 1 0 "-" false nonrandom) "ox"))
    (is (= (generate 2 0 "-" false nonrandom) "able-ox"))
    (is (= (generate 3 0 "-" false nonrandom) "abnormally-able-ox"))
    (is (= (generate 4 0 "-" false nonrandom) "abnormally-abnormally-able-ox"))
    (is (= (generate 5 0 "-" false nonrandom) "abnormally-abnormally-abnormally-able-ox"))))

(deftest letters-test
  (testing "letter counts"
    (is (= (generate 1 2 "-" false nonrandom) "ox"))
    (is (= (generate 3 4 "-" false nonrandom) "duly-able-ox"))))

(deftest ubuntu-test
  (testing "test ubuntu mode"
    (is (= (generate 1 2 "-" true nonrandom) ""))
    (is (= (generate 3 4 "-" true nonrandom) ""))))
