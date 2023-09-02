import com.cloudbees.plugins.credentials.SystemCredentialsProvider.StoreImpl

def call() {
    StoreImpl store = new StoreImpl()
    domains = store.getDomains()
    domains.each { d ->
    //for (domain in domains) {
        //if (d.getName() != null) {
        println "Name: ${d.getName()}"
        creds = store.getCredentials(d)
        creds.each { c ->
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
