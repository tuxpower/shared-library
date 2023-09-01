def call() {

  cs = com.cloudbees.plugins.credentials.CredentialsStore.getDomains()
  for (c in cs) {
    println "username: ${c}"
  }
}

