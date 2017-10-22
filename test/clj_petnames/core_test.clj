(ns clj-petnames.core-test
  (:require [clojure.test :refer :all]
            [clj-petnames.core :refer :all]))


(deftest a-test
  (testing "simple seperator"
    (is (= (generate 2 0 "-" "" nonrandom) "able-ox"))
    (is (= (generate 2 0 ":" "" nonrandom) "able:ox"))))

(deftest words-test
  (testing "word counts"
    (is (= (generate 1 0 "-" "" nonrandom) "ox"))
    (is (= (generate 2 0 "-" "" nonrandom) "able-ox"))
    (is (= (generate 3 0 "-" "" nonrandom) "abnormally-above-ant"))
    (is (= (generate 4 0 "-" "" nonrandom) "abnormally-absolutely-absolute-ape"))
    (is (= (generate 5 0 "-" "" nonrandom) "abnormally-absolutely-accurately-accepted-asp"))))

(deftest letters-test
  (testing "letter counts"
    (is (= (generate 1 2 "-" "" nonrandom) "ox"))
    (is (= (generate 3 4 "-" "" nonrandom) "duly-ace-ant"))))

(deftest ubuntu-test
  (testing "test ubuntu mode"
    (is (= (generate 1 0 "-" "u" nonrandom) "ultimate-urchin"))
    (is (= (generate 3 0 "-" "b" nonrandom) "balanced-bat"))))
