pipeline {
    agent any
    
    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                sh 'cp -R $WORKSPACE/target/calculator-app-1.0-SNAPSHOT.jar /Users/i527379/Desktop'
            }
        }
    }
}
