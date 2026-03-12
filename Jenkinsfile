pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/your-username/my-devops-project.git'
            }
        }
        stage('Build') {
            steps {
                sh 'javac src/HelloWorld.java'
            }
        }
        stage('Test') {
            steps {
                sh 'javac -cp .:junit-4.13.2.jar test/HelloWorldTest.java'
                sh 'java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore HelloWorldTest'
            }
        }
        stage('Archive Logs') {
            steps {
                archiveArtifacts artifacts: '**/*.log', fingerprint: true
            }
        }
    }
    post {
        always {
            echo 'Pipeline finished.'
        }
    }
}
