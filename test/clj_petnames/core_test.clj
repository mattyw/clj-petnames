(ns clj-petnames.core-test
  (:require [clojure.test :refer :all]
            [clj-petnames.core :refer :all]))


(deftest a-test
  (testing "simple seperator"
    (with-redefs [word-map nonrandom]
      (is (= (generate 2 0 "-" "") "able-ox"))
      (is (= (generate 2 0 ":" "") "able:ox")))))

(deftest words-test
  (testing "word counts"
    (with-redefs [word-map nonrandom]
      (is (= (generate 1 0 "-" "") "ox"))
      (is (= (generate 2 0 "-" "") "able-ox"))
      (is (= (generate 3 0 "-" "") "abnormally-above-ant"))
      (is (= (generate 4 0 "-" "") "abnormally-absolutely-absolute-ape"))
      (is (= (generate 5 0 "-" "") "abnormally-absolutely-accurately-accepted-asp")))))

(deftest letters-test
  (testing "letter counts"
    (with-redefs [word-map nonrandom]
      (is (= (generate 1 2 "-" "") "ox"))
      (is (= (generate 3 4 "-" "") "duly-ace-ant")))))

(deftest ubuntu-test
  (testing "test ubuntu mode"
    (with-redefs [word-map nonrandom]
      (is (= (generate 1 0 "-" "u") "ultimate-urchin"))
      (is (= (generate 3 0 "-" "b") "balanced-bat")))))
