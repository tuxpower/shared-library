import com.cloudbees.plugins.credentials.SystemCredentialsProvider.StoreImpl 

def call() {

  StoreImpl z = new StoreImpl()
  cs = z.getDomains()
  for (c in cs) {
    if (c.getName() != null) {
      println "username: ${c.getName()}"
    }
  }
}

