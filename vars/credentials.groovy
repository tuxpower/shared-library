import com.cloudbees.plugins.credentials.SystemCredentialsProvider.StoreImpl

def call() {
    StoreImpl store = new StoreImpl()

    // get list of all domains/folders
    domains = store.getDomains()
    for (domain in domains) {
        // if domain is global doesn't have a name
        //if (domain.getName() != null) {

        println "Name: ${domain.getName()}"
        creds = store.getCredentials(domain)
        for (c in creds) {
            if (c instanceof com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl) {
                println "Credentials of type Username/Password"
                println "ID: ${c.getId()}"
                println "Username: ${c.getUsername()}"
                println "Password: ${c.getPassword()}"
            }
            
            if (c instanceof com.cloudbees.jenkins.plugins.sshcredentials.impl.BasicSSHUserPrivateKey) {
                println "Credentials of type User/Private Key"
                println "ID: ${c.getId()}"
                println "Username: ${c.getUsername()}"
                println "Passphrase: ${c.getPassphrase()}"
                println "Privatekey: ${c.getPrivateKey()}"
            }
        }
    }
}


