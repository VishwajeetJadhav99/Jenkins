pipeline {
    agent any
    stages {
        stage("Pull") {
            steps{
                sh 'echo "this is a pull stage"'
                git branch: 'main', url: 'https://github.com/VishwajeetJadhav99/Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                sh 'echo "this is a build stage"'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "this is a test stage"'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "this is a deploy stage"'
            }
        }
    }
}