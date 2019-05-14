pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn package && java -jar target/gs-spring-boot-0.1.0.jar'
            }
        }
    }
}