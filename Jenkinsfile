pipeline {
    agent any

    tools {
        maven 'mvn-3.6.1'
    }

    stages {
        stage('pmd') {
            steps {
                sh "mvn pmd:pmd"
            }
        }
    }
}