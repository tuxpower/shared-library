import com.cloudbees.plugins.credentials

def call() {

  SystemCredentialsProvider.StoreImpl z = new StoreImpl()
  cs = z.getDomains()
  for (c in cs) {
    println "username: ${c}"
  }
}

