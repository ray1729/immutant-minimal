(ns immutant-minimal.core-test
  (:require [clojure.test :refer :all]
            [immutant.messaging :as msg]
            [immutant.util :as util]
            [immutant-minimal.core :as core]))

(when-not (util/in-container?)
  (use-fixtures :once (fn [f] (core/-main) (f))))

(deftest queue-test
  (testing "Listen on a queue"
    (let [received (atom [])
          listener (fn [m] (swap! received conj m))]
      (msg/listen core/queue listener)
      (msg/publish core/queue "First")
      (msg/publish core/queue "Second")
      (is (= @received ["First" "Second"])))))
