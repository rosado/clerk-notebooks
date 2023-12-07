^{:nextjournal.clerk/visibility #{:hide-ns}}
(ns scratch
  (:require [nextjournal.clerk :as clerk :refer [html]]))

^{:nextjournal.clerk/visibility #{:hide}}
(clerk/html [:h1.bg-pink-100.p-4.dark:bg-pink-600 "Scratchpad"])

(def x "Hello from Clerk")

^{:nextjournal.clerk/visibility #{:code :hide}}
(html [:em "This is pretty sick!"])

(html
 (defn a-function [x] (println x)))

(range 100)

(clerk/plotly {:data [{:x [1000 10000]
                       :y [500 1200]
                       :type "scatter"
                       :mode "markers"}]
               :config {:displayModeBar true
                        :displayLogo false}})
