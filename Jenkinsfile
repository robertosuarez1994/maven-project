pipeline {
  agent {
    docker {
      image 'maven:alpine'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn verify package'
        hipchatSend 'Hello'
      }
    }
    stage('Approve') {
     input 'Do you approve?' 
    }
  }
}
