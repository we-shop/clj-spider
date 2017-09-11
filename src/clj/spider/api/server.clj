(ns spider.api.server
  (:require [aleph.http :as http]
            [ring.util.response :refer [response]]
            [taoensso.timbre :as log]
            [wiring.core :as w]))

(defn handler [req]
  (response "Hello world!"))

(defn server [config]
  (log/info "Starting server")
  (let [server (http/start-server #'handler {:port 3000})]
    (w/->Component server
                   (fn []
                     (log/info "Stopping server")
                     (.close server)))))
