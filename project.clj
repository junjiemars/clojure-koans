(defproject clojure-koans "0.5.1-SNAPSHOT"
  :description "The Clojure koans."
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [koan-engine "0.2.3"]]
  :dev-dependencies [[lein-koan "0.1.3"]]
  :profiles {:dev
             {:dependencies
              [[lein-koan "0.1.3"]
               [org.clojure/tools.trace "0.7.8"]]}}
  :repl-options {:init-ns koan-engine.runner
                 :init (do (use '[koan-engine.core]))}
  :plugins [[lein-koan "0.1.3"]]
  :main koan-engine.runner/exec)
