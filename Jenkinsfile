pipeline {
    agent any

    tools {
        maven "MAVEN"
        jdk "JDK"
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
                dir("C:/Users/kgaire/AppData/Local/Jenkins/.jenkins/workspace/testpipeline1") {
                sh 'mvn -B -DskipTests clean package'
                }
            
            }
        }
     }
    post {
       always {
          junit(
        allowEmptyResults: true,
        testResults: '*/test-reports/.xml'
      )
      }
   } 
}
