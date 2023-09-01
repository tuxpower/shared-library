import com.cloudbees.plugins.credentials.CredentialsStore

def call() {

  CredentialsStore cs = CredentialsStore.CredentialsStore()
  for (c in cs) {
    println "username: ${c.getDisplayName()}"
  }
}

