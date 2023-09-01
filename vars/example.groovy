import com.cloudbees.plugins.credentials.CredentialsStore

def call() {

  CredentialsStore cs = new CredentialsStore()
  print cs.getDisplayName()
}

