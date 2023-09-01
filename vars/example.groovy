def call() {

  cs = CredentialsStore.getDomains()
  for (c in cs) {
    println "username: ${c}"
  }
}

