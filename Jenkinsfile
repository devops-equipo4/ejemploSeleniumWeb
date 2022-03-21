pipeline {
    agent any
    stages {
        stage('Paso 1: Compliar') {
            steps {
                script {
                    sh "echo 'Compile Code!'"
                    // Run Maven on a Unix agent.
                    sh 'mvn clean compile -e'
                }
            }
        }
        stage('Paso 2: Testear con Selenium') {
            steps {
                script {
                    sh "echo 'Test Code!'"
                    // Run Maven on a Unix agent.
                    sh 'mvn clean test -f "pom.xml"'
                }
            }
        }
    }
    post {
        always {
            sh "echo 'fase always executed post'"
        }
        success {
            sh "echo 'fase success'"
        }
        failure {
            sh "echo 'fase failure'"
        }
    }
}