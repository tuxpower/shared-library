import com.cloudbees.plugins.credentials.SystemCredentialsProvider.StoreImpl 

def call() {

  StoreImpl z = new StoreImpl()
  cs = z.getDomains()
  for (c in cs) {
    if (c.getName() != null) {
      creds = z.getCredentials(c)
      //println "username: ${c.getName()}"
      if (c instanceof com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl) {
        //println creds
        echo 'oooooo'
      }
    }
  }
}

