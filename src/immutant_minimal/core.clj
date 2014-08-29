(ns immutant-minimal.core
  (:require [immutant.messaging :as msg]))

(defonce queue nil)

(defn -main [& {:as args}]
  (alter-var-root #'queue (constantly (msg/queue "/my/queue"))))
