import com.cloudbees.plugins.credentials.SystemCredentialsProvider.StoreImpl 

def call() {

  StoreImpl z = new StoreImpl()
  cs = z.getDomains()
  for (c in cs) {
    println "username: ${c}"
  }
}

