(defproject clj-leveldb "0.1.2"
  :description "an idiomatic wrapper for LevelDB"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.fusesource.leveldbjni/leveldbjni-all "1.8"]
                 [org.iq80.leveldb/leveldb-api "0.7"]
                 [byte-streams "0.2.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [criterium "0.4.3"]
                                  [codox-md "0.2.0" :exclusions [org.clojure/clojure]]]}}
  :plugins [[codox "0.6.4"]]
  :codox {:writer codox-md.writer/write-docs
          :include [clj-leveldb]}
  :deploy-repositories [["snapshots" {:url :env/DEPLOY_SNAPSHOT_URL
                                      :sign-releases false
                                      :username :env/DEPLOY_USER
                                      :password :env/DEPLOY_PASSWORD}]
                        ["releases" {:url :env/DEPLOY_RELEASE_URL
                                     :sign-releases false
                                     :username :env/DEPLOY_USER
                                     :password :env/DEPLOY_PASSWORD}]])
