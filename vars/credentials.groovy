import com.cloudbees.plugins.credentials.SystemCredentialsProvider.StoreImpl

def call() {

  StoreImpl store = new StoreImpl()
  domains = store.getDomains()
  for (domain in domains) {
    if (domain.getName() != null) {
      creds = store.getCredentials(domain)
      //println "username: ${c.getName()}"
      /*if (c instanceof com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl) {
        //println creds
        echo 'oooooo'
      }*/
      for (c in creds) {
        println "${c.getUsername()}"
      }
    }
  }
}

