import com.cloudbees.plugins.credentials.CredentialsStore

def call() {

  CredentialsStore cs = new CredentialsStore()
  println cs.getDisplayName()
  /*for (c in cs) {
    println "username: ${c.getDisplayName()}"
  }*/
}

