pipeline {
    agent { docker { image 'maven:3.6.0' } }
    stages {
        stage('compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('test') {
                    steps {
                        sh 'mvn clean test'
                    }
                }
    }
}