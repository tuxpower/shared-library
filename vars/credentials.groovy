import com.cloudbees.plugins.credentials.SystemCredentialsProvider.StoreImpl

def call() {

  StoreImpl store = new StoreImpl()
  domains = store.getDomains()
  for (domain in domains) {
    if (domain.getName() != null) {
      credentials = store.getCredentials(domain)
      //println "username: ${c.getName()}"
      /*if (c instanceof com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl) {
        //println creds
        echo 'oooooo'
      }*/
      for (credential in credentials) {
        println "${credential.getUsername()}"
      }
    }
  }
}

