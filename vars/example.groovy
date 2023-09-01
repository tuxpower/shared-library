import com.cloudbees.plugins.credentials.CredentialsStore

def call() {

  cs = CredentialsStore.getCredentials()
  for (c in cs) {
    println "username: ${c}"
  }
}

