import com.cloudbees.plugins.credentials.CredentialsStore

def call() {

  CredentialsStore cs = CredentialsStore
  println cs.getDisplayName()
  /*for (c in cs) {
    println "username: ${c.getDisplayName()}"
  }*/
}

