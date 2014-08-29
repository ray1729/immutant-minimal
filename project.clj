(defproject immutant-minimal "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.immutant/messaging "2.0.0-alpha1"]
                 [org.immutant/wildfly "2.0.0-alpha1"]]
  :plugins [[lein-immutant "2.0.0-alpha1"]]
  :main immutant-minimal.core)
