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

def call(allCredentials) {
  for (String i : allCredentials.keySet()) {
            println "key: " + i.getId() + "value: " + allCredentials.get(i).getName()
        }
}
