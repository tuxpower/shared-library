import com.cloudbees.plugins.credentials.CredentialsStore

def call() {

  cs = CredentialsStore.getDomains()
  for (c in cs) {
    println "username: ${c}"
  }
}

