#!/usr/bin/env groovy

def call() {

  cs = com.cloudbees.plugins.credentials.CredentialsStore.getDomains()
  print cs
}

