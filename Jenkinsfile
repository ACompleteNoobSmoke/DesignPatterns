/*Jenkinsfile (Declarative Pipeline) */
/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image '3.9.9-amazoncorretto-8-al2023' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
