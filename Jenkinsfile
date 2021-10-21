pipeline {
    agent any
    stages {
        stage('compile stage') {
            steps {
            withMaven(maven:'maven'){
                sh 'mvn clean compile'
                }
            }
        }

        stage('test') {
                    steps {
                                withMaven(maven:'maven'){
                        sh 'mvn clean test',
                        cucumber buildStatus:"UNSTABLE",
                        fileIncludePattern:"**/cucumber.json",
                         jsonReportDirectory:'target'
                        }
                    }
                }

    }
}