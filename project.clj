(defproject weshop/spider ""
  :dependencies [[org.clojure/clojure "1.8.0"]

                 [org.clojure/tools.nrepl "0.2.13"]
                 [cider/cider-nrepl "0.14.0"]
                 [refactor-nrepl "2.3.0"]

                 [com.taoensso/timbre "4.10.0"]

                 [aleph "0.4.3"]
                 [ring/ring-core "1.6.1"]

                 [clj-http "3.7.0"]
                 [org.apache.httpcomponents/httpclient "4.5.3"]

                 [org.postgresql/postgresql "42.1.4"]
                 [org.clojure/java.jdbc "0.7.0"]

                 [jarohen/wiring "0.0.1-alpha2"]]

  :exclusions [org.clojure/clojurescript]

  :source-paths ["src/clj"]

  :plugins [[cider/cider-nrepl "0.14.0"]]

  :uberjar-name "spider-standalone.jar"
  :auto-clean false

  :aliases {"dev" ["run" "-m" "spider.api.main"]

            "build" ["do"
                     ["clean"]
                     ["compile"]
                     ["uberjar"]]})
