def call(def config) {
  config.properties.each { println "$it.key -> $it.value" }
}
