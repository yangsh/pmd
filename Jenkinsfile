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

    post {
        always {
            pmd(canRunOnFailed: true, pattern: '**/target/pmd.xml')
        }
    }
}