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
                stash includes: 'target/calculator.jar', name: 'artifact'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo "Deployment Successfull"'
            }
        }
    }
}
