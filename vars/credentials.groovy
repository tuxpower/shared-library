import com.cloudbees.hudson.plugins.folder.properties.FolderCredentialsProvider
import com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl
import com.cloudbees.jenkins.plugins.sshcredentials.impl.BasicSSHUserPrivateKey
import com.cloudbees.plugins.credentials.impl.CertificateCredentialsImpl
import com.dabsquared.gitlabjenkins.connection.GitLabApiTokenImpl
import org.jenkinsci.plugins.plaincredentials.impl.StringCredentialsImpl
import com.cloudbees.plugins.credentials.SystemCredentialsProvider.StoreImpl
import com.cloudbees.plugins.credentials.Credentials
import com.cloudbees.hudson.plugins.folder.Folder
import com.cloudbees.plugins.credentials.domains.Domain

def call() {
        HashMap<Credentials, Domain> allCredentials = new HashMap<Credentials, Domain>();
        //List<UsernamePasswordCredentialsImpl> allCredentials = new ArrayList<UsernamePasswordCredentialsImpl>();
        StoreImpl store = new StoreImpl()
        store.getDomains().each { d ->
            //println "Name: ${d.getName()}"
            store.getCredentials(d).each { c ->
                //println c.getClass()
                if (c instanceof com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl) {
                    /*sh '''
                    echo "hello world"
                    '''*/
                    allCredentials.put(c, d)
                    //println "ID: ${c.getId()}"
                }
            }
        }
        
        /*for (String i : allCredentials.keySet()) {
            //println "key: " + i.getId() + "value: " + allCredentials.get(i).getName()
        }*/
        return allCredentials
        
}

def test(){
    sh script:'''
        echo "hello world"
    '''
}
    
    /*def folders = Jenkins.instance.getItems(Folder.class)
    folders.each{ f ->
            FolderCredentialsProvider folderProvider = new FolderCredentialsProvider();
            store = folderProvider.getStore(f)
            store.getDomains().each { d ->
                //if (d.getName() != null) {
                    println "Name: ${d.getName()}"
                    store.getCredentials(d).each { c ->
                        println "ID: ${c.getId()}"
                    }
                //}
            }
    }*/
          

/*Set<Job> allJobs = new HashSet<Job>()    
jobs = Jenkins.instance.getAllItems(Folder.class).each{ f ->
    println f.getName()
    allJobs.addAll(jobs)
}
println jobs.size()

Set<Credentials> allCredentials = new HashSet<Credentials>();
allJobs.each{ f ->
 creds = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
      com.cloudbees.plugins.credentials.Credentials.class, f)
  allCredentials.addAll(creds)

}

for (c in allCredentials) {
    println c.getID()
}*/
    
/*Set<Credentials> allCredentials = new HashSet<Credentials>();
Jenkins.instance.getAllItems(Job.class).each{ f ->
 creds = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
      com.cloudbees.plugins.credentials.Credentials.class, f)
      //println f.getParent().getFullName()
property.getDomainCredentials().each {
  println "Domain ${it.domain.name}"
  allCredentials.addAll(creds)

}
}
for (c in allCredentials) {
    println "ID: ${c.getClass()}"
    if (c instanceof com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl) {
                    println c.getId()
                }
                
                if (c instanceof com.cloudbees.jenkins.plugins.sshcredentials.impl.BasicSSHUserPrivateKey) {
                    println c.getId()
                }
                
                if (c instanceof com.cloudbees.plugins.credentials.impl.CertificateCredentialsImpl){
                    println c.getId()
                }
                
                 if (c instanceof org.jenkinsci.plugins.plaincredentials.impl.FileCredentialsImpl){
                    println c.getId()
                }
                
                 if (c instanceof org.jenkinsci.plugins.plaincredentials.impl.StringCredentialsImpl){
                    println c.getId()
                }
}*/

/*com.cloudbees.plugins.credentials.CredentialsStore.getDomains.each { it ->
    println it.getName()
}*/

//}
//}

