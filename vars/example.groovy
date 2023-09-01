import com.cloudbees.plugins.credentials.CredentialsStore

def call() {

  cs = CredentialsStore()
  print cs.getDisplayName()
}

