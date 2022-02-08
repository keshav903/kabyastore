pipeline {
    agent any

    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    
    environment {
       PATH = "C:\\Program Files\\Git\\usr\\bin;C:\\Program Files\\Git\\bin;${env.PATH}"
    }

    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = C:/Program Files (x86)/apache-maven-3.6.0"
            }
        }
        stage('Build') {
            steps {
                dir("C:/Users/kgaire/AppData/Local/Jenkins/.jenkins/workspace/") {
                sh 'mvn -B -DskipTests clean package'
                }
            
            }
        }
     }
    post {
       always {
          junit(
        allowEmptyResults: true,
        testResults: 'C:/Users/kgaire/Desktop/test-report/testReport.txt'
      )
      }
   } 
}
